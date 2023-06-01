package Studentdatabase;

import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.Scanner;

class studentdb {
String path = "C:\\Users\\D.Vivekanandhan\\eclipse-workspace\\POC\\dBdata.txt";
int studentId;
String studentFirstName;
String studentLastName;
String departmentName;
String joiningDate;
String studentDob;
BigInteger mobileNum ;
String studentEmail;

 public void readFile() {
try (Scanner sc = new Scanner( new File(this.path))) {
studentFirstName = "";
studentLastName = "";
joiningDate = "";
studentDob = "";
studentEmail = "";
departmentName="";
while (sc.hasNextLine()) {
String line;
line = sc.nextLine();
String[] rowData;
rowData = line.split("\t");
for (int i=0; i<rowData.length; i++) {
System.out.println(rowData[i] + " ");
}
System.out.println();
try {
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","Vdb@1997");
PreparedStatement psmt = con.prepareStatement("INSERT INTO STUDENT values(?,?,?,?,?,?,?,?,?)");
psmt.setInt(1, Integer.parseInt(rowData[0]));
psmt.setString(2, rowData[1]);
psmt.setString(3, rowData[2]);
String deptName= rowData[3];
department dep=new department();
int depId= dep.getDepartmentId(deptName);
psmt.setInt(4, depId);
System.out.println(depId);
psmt.setString(5,(rowData[3]) );
psmt.setDate(6, Date.valueOf(LocalDate.now()));
psmt.setDate(7, Date.valueOf(LocalDate.now()));
psmt.setBigDecimal(8, new BigDecimal(rowData[6]));
psmt.setString(9, rowData[7]);
int i = psmt.executeUpdate();
System.out.println(i + "records inserted");
con.setAutoCommit(false);
con.close();
} catch (Exception e) {
e.printStackTrace();
}
}
} catch (Exception e) {
System.out.println(e);
}
}
}
