import java.util.*;
public class Demo {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);
        String id, password;

        // Yêu cầu người dùng nhập ID và mật khẩu để đăng nhập vào ATM
        System.out.println("Nhập ID:");
        id = scanner.nextLine();
        System.out.println("Nhập mật khẩu:");
        password = scanner.nextLine();

        if (atm.login(id, password)) {
            // Truy cập users thông qua phương thức công khai
            HashMap<String, User> users = atm.getUsers();
            System.out.println("Welcome " + users.get(id).getName());
            boolean exit = false;
            while (!exit) {
                System.out.println("Chọn một trong các lựa chọn sau:");
                System.out.println("1. Rút tiền");
                System.out.println("2. Truy vấn thông tin tài khoản");
                System.out.println("3. Thoát chương trình");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Nhập số tiền bạn muốn rút:");
                        double amount = 0;
                        boolean validInput = false;
                        while (!validInput) {
                            try {
                                amount = scanner.nextDouble();
                                validInput = true;
                            } catch (Exception e) {
                                System.out.println("Số tiền phải là một số. Vui lòng nhập lại:");
                                scanner.nextLine();
                            }
                        }
                        if (atm.withdraw(id, amount)) {
                            System.out.println("Rút tiền thành công. Số tiền còn lại trong tài khoản: " + atm.checkBalance(id));
                        } else {
                            System.out.println("Số tiền trong tài khoản không đủ.");
                        }
                        break;
                    case 2:
                        System.out.println("Số tiền trong tài khoản của bạn là: " + atm.checkBalance(id));
                        break;
                    case 3:
                        exit = true;
                        System.out.println("Goodbye, see you later.");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                }
            }
        } else {
            System.out.println("Thông tin đăng nhập không đúng.");
        }
    }
}