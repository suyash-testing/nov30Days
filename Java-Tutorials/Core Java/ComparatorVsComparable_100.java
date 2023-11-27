import java.util.*;

class Student implements Comparable<Student> {

  int age;
  String name;

  @Override
  public String toString() {
    return "Student [age=" + age + ", name=" + name + "]";
  }

  public Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public int compareTo(Student that) {
    if (this.age > that.age) return 1;
    return -1;
  }
}

public class ComparatorVsComparable_100 {

  public static void main(String[] args) {
    Comparator<Student> comp = new Comparator<Student>() {
      public int compare(Student i, Student j) {
        if (i.age < j.age) return 1;
        return -1;
      }
    };

    List<Student> list = new ArrayList<>();

    list.add(new Student(21, "Suyash"));
    list.add(new Student(19, "Parul"));
    list.add(new Student(20, "Doe"));
    list.add(new Student(22, "John"));

    Collections.sort(list, (i, j) -> i.age < j.age ? 1 : -1);

    for (Student s : list) {
      System.out.println(s);
    }
  }
}
