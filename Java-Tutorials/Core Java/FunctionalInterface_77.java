@FunctionalInterface
interface Ai {
  void show();
}

// class Bi implements Ai {

//   @Override
//   public void show() {
//     System.out.println("Unimplemented method 'show'");
//   }
// }

public class FunctionalInterface_77 {

  public static void main(String[] args) {
    Ai obj = new Ai() {
      @Override
      public void show() {
        System.out.println("IN Ai show");
      }
    };
    obj.show();
  }
}
