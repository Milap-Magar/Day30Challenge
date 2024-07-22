import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/javalearn";
        String username = "milap";
        String password = "milx123";

        try {
            // Establish a Connection
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            // Create a Statement
            Statement statement = connection.createStatement();

            // Execute a Query
            String sql = "SELECT * FROM yourTable";
            ResultSet resultSet = statement.executeQuery(sql);

            // Process the Results
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }
            // Close the ResultSet, Statement, and Connection
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
