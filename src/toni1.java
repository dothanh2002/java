
import java.sql.*;
import java.util.Collection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class toni1{
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java1", "root", "dothanh2520");
            System.out.println("Connected to databes");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập email: ");
            String email = scanner.nextLine();
            System.out.print("Nhập mật khẩu: ");
            String password = scanner.nextLine();

            // Kiểm tra thông tin đăng nhập trong cơ sở dữ liệu
            boolean isValid = false;
            String username = "";
            String userEmail = "";

            String sql = "SELECT full_name, email FROM users WHERE email = ? AND password = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
                pstmt.setString(1, email);
                pstmt.setString(2, password);

                ResultSet rs = pstmt.executeQuery();
                if (rs.next())
                {
                    isValid = true;
                    username = rs.getString("full_name");
                    userEmail = rs.getString("email");
                }
            } catch (SQLException e) {
                System.out.println("Lỗi khi thực hiện truy vấn: " + e.getMessage());
            }

            // Hiển thị kết quả đăng nhập
            if (isValid) {
                System.out.println("Đăng nhập thành công!");
                System.out.println("Thông tin người dùng:");
                System.out.println("Tên đăng nhập: " + username);
                System.out.println("Email: " + userEmail);
            } else {
                System.out.println("Đăng nhập thất bại!");
            }

            scanner.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException exception) {
            System.out.println("Error:Cannot connect to database" + exception.getMessage());
        }
        try {
            connection.close();
            System.out.println("connection closed");
        } catch (Exception e) {
        }

    }
}



