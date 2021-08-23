package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=tshomeware;user=sa;password=12345";
            con = DriverManager.getConnection(dbURL);
			/*String url = "jdbc:sqlserver:////localhost:1433;databaseName=tshomeware";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(url, "sa", "12345");*/
			/*System.out.println("ket noi thanh cong");*/
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ket noi that bai");
		}
		return con;
	}

	public static void main(String[] arg) {
		System.out.println(getConnection());
	}
}
