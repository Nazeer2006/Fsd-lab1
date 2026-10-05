import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

  public static void main(String[] args) {

    String url = "jdbc:mysql://localhost:3306/test";
    String username = "root";
    String password = "Arshi@786";

    try {

      Connection con = DriverManager.getConnection(url, username, password);

      System.out.println("MySQL Connected Successfully");

      con.close();

    } catch (Exception e) {

      System.out.println(e);

    }
  }
}