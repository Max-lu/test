package cn.maxlu.test.database.transaction.deathlock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        String sql1 = "update AABB2 set name='aaa' where id = 1";
        String sql2 = "update AABB2 set name='bbb' where id = 2";

        new Thread(() -> {
            try {
                String name = Thread.currentThread().getName();
                Connection connection = getConnection();
                PreparedStatement ps = connection.prepareStatement(sql1);
                ps.executeUpdate();
                System.out.println("sql1 execute finish-" + name);

                TimeUnit.SECONDS.sleep(5);

                PreparedStatement ps2 = connection.prepareStatement(sql2);
                ps2.executeUpdate();
                System.out.println("sql2 execute finish-" + name);

                connection.commit();

                ps.close();
                ps2.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                String name = Thread.currentThread().getName();
                Connection connection = getConnection();
                PreparedStatement ps = connection.prepareStatement(sql2);
                ps.executeUpdate();
                System.out.println("sql2 execute finish-" + name);

                TimeUnit.SECONDS.sleep(5);

                PreparedStatement ps2 = connection.prepareStatement(sql1);
                ps2.executeUpdate();
                System.out.println("sql1 execute finish-" + name);

                connection.commit();

                ps.close();
                ps2.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        Thread.currentThread().join();
    }

    private static Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
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
