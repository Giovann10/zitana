import java.util.*;

public class LagopusClass {
  private String className;
  private List<Student> students = new ArrayList<>();
  private List<Mentor> mentors = new ArrayList<>();
  
  public String getClassName() {
    return className;
  }
  
  public List<Student> getStudents() {
    return students;
  }
  
  public List<Mentor> getMentors() {
    return mentors;
  }
  
  LagopusClass(String className){
    this.className = className;
  }
  
  public void addStudent(Student s) {
    students.add(s);
  }
  
  public void addMentor(Mentor m) {
    mentors.add(m);
  }
  
  public void info() {
    System.out.println("Lagopus " + className + " class has " + students.size() + " students and " + mentors.size() + " mentors.");
  }
  
}
