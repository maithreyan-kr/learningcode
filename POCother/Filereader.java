package POCother;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;
import java.math.BigInteger;


public class Filereader {
	String sid;
	String fname;
	String lname;
	String deptN;
	String joinDate;
	String dob;
	BigInteger phNo  ;
	String email;

public static void main(String[] args) {
try {
//Class.forName("com.mysql.jdbc.Driver");
String dbUrl = "jdbc:mysql://localhost:3306/studentdb";
String user = "root";
String pass = "Vdb@1997";
Connection myConn = null;

Connection conn = DriverManager.getConnection(dbUrl, user, pass);
ResultSet rs = null;
Statement Stmnt1 = conn.createStatement();
FileInputStream f = new FileInputStream("C:\\Users\\D.Vivekanandhan\\Desktop\\POC\\input1.txt");
DataInputStream in = new DataInputStream(f);
BufferedReader br = new BufferedReader(new InputStreamReader(in));
String strLine;
ArrayList list = new ArrayList();
while ((strLine = br.readLine()) != null) {
list.add(strLine);
}
Iterator itr;
for (itr = list.iterator(); itr.hasNext(); ) {
String str = itr.next().toString();
String[] spliting = str.split("\t");
String  sid ="",fname = "", lname = "", deptN = "", joinDate = "", dob = "", phNo = "", email = "";
for (int i = 0; i <= 8; i++) {
sid = spliting[0];
fname = spliting[1];
lname = spliting[2];
deptN = spliting[3];
joinDate = spliting[4];
dob = spliting[5];
phNo = spliting[6];
email = spliting[7];
FileInputStream del = new FileInputStream("C:\\Users\\D.Vivekanandhan\\Desktop\\POC\\input.txt");
BufferedReader bf = new BufferedReader(new InputStreamReader(new DataInputStream(del)));
String value;
ArrayList<String> token = new ArrayList();
while ((value = bf.readLine()) != null) {
	token.add(value);
	}

}
rs = Stmnt1.executeQuery("select * from department");
while(rs.next()){
if(deptN.equals(rs.getString("departmentName"))){
deptN=new String(rs.getString("departmentId"));
}
}
int k = Stmnt1.executeUpdate("insert into student(studentid, firstname, lastname, departmentid, doj,dob,mobileno, email) values('" + sid + "','" + fname + "','" + lname + "','" + deptN + "','" + joinDate + "','"+dob +"','"+phNo+"','"+email+"')");
System.out.println(fname+" inserted into db");
rs.close();
}
}
catch (Exception e) {
System.out.println(e);
}

}
}