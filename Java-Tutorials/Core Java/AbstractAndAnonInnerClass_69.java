abstract class A {

  public abstract void show();

  public abstract void config();
}

// class B extends A {
//   public void show() {
//     System.out.println("In show");
//   }
// }

public class AbstractAndAnonInnerClass_69 {

  public static void main(String args[]) {
    A b = new A() {
      int age = 10;

      public void show() {
        System.out.println("In show");
      }

      public void config() {
        System.out.println("In config");
      }
    };
    b.show();
    b.config();
  }
}
