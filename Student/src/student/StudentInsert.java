import java.sql.PreparedStatement;
import java.sql.SQLException;

package student;

public class StudentInsert {
      public int StudentInsert(StudentBean student) throws ClassNotFoundException, SQLException {
    	   Connection con=DBConn.DBConnection();
    	   String sql="insert into student values(? , ?)";
    	   PreparedStatement ps=con.preparedstatement(sql);
    	   ps.setInt(1, student.getRegno());
    	   ps.setString(2, student.getName());
    	   int i=ps.execute
       }
}
