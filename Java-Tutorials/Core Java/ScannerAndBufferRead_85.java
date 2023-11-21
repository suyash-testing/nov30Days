import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class ScannerAndBufferRead_85 {

  public static void main(String[] args) throws IOException {
    System.out.println("Enter a number");
    // Option 1
    // int num = System.in.read();
    // System.out.println(num); Gives ASCII Value.

    // Option 2
    // InputStreamReader in = new InputStreamReader(System.in);
    // BufferedReader bf = new BufferedReader(in);
    // int num = Integer.parseInt(bf.readLine());
    // System.out.println("Using bufferReader Class " + num);
    // bf.close();

    // Option 3
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println("Using scanner class " + num);
  }
}
