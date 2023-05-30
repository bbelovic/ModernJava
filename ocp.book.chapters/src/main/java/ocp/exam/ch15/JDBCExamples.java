package ocp.exam.ch15;

import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExamples {
    public void example1() {
        try (var c = DriverManager.getConnection("url");
            var psmt = c.prepareStatement("")
            ) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
