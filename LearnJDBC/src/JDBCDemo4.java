import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo4 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/employees_database";
		int rowsAffected;
		try {
			//establish connection object
			Connection conn = DriverManager.getConnection(url, "root", "Rc2w4fef");
			// create a statement object to send to database
			Statement statement = conn.createStatement();
			
			rowsAffected =	statement.executeUpdate("UPDATE employees_tbl "
					+ "SET salary=7200"
					+ " where id = 800;");

			System.out.println("Executed an Update Statement = Rows AFfected: "+ rowsAffected);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
