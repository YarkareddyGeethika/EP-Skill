package student;

import java.sql.SQLException;

public class Main {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		StudentInsert si=new StudentInsert();
		StudentBean sb=new StudentBean();
		sb.setRegno(101);
		sb.setName("Geethika");
		int i=si.StudentInsert(sb);
		if(i>0)
			System.out.println("pass");
		else
			System.out.println("fail");
		
	}

}
