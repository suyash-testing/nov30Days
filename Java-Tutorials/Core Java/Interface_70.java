// class is child of  class : extends
// class is child of interface : implements
// interface is child of interface : extends

interface A {
  // ! by default all variables are final and static.
  int age = 10;
  String area = "Gurgaon";

  // ! by default all method are public abstract
  void show();
  void config();
}

interface X {
  void run();
}

interface Y extends X {}

class B implements A, X {

  public void show() {
    System.out.println("In show");
  }

  public void config() {
    System.out.println("In config");
  }

  public void run() {
    System.out.println("In run");
  }
}

public class Interface_70 {

  public static void main(String args[]) {
    A obj;
    obj = new B();
    obj.show();
    obj.config();
    System.out.println(A.age);
    System.out.println(A.area);
  }
}
