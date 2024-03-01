/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatask;
import java.sql.*;
import java.sql.ResultSet;
/**
 *
 * @author balak
 */
public class DBConnect {
    public static void main(String args[]){
	try{
	        //step1 load the driver class
	        Class.forName("com.mysql.cj.jdbc.Driver");		
	        //step2 create the connection object
	        Connection con=DriverManager.getConnection(	"jdbc:mysql://localhost:3306/department", "root","Bala@9344");			
                //step3 create the statement object
	        Statement stmt=con.createStatement();
	
	//step4 execute query
	//ResultSet rs=stmt.executeQuery("create table employee (empid number(4), empname varchar2(25))");
	//ResultSet rs=stmt.executeQuery("insert into employee values(1002, 'Rajesh')");
//	 stmt.executeUpdate("update employee set empname=‘Aravind' where empid=120");
	ResultSet rs=stmt.executeQuery("select * from dep_info");
	while(rs.next())
	System.out.println(rs.getInt(1)+" "+rs.getString(2));
	//ResultSet rs=stmt.executeQuery("delete from employee");
	//step5 close the connection object
	con.close();		
	}catch(Exception e){ System.out.println(e);
        
        }
    }	
    
}
