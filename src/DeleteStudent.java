import java.sql.*;
import java.util.Scanner;

public class DeleteStudent {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "Arshi@786";

        Scanner sc = new Scanner(System.in);

        try {
            // Establish Connection
            Connection con = DriverManager.getConnection(url, username, password);

            // Take Student ID as input
            System.out.print("Enter Student ID to delete: ");
            int id = sc.nextInt();

            // SQL Query
            String query = "DELETE FROM students WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            // Execute Update
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student record deleted successfully.");
            } else {
                System.out.println("Student ID not found.");
            }

            // Close Resources
            ps.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}