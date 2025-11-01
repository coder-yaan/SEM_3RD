package mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main() {

        String url = "jdbc:mysql://127.0.0.1:3306/?user=root";
        String user = "root";
        String password = "Ayan7860Khan!";

        try {
            // Loading JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully");

            // Creating Statement Object
            Statement statement = connection.createStatement();

            // Creating Database
            String createDB = "CREATE DATABASE IF NOT EXISTS Week14";
            statement.executeUpdate(createDB);
            System.out.println("Database created successfully");

            // Select database
            String useDB = "USE Week14";
            statement.executeUpdate(useDB);

            // Create Table
            String createTable = """
                CREATE TABLE IF NOT EXISTS Employee (
                    EmployeeID INT PRIMARY KEY,
                    Name VARCHAR(50) NOT NULL,
                    Age INT NOT NULL,
                    Salary FLOAT DEFAULT 0.00
                );
            """;
            statement.executeUpdate(createTable);
            System.out.println("Table created successfully");

            // Insert records
            String tableRecords = """
                INSERT INTO Employee (EmployeeID, Name, Age , Salary) VALUES
                    (162, 'Abhinav', 22, 87000),
                    (115, 'Kush', 23, 65000),
                    (135, 'Vimal', 21, 71000),
                    (567, 'Tarun', 22, 66000),
                    (503, 'Ankit', 22, 60000);
            """;
            statement.executeUpdate(tableRecords);
            System.out.println("Records inserted successfully");

            // Display table
            System.out.println("\nTable Records:");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Employee");
            while (resultSet.next()) {
                System.out.println(
                        resultSet.getInt("EmployeeID") + " | " +
                                resultSet.getString("Name") + " | " +
                                resultSet.getInt("Age") + " | " +
                                resultSet.getFloat("Salary")
                );
            }

            // Deleting any two records
            statement.executeUpdate("DELETE FROM Employee WHERE EmployeeID = 115;");
            statement.executeUpdate("DELETE FROM Employee WHERE EmployeeID = 503;");
            System.out.println("Two records deleted successfully");

            // Display table
            ResultSet remainingResultSet = statement.executeQuery("SELECT * FROM Employee;");
            System.out.println("\nRemaining Records:");
            while (remainingResultSet.next()) {
                System.out.println(
                        remainingResultSet.getInt("EmployeeID") + " | " +
                                remainingResultSet.getString("Name") + " | " +
                                remainingResultSet.getInt("Age") + " | " +
                                remainingResultSet.getFloat("Salary")
                );
            }

            // closing resources
            remainingResultSet.close();
            resultSet.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Driver Not Found");
        } catch (SQLException e) {
            System.out.println("SQL Error");
        }
    }
}