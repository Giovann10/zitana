public class Sponsor {
  public String name;
  public int age;
  public String gender;
  public String company;
  public int hiredStudents;
  
  public void introduce() {
    System.out.println("Hi, I\'m " + name
            + " a " + age + " old "
            + gender
            + " who represents " + company
            + " and hired " + hiredStudents + " students so far.");
  }
  
  public void getGoal(){
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }
  
  public void hire() {
    hiredStudents++;
  }
  
  public Sponsor(String name, int age, String gender, String company) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
    this.hiredStudents = 0;
  }
  
  public Sponsor() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    company = "Google";
    hiredStudents = 0;
  }
}
