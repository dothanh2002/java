import java.sql.*;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java1", "root", "dothanh2520");
            System.out.println("Connected to databes");

            /*Statement stm = connection.createStatement();*/
            /*String sql="INSERT INTO users(full_name,email,address,password) VALUES('linh','d@gmail.com','hai phong','123456')";
            if (stm.execute(sql)== true){
                System.out.println("Insert success");
            }else {
                System.out.println("Insert fail");
            }*/
            /*String sql="UPDATE users SET full_name ='do xuan tung' WHERE id >=1";
            int rowAFFect= stm.executeUpdate(sql);
            System.out.println("da co"+ rowAFFect+"dong duoc cap nhat");*/
           /* String sql= "SELECT * FROM users";
            ResultSet resultSet=stm.executeQuery(sql);
            while (resultSet.next()){
                System.out.println("Id:"+resultSet.getInt("id"));
                System.out.println("Full name:"+ resultSet.getString("full_name"));
                System.out.println("Email:"+resultSet.getString("email"));
                System.out.println("Address"+resultSet.getString("address"));
                System.out.println("Password"+resultSet.getString("password"));
                System.out.println("======================================================");
            }*/
           /*Statement stm = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet=stm.executeQuery("SELECT *FROM users");
            resultSet.next();
            resultSet.updateString("full_name", "do xuan thanh");
            resultSet.updateString("email", "hehe@gmail.com");
            resultSet.updateRow();*/
            PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO users(full_name,email,address,password)VALUES (?,?,?,?)");
            preparedStatement.setString(1, "lo vi song");
            preparedStatement.setString(2, "song @gmail.com");
            preparedStatement.setString(3, "hai duong");
            preparedStatement.setString(4 ,"123456");
            preparedStatement.execute();




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


