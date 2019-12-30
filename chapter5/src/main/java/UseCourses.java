import a1.custom.accessors.Course;
import a2.primary.constructor.initialization.Student;

public class UseCourses {

  public static void main(String[] args) {
    Course c = new Course("Mastering Kotlin");
    c.setDescription("Third Edition");
    System.out.println(c.getDescription());
    Student s = new Student("Rajkumar", "Natarajan");
    Student s2 = new Student("Rajkumar", "Natarajan");
    s.printStudentInfo();
    s2.printStudentInfo();
  }
}
