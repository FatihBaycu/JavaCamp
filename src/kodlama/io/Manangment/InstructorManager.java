package kodlama.io.Manangment;

import kodlama.io.Entities.Course;
import kodlama.io.Entities.Instructor;

import javax.swing.text.html.parser.Entity;
import java.util.List;

public class InstructorManager {
    public void Add(Instructor instructor){System.out.println("Instructor Added.");}
    public void Update(Instructor instructor){System.out.println("Instructor Added.");}
    public void Delete(Instructor instructor){System.out.println("Instructor Added.");}
    public void Login(Instructor instructor,String email,String password){
        if(instructor.getEmail()==email & instructor.getPassword()==password)
            System.out.println("Sisteme Giriş Yapıldı");
        else System.out.println("Password or email is wrong");
    }

    public void AddCourse(Course course,Instructor instructor){
        CourseManager courseManager=new CourseManager();
        courseManager.Add(course);
        Add(instructor);
    }
}