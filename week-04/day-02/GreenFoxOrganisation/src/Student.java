import java.util.Comparator;

public class Student extends Person implements Comparable{
  private String previousOrganisation;
  public int skippedDays;
  
  public int getSkippedDays() {
    return this.skippedDays;
  }
  
  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + this.getName()
            + " a " + this.getAge() + " old "
            + this.getGender()
            + " from " + previousOrganisation
            + " who skipped " + skippedDays + " from the course already.");
  }
  @Override
  public void getGoal(){
    System.out.println("My goal is: Be a junior software developer.");
  }

  public void skipDays(int numberOfDays) {
    this.skippedDays = skippedDays + numberOfDays;
  }

   Student(String name, int age, String gender, String previousOrganisation) {
    super(name, age, gender);
    this.previousOrganisation = previousOrganisation;
    this.skippedDays = 0;
  }

   Student() {
    super();
    previousOrganisation = "The School of Life";
    skippedDays = 0;
  }

  @Override
  public int compareTo(Object o) {
    Student s = (Student) o;
    return this.skippedDays - s.skippedDays;
  }
}
