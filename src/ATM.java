import java.util.*;
public class ATM {
    private HashMap<String, User> users = new HashMap<>();

    public ATM() {
        // Khởi tạo tập dữ liệu người dùng
        users.put("001", new User("001", "user1", "123456", 10000000));
        users.put("002", new User("002", "user2", "123467", 5000000));
    }

    public boolean login(String id, String password) {
        User user = users.get(id);
        return user != null && user.getPassword().equals(password);
    }

    public boolean withdraw(String id, double amount) {
        User user = users.get(id);
        if (user.getBalance() >= amount) {
            user.setBalance(user.getBalance() - amount);
            return true;
        }
        return false;
    }

    public double checkBalance(String id) {
        User user = users.get(id);
        return user.getBalance();
    }

    // Phương thức để truy cập users
    public HashMap<String, User> getUsers() {
        return users;
    }
}
