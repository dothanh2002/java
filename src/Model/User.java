package Model;

public class User{
     private String id;
     private String name;
     private String password;
     private float balance;

     public User(String id, String name, String password, float balance) {
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

     public float getBalance() {
         return balance;
     }

     public void setBalance(float balance) {
         this.balance = balance;
     }
 }

