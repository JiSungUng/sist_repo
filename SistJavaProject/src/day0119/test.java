package day0119;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QuizSawonGroup {
   
   DbConnect db =new DbConnect();
   //connectSawonGroup
   public void connectSawonGroup() {
      String sql = "select gender, count(*) , round(avg(pay),0) avgpay , max(pay) maxpay , min(pay) maxmin  from sawon group by gender";
      
      Connection conn = db.getConnection();
      Statement stmt = null;
      ResultSet rs = null;
      
      try {
         stmt = conn.createStatement();
         rs = stmt.executeQuery(sql);
         
         System.out.println("성별\t인원수\t평균급여\t최고급여\t최저급여");
         System.out.println("======================================");
         while(rs.next())
         {
            String gender = rs.getString("gender");
            int count = rs.getInt("count");
            int avgpay = rs.getInt("avgpay");
            int maxpay = rs.getInt("maxpay");
            int minpay = rs.getInt("minpay");
            
            System.out.println(gender + "\t" + count + "\t" + avgpay + "\t" + maxpay + "\t" + minpay);
            
         }
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }finally {
         db.dbClose(rs, stmt, conn);
      }

      
   }
      
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      //성별 인원수 평균급여 최고급여 최저급여
      QuizSawonGroup qs = new QuizSawonGroup();
      qs.connectSawonGroup();
   }

}