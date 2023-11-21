import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TryWithResources_89 {

  public static void main(String[] args) {
    int i = 18;
    int j = 10;
    int num = 0;
    // try {
    //   Scanner sc = new Scanner(System.in);
    //   num = sc.nextInt();
    //   j = 18 / j;
    // } catch (Exception e) {
    //   System.out.println("Exception handeled Properly");
    // } finally {
    //   System.out.println("Closing all the resouces");
    // }

    try (
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
    ) {} catch (Exception e) {}
  }
}
