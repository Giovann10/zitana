public class GreenFoxApp {
  public static void main(String[] args) {
    Person myPerson = new Person();
    myPerson.introduce();
    myPerson.getGoal();
    
    Student myStudent = new Student();
    myStudent.introduce();
    myStudent.skipDays(5);
    myStudent.introduce();
    
    Person myPersonAsStudent = new Student();
    myPersonAsStudent.introduce();
  }
}
