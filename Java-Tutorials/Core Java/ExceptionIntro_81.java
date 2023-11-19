public class ExceptionIntro_81 {

  public static void main(String[] args) {
    try {
      int i = 10;
      int j = 18 / i;
      String str = null;

      System.out.println(j);
      int nums[] = new int[5];
      System.out.println(nums[1]);
      // System.out.println(str.length());
    } catch (ArithmeticException e) {
      System.out.println("Something went wrong => " + e.getMessage());
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Something went wrong => " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Something went wrong => " + e);
    }

    System.out.println("The End !!");
  }
}
/*
 Type of Error
 Compile time , Run Time error , Logical Error.
 */
