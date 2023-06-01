package POCother;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.*;


public class Deoartment {
public static void main(String[] args) throws Exception {
Connection myConn = null;
Statement myStmt = null;
ResultSet myRs = null;


String dbUrl = "jdbc:mysql://localhost:3306/studentdb";
String user = "root";
String pass = "Vdb@1997";
try {
myConn = DriverManager.getConnection(dbUrl, user, pass);
myStmt = myConn.createStatement();

 String sql = "CREATE TABLE Department " + "(departmentid INTEGER not NULL, "
 + " departmentname VARCHAR(255)," + " PRIMARY KEY ( departmentid ))";
myStmt.executeUpdate(sql);


System.out.println("Created table in given database...");


System.out.println("Inserting records into the table...");
String sql2 = "INSERT INTO Department VALUES (1,'CS')";
myStmt.executeUpdate(sql2);
sql2 = "INSERT INTO Department VALUES (2,'EEE')";
myStmt.executeUpdate(sql2);
sql2 = "INSERT INTO Department VALUES (3,'IT')";
myStmt.executeUpdate(sql2);
sql2 = "INSERT INTO Department VALUES(4,'ECE')";
myStmt.executeUpdate(sql2);
sql2 = "INSERT INTO Department VALUES(5,'ARCH')";
myStmt.executeUpdate(sql2);
sql2 = "INSERT INTO Department VALUES(6,'MECH')";
myStmt.executeUpdate(sql2);
System.out.println("Inserted records into the table...");
} catch (Exception e) {
e.printStackTrace();
}
finally {
if (myStmt != null) {
myStmt.close();
}


if (myConn != null) {
myConn.close();
}
}


}


}