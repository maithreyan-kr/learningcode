package Studentdatabase;

public class database {

	 public static void main(String[] args) {
		 studentdb student = new studentdb();
		  department d = new department();
		 try {
			
			d.departmentId();
			 student.readFile();
			 }catch (Exception e) {
			 System.out.println(e);
			 }
	 }
}


