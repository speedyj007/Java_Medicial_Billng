package netmeds_billing_record;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Netmeds_Billing_Record {

     private static String url = "jdbc:mysql://localhost:3306/netmeds_medicine_account";
     private static String username = "root";
     private static String password = "prabeer";
    
    
   static Connection con = null;
   static Statement stmt = null;

    public static void main(String[] args) {
/*
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            stmt = (Statement) con.createStatement();
            DatabaseMetaData metadata = con.getMetaData();
            ResultSet rs = metadata.getColumns(null, null, "medicine_for_jan_2019", "%");
            System.out.println("Connected \n");
            while(rs.next())
            {
                String name = rs.getString("COLUMN_NAME");
                
                System.out.println(name);
            }
        }
        catch(Exception e)
        {
            System.out.println("An error: "+e);
        }
      
        
  */      
  /*  
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            stmt = (Statement) con.createStatement();
            String sql  = "alter table medicine_for_jan_2019 add column(total varchar(50) not null)";
            stmt.executeUpdate(sql);
          
            System.out.println("Table created succesfully"); 
             
             

    }
                catch(Exception e)
                {
                    System.out.println(e);
                  }
*/
    }
    
}
