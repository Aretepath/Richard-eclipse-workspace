import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/employees_database";
		int rowsAffected;
		try {
			//establish connection object
			Connection conn = DriverManager.getConnection(url, "root", "Rc2w4fef");
			// create a statement object to send to database
			Statement statement = conn.createStatement();
			
			//execute the statement
			ResultSet resultSet = statement.executeQuery("Select * from employees_tbl");
			
		//	process the result
			int salaryTotal = 0;
			while(resultSet.next()) {
				//salaryTotal = salaryTotal + resultSet.getInt("salary");
				salaryTotal = salaryTotal + Integer.parseInt(resultSet.getString("salary"));
			}
			System.out.println(salaryTotal);
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
