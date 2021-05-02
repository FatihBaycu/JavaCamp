package KodlamaIo.Entities;

public class Course {
    int courseId;
    String courseName;
    int instrcutorId;
    double coursePrice;

    public int getInstrcutorId() {
        return instrcutorId;
    }

    public void setInstrcutorId(int instrcutorId) {
        this.instrcutorId = instrcutorId;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

}
