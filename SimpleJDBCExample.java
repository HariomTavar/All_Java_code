import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SimpleJDBCExample {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "1234";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected!");

            String sql = "INSERT INTO students(name, age) VALUES (?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, "Hariom");
            stmt.setInt(2, 20);

            stmt.executeUpdate();
            System.out.println("Data Inserted!");

            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
