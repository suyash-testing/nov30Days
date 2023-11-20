class SuyashException extends Exception {

  public SuyashException(String s) {
    super(s);
  }
}

public class ThrowKeyword_85 {

  public static void main(String[] args) {
    int i = 110;
    int j = 10;
    try {
      j = 18 / i;
      if (j == 0) {
        throw new SuyashException("J cannot be zero.");
      }
    } catch (SuyashException e) {
      System.out.println("SuyashException -> " + e.getMessage());
    } catch (ArithmeticException e) {
      j = 18;
      System.out.println(e.getMessage());
    }
    System.out.println(j);
  }
}
