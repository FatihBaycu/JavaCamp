package kodlama.io.Entities;

public class User {
     int id;
     String name;
     String surname;
     String email;
     String password;
     double Balance;

     public double getBalance() {
          return Balance;
     }

     public void setBalance(double balance) {
          Balance = balance;
     }

     public User(){}


     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getSurname() {
          return surname;
     }

     public void setSurname(String surname) {
          this.surname = surname;
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }
     public String getPassword() {
          return password;
     }

     public void setPassword(String password) {
          this.password = password;
     }
}
