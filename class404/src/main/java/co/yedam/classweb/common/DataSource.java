package co.yedam.classweb.common;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource {
	
	private static DataSource dataSource = new DataSource(); // 싱글톤 - 자기 자신의 인스턴스를 생성 
	
	private Connection conn;
	
	private String driver;
	private String url;
	private String user;
	private String password;
	
	private DataSource() { // 싱글톤 - 자신의 생성자(외부에서 생성하지 못하도록 함) 
		
	}
	
	public static DataSource getInstance() { // 싱글톤 - 외부에서 사용시 인스턴스를 리턴한다
		
		return dataSource;
	}
	
	// 연결
	public Connection getConnection () {
		
		confiqure();
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	// 외부 properties 파일을 읽어옴 (소스코드에 변수를 사용하지 않기 위해서)
	private void confiqure() {
		
		Properties properties = new Properties();
		String resource = getClass().getResource("/db.properties").getPath();
		
		try {
			properties.load(new FileReader(resource));
			
			driver = properties.getProperty("driver"); //파일안에 변수들을 가지고 옴
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// 싱글톤 클래스 : 하나의 클래스만 생성 
	// (외부에서 내 내부의 생성자를 못만들도록, 외부에서 사용하게 할려면 인스턴스를 이용해서 사용하도록함)
}
