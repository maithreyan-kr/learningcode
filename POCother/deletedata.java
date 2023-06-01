package POCother;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class deletedata {
	String index;
	

public static void main(String[] args){
try {
//Class.forName("com.mysql.jdbc.Driver");
String dbUrl = "jdbc:mysql://localhost:3306/studentdb";
String user = "root";
String pass = "Vdb@1997";
Connection myConn = null;

Connection conn = DriverManager.getConnection(dbUrl, user, pass);
ResultSet Rs = null;
Statement Stmnt1 = conn.createStatement();
FileInputStream del = new FileInputStream("C:\\Users\\D.Vivekanandhan\\Desktop\\POC\\input.txt");
BufferedReader bf = new BufferedReader(new InputStreamReader(new DataInputStream(del)));
String value;
ArrayList token = new ArrayList();
while ((value = bf.readLine()) != null) {
token.add(value);
}
Iterator itr;
for (itr = token.iterator(); itr.hasNext(); ) {
String str = itr.next().toString();
String[] spliting = str.split("\t");
String  index=null;
index = spliting[0];

Rs = Stmnt1.executeQuery("select * from student");
while(Rs.next()){
	
if(index.equals(Rs.getString("studentid"))){
	Stmnt1.executeUpdate("delete from student where studentid=35");	
	Stmnt1.executeUpdate("delete from student where studentid=45");
}

}
}
System.out.println("deleted row 35 and 45 successfully!!!");

}
catch (Exception e) {
System.out.println(e);
}
}
}