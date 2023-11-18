public class ExceptionIntro_81 {

  public static void main(String[] args) {
    try {
      int i = 0;
      int j = 18 / i;
      System.out.println(j);
    } catch (Exception e) {
      System.out.println("Something went wrong => " + e.getMessage());
    }

    System.out.println("The End !!");
  }
}
/*
 Type of Error
 Compile time , Run Time error , Logical Error.
 */
