
package PharmEasy;

import netmeds_billing_record.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;


public class PharmEasy_calculate {
     private static String url = "jdbc:mysql://localhost:3306/netmeds_medicine_account";
     private static String username = "root";
     private static String password = "prabeer";
     private static float finalAmt;
    
    private static Connection con = null;
    private static Statement stmt = null;

public static void main(String []args)
{
 try{
                 Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            stmt = con.createStatement();
             String sql = "select sum(Amount) from medicines_august_2019";
             
             ResultSet rs = stmt.executeQuery(sql);

             while(rs.next())
             {
                 String b = rs.getString("sum(Amount)");
             
                 Float ff = Float.parseFloat(b);
                 DecimalFormat df = new DecimalFormat(".##");
                 
                 Float amt = Float.valueOf(df.format(ff));
                 
                 if(amt<=1000)
                 {
                     finalAmt = amt+20;
                     
                     System.out.println("Medicines Amount : "+amt);
                     System.out.println("Cash handling Charges =  Rs.20");
                     System.out.println("Final Billing AMount : "+finalAmt);
                 }
                 else{
                 System.out.println("Amount : "+amt);
                 }
             }
             
             
                
             
 } 
 catch(Exception e)
 {
     System.out.println(e);
 }
}
    
}
