import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Quiz {
	DbConnection db = new DbConnection();
	Scanner sc = new Scanner(System.in);

	// insert
	public void insert() {
		Connection conn=db.getConnection();
		PreparedStatement pstmt =null;
		
		System.out.println("이름 입력");
		String name = sc.nextLine();
		System.out.println("부서 입력");
		String depart  = sc.nextLine();
		System.out.println("직위 입력");
		String position = sc.nextLine();
		System.out.println("성별 입력");
		String gender = sc.nextLine();
		System.out.println("급여 입력");
		int pay = Integer.parseInt(sc.nextLine());
		System.out.println("보너스 입력");
		int bonus = Integer.parseInt(sc.nextLine());
		
		String sql ="insert into member values(seq_men.nextval,?,?,?,?,?,?)";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1,name);
			pstmt.setString(2,depart);
			pstmt.setString(3,position);
			pstmt.setString(4,gender);
			pstmt.setInt(5,pay);
			pstmt.setInt(6,bonus);
			
			int n=pstmt.executeUpdate();
			if(n==1)
				System.out.println("insert 성공!");
			else
				System.out.println("insert 실패!");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
		
		
		
	}

	// select
	public void select() {
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from member order by sno asc";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			System.out.println("시퀀스\t사원명\t부서\t직위\t성별\t급여\t보너스");
			System.out.println("-------------------------------------------------------");
			while(rs.next())
			{
				System.out.println(rs.getInt("sno")+"\t"
						+rs.getString("name")+"\t"
						+rs.getString("depart")+"\t"
						+rs.getString("position")+"\t"
						+rs.getString("gender")+"\t"
						+rs.getInt("pay")+"\t"
						+rs.getInt("bounus"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		
	

	}
	public boolean getData(String sno) {
		boolean b =false;
		
		Connection conn =db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		
		String sql="select *from member where sno=?";
		
		try {
			pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, sno);
			rs=pstmt.executeQuery();
		
			//1개일 경우는 if
			if(rs.next())
				b=true;
			else
				b=false;
			
			
			
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		
		return b;
	}
	
	// update
	public void update() {
		Connection conn =db.getConnection();
		PreparedStatement pstmt =null;
		
		System.out.println("수정할 시퀀스번호?");
		String sno =sc.nextLine();
		
		//여기에서 getData를 호출해서 그 번호가 존재하는지 확인
		if(!this.getData(sno)) {
			System.out.println("해당번호는 존재하지않습니다.");
			return ;//메서드종료
		}
		System.out.println("수정할 사원명은?");
		String name = sc.nextLine();
		System.out.println("수정할 부서는?");
		String depart = sc.nextLine();
		System.out.println("수정할 직위는?");
		String position = sc.nextLine();
		System.out.println("수정할 성별은?");
		String gender = sc.nextLine();
		System.out.println("수정할 급여는??");
		int pay =Integer.parseInt(sc.nextLine());
		System.out.println("수정할 보너스는??");
		int bounus =Integer.parseInt(sc.nextLine());
		
		String sql="update member set name =?,depart=?,position=?,gender =?,pay =?,bounus=? where sno=?";
		
		try {
			pstmt =conn.prepareStatement(sql);
			
			//4개 순서대로 바인딩
			pstmt.setString(1,name);
			pstmt.setString(2,depart);
			pstmt.setString(3,position);
			pstmt.setString(4,gender);
			pstmt.setInt(5,pay);
			pstmt.setInt(6,bounus);
			pstmt.setString(7,sno);
			
			pstmt.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}

	}

	// delete
	public void delete() {
		Connection conn =db.getConnection();
		PreparedStatement pstmt =null;
		
		System.out.println("삭제할 번호는?");
		int sno = Integer.parseInt(sc.nextLine());
		
		String sql="delete from member where sno=?";
		
		try {
			pstmt =conn.prepareStatement(sql);
			pstmt.setInt(1,sno);
			
			int n=pstmt.executeUpdate();
			
			if(n==1) {
				System.out.println("삭제성공");
			}else {
					System.out.println("삭제실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
		
		

	}

	// partselect
	public void partsSelect() {
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from member where name like ?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			System.out.println("검색할 이름 검색");
			String ch =sc.nextLine();
			String names = '%'+ch+'%';
			
			pstmt.setString(1,names);
			rs=pstmt.executeQuery();
			System.out.println("-------------------------------------------------------");
			while(rs.next())
			{
				System.out.println(rs.getInt("sno")+"\t"
						+rs.getString("name")+"\t"
						+rs.getString("depart")+"\t"
						+rs.getString("position")+"\t"
						+rs.getString("gender")+"\t"
						+rs.getInt("pay")+"\t"
						+rs.getInt("bounus"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		
	

	}

	public void process() {
		Scanner sc = new Scanner(System.in);
		int n;

		while (true) {
			System.out.println("***사원정보***");
			System.out.println("1.사원정보입력   2.사원정보삭제   3.사원정보수정   4.부분사원출력 5.전체사원 출력   9.종료");
			n = Integer.parseInt(sc.nextLine());

			if (n == 1) {
				this.insert();
			} else if (n == 2) {
				this.delete();
			} else if (n == 3) {
				this.update();
			}else if(n==4) {
				this.partsSelect();
			}
			else if (n == 5) {
				this.select();
			} else if (n == 9) {
				System.out.println("프로그램종료");
				break;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Quiz quiz = new Quiz();

		quiz.process();

	}

}
