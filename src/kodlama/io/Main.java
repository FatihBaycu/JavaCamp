package kodlama.io;

import kodlama.io.Entities.Course;
import kodlama.io.Entities.Instructor;
import kodlama.io.Entities.Student;
import kodlama.io.Manangment.CourseManager;
import kodlama.io.Manangment.InstructorManager;
import kodlama.io.Manangment.StudentManager;

public class Main {
    public static void main(String[] args) {

        Student student=new Student();
        student.setId(1);
        student.setName("Fatih");
        student.setSurname("Baycu");
        student.setBalance(1000);
        StudentManager studentManager= new StudentManager();
        studentManager.add(student);
        System.out.println("Student Name:"+student.getName()+"\nStudent Balance:"+student.getBalance()+"TL");

    System.out.println("-----------------------------");
        Instructor instructor=new Instructor();
        instructor.setId(1);
        instructor.setName("Engin");
        instructor.setSurname("Demiroğ");
        instructor.setEmail("engin.demiroğ@kodlama.io");
        instructor.setPassword("1");
        instructor.setBalance(200);

        InstructorManager instructorManager=new InstructorManager();
        instructorManager.Add(instructor);

        instructorManager.Login(instructor,instructor.getEmail(),instructor.getEmail());

        System.out.println("Instructor Id:"+instructor.getId());
        System.out.println("Instructor Name:"+instructor.getName()+" "+instructor.getPassword());

        System.out.println("-----------------------------");
        Course course=new Course();
        course.setCourseId(1);
        course.setCourseName("Nitelikli Yazilim Geliştirci Kampı JAVA & REACT");
        course.setInstrcutorId(instructor.getId());
        course.setCoursePrice(200);

        CourseManager courseManager =new CourseManager();
        courseManager.Add(course);

        System.out.println("Course Id:"+course.getCourseId());
        System.out.println("Course Name:"+course.getCourseName());
        System.out.println("Course Instrcutor Name:"+instructor.getName());
        System.out.println("Course Price:"+course.getCoursePrice()+"TL");

        System.out.println("-----------------------------");
        instructorManager.AddCourse(course,instructor);
        System.out.println("-----------------------------");

        studentManager.BuyCourse(course,student);
        studentManager.BuyCourse(course,student);
        studentManager.BuyCourse(course,student);
        studentManager.BuyCourse(course,student);
        studentManager.BuyCourse(course,student);
        studentManager.BuyCourse(course,student);
        studentManager.BuyCourse(course,student);





    }
}
