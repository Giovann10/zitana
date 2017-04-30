import java.util.Comparator;

public class MentorComparator implements Comparator {

  @Override
  public int compare(Object o1, Object o2) {
    Mentor mentor1 = (Mentor) o1;
    Mentor mentor2 = (Mentor) o2;

    return mentor1.getLevel() == mentor2.getLevel() ? 0 :
        mentor1.getLevel() == "senior" ||
            mentor1.getLevel() == "intermediate" && mentor2.getLevel() == "junior" ? 1 : -1;
  }
}
