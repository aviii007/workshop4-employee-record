import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    public static void main(String[] args) {
        System.out.println("welcome to the workshop 4");
        String dbURL = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "mysql123";

        try {

            java.sql.Connection conn = DriverManager.getConnection(dbURL, username, password);

            if (conn != null) {
                System.out.println("Connected");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}