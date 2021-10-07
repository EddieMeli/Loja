package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDeDados {

	private static Connection conn;

	public static Connection getConection() throws SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://ddnss-server.ddns.net:5432/meliw3", "root", "Eddie88tp");
		return conn;
	}
}
