class A {

  int age;

  public void show() {
    System.out.println("in show");
  }

  static class B {

    public void config() {
      System.out.println("in config");
    }
  }
}

public class InnerClass_67 {

  public static void main(String[] agrs) {
    A a = new A();
    a.show();

    // remove static in front of B class. before running this code
    // A.B obj = a.new B();
    // obj.config();

    A.B obj = new A.B();
    obj.config();
  }
}
// Static works only in innerclass.
// cannot work in class A.
