package GameProject.Entites;

import java.util.Date;

public class Gamer extends User{
    private int id;
    private String firstName;
    private String lastName;
    private int birthYear;
    private String nationalIdentity;
    private double balance;

    public Gamer(int id, String firstName, String lastName, int birthYear, String nationalIdentity, double balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.nationalIdentity = nationalIdentity;
        this.balance = balance;
    }
    public Gamer(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthDate) {
        this.birthYear = birthYear;
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
