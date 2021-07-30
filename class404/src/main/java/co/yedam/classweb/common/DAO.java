package co.yedam.classweb.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	public static Connection getConnection() {
		Connection conn = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "demo";
		String password = "demo";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("연결성공!!!");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("연결실패!!!");
			e.printStackTrace();
		}
		return conn;		
	}
}
