package POCother;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class groupby {
public static void main(String[] args){
try {
//Class.forName("com.mysql.jdbc.Driver");
String dbUrl = "jdbc:mysql://localhost:3306/studentdb";
String user = "root";
String pass = "Vdb@1997";
Connection myConn = null;

Connection conn = DriverManager.getConnection(dbUrl, user, pass);
ResultSet my = null;
Statement Stmnt1 = conn.createStatement();


my= Stmnt1.executeQuery("select student.departmentid , department.departmentname , count(student.departmentid) as department\r\n"
		+ " from student left join department on department.departmentid=student.departmentid GROUP BY departmentid");
my = Stmnt1.executeQuery("select student.studentid, student.firstname, student.lastname ,student.departmentid, department.departmentname, student.doj, student.dob, student.mobileno, student. email from student inner join department on student.departmentid=department.departmentid;");

my = Stmnt1.executeQuery("select * from student where departmentid=2");
my.close();
}

catch (Exception e) {
System.out.println(e);
}
}
}