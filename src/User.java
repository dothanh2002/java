 public class User{
     private String id;
     private String name;
     private String password;
     private double balance;

     public User(String id, String name, String password, double balance) {
         this.id = id;
         this.name = name;
         this.password = password;
         this.balance = balance;
     }

     public java.lang.String getId() {
         return id;
     }

     public void setId(java.lang.String id) {
         this.id = id;
     }

     public java.lang.String getName() {
         return name;
     }

     public void setName(java.lang.String name) {
         this.name = name;
     }

     public java.lang.String getPassword() {
         return password;
     }

     public void setPassword(java.lang.String password) {
         this.password = password;
     }

     public double getBalance() {
         return balance;
     }

     public void setBalance(double balance) {
         this.balance = balance;
     }
 }

