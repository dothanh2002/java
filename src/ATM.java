import Model.LoggedUser;
import  Model.User;
public class ATM {
    User[] users;
    LoggedUser loggedUser;

    public ATM() {
        users = new User[]{
                new User("001", "user1", "123456", 10000000),
                new User("002", "user2", "123467", 5000000)
        };

    }

    public LoggedUser authenticate(String id, String password) {
        for (int i = 0; i < this.users.length; i++) {
            if (this.users[i].getId().equals(id)
                    && this.users[i].getPassword().equals(password)) {
                this.loggedUser = new LoggedUser(this.users[i], i);
                return
                        this.loggedUser;
            }
        }
        return null;
    }

    public void widthdraw(float widthdrawMoney) throws Exception {
        if (widthdrawMoney <= 0) {
            throw new Exception("so tien muon rut phai duong :");

        }
        if (widthdrawMoney > this.loggedUser.getUser().getBalance()) {
            throw new Exception("tien trong tai khoan khong du :");

        }
        float balance = this.loggedUser.getUser().getBalance();
        this.loggedUser.getUser().setBalance(balance - widthdrawMoney);
    }

    public void printAccoutInfo() {
        System.out.println("thong tin  voi id la " + this.loggedUser.getUser().getId());
        System.out.println("so tien trong tai khoan " + this.loggedUser.getUser().getBalance());
    }

    public LoggedUser getLoggedUser() {
        return loggedUser;
    }
}
