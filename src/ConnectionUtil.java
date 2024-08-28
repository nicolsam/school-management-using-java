import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {

    private String url = "jdbc:postgresql://localhost:5432/";

    public Connection conn(String dbname, String user, String pass) {

        Connection connection = null;

        try {

            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url + dbname, user, pass);

            if(connection != null) {
                System.out.println("Connection Established.");
            } else {
                System.out.println("Connection Failed");
            }

        } catch (Exception error) {
            System.out.println(error.getMessage());
        }

        return connection;

    }

}
