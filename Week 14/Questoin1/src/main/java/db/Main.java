package db;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://127.0.0.1:3306/Employee?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "Ayan7860Khan!";

        // SQL statements
        String createTable =
                "CREATE TABLE IF NOT EXISTS Employee (" +
                        " id INT PRIMARY KEY," +
                        " name VARCHAR(100)," +
                        " age INT," +
                        " salary DOUBLE" +
                        ")";

        String[] inserts = new String[] {
                "INSERT INTO Employee (id, name, age, salary) VALUES (1,'John',25,50000)",
                "INSERT INTO Employee (id, name, age, salary) VALUES (2,'Alice',30,60000)",
                "INSERT INTO Employee (id, name, age, salary) VALUES (3,'Bob',28,55000)",
                "INSERT INTO Employee (id, name, age, salary) VALUES (4,'Carol',26,52000)",
                "INSERT INTO Employee (id, name, age, salary) VALUES (5,'David',32,70000)"
        };

        String delete1 = "DELETE FROM Employee WHERE id = 2";
        String delete2 = "DELETE FROM Employee WHERE id = 4";

        String selectAll = "SELECT id, name, age, salary FROM Employee";

        // Try-with-resources ensures auto-close
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            // Optional: register driver (not required for modern JDBC)
            // Class.forName("com.mysql.cj.jdbc.Driver");

            stmt.executeUpdate(createTable);
            // Insert - ignore errors if primary key already exists in later runs
            for (String s : inserts) {
                try {
                    stmt.executeUpdate(s);
                } catch (SQLException e) {
                    // skip duplicate key errors when re-running
                    if (e.getErrorCode() == 1062) {
                        // duplicate entry; ignore
                    } else {
                        throw e;
                    }
                }
            }

            stmt.executeUpdate(delete1);
            stmt.executeUpdate(delete2);

            try (ResultSet rs = stmt.executeQuery(selectAll)) {
                System.out.println("Remaining Employees:");
                while (rs.next()) {
                    System.out.printf("%d | %s | %d | %.2f%n",
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getInt("age"),
                            rs.getDouble("salary"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}