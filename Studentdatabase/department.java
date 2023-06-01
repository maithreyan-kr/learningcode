package Studentdatabase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class department {
    String path ="C:\\Users\\D.Vivekanandhan\\eclipse-workspace\\POC\\data.txt";
    int Id;
    String departName;
    Map<Integer,String> m = new HashMap<Integer,String>();
    public void departmentId() {
          try {
        	  
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","Vdb@1997");
                PreparedStatement ps=con.prepareStatement("select * from department");
                ResultSet rs=ps.executeQuery();
                while(rs.next()) {
                	m.put(rs.getInt(1),rs.getString(2));
                }
                for(Map.Entry m:m.entrySet()) {
                	System.out.println(m.getKey()+" "+m.getValue());
                
                }
                } catch (Exception e) {
                System.out.println(e);
                }
    }
                public int getDepartmentId(String deptName) {
                	for(Map.Entry<Integer,String> map:m.entrySet()) {
                		if(map.getValue().equals(deptName)) 
                			return  map.getKey();
                		
                	}
					return 0;

                }

    
    
}