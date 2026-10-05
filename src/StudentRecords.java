import java.sql.*;

public class StudentRecords {

    public static void main(String[] args) {

        // Database URL
        String url = "jdbc:mysql://localhost:3306/college";

        // Database Username and Password
        String username = "root";
        String password = "Arshi@786";

        try {
            // Establish Connection
            Connection con = DriverManager.getConnection(url, username, password);

            // Create Statement
            Statement stmt = con.createStatement();

            // SQL Query
            String query = "SELECT * FROM students";

            // Execute Query
            ResultSet rs = stmt.executeQuery(query);

            // Display Heading
            System.out.println("ID\tName\tBranch\tMarks");

            // Display Records
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + "\t" +
                                rs.getString("name") + "\t" +
                                rs.getString("branch") + "\t\t" +
                                rs.getInt("marks")
                );
            }

            // Close Resources
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
