class A {

  public void show() {
    System.out.println("In a show");
  }
}

// class B extends A {
//   public void show() {
//     System.out.println("In b show");
//   }
// }

public class AnonymousInnerClass_68 {

  public static void main(String args[]) {
    A obj = new A() {
      public void show() {
        System.out.println("In b show");
      }
    };
    obj.show();
  }
}
