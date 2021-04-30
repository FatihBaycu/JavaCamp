package kodlama.io.Manangment;

import kodlama.io.Entities.Course;
import kodlama.io.Entities.Instructor;
import kodlama.io.Entities.Student;

public class StudentManager {
    public void add(Student student) {
        System.out.println("Student Added.");
    }

    public void update(Student student) {
        System.out.println("Student Uptated.");
    }

    public void delete(Student student) {
        System.out.println("Student Deleted.");
    }

    public void Login(Student student, String email, String password) {
        if (student.getEmail() == email & student.getPassword() == password)
            System.out.println("Sisteme Giriş Yapıldı");
        else System.out.println("Parola veya email hatali");
    }

    public void BuyCourse(Course course, Student student) {
        if (student.getBalance() >= course.getCoursePrice()) {
            student.setBalance(student.getBalance() - course.getCoursePrice());
            System.out.println("Kurs satın alındı.");
        } else {
            System.out.println("Bakiyeniz Yetersiz.");
        }
    }
}