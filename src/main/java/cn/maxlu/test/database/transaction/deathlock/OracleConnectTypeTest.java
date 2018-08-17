package cn.maxlu.test.database.transaction.deathlock;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleConnectTypeTest {
    public static void main(String[] args) throws Exception {
        Connection connection = getConnection();
        connection.close();
    }
    private static Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@//127.0.0.1:1521/orclXDB";
            String username = "luwei";
            String password = "h3password";
            Connection connection = DriverManager.getConnection(url, username, password);
            connection.setAutoCommit(false);
            return connection;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
