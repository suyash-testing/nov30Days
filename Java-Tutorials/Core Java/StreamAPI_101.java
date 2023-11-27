import java.util.*;

public class StreamAPI_101 {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4);
    int sum = 0;
    for (int n : list) {
      if ((n & 1) == 0) {
        n *= 2;
        sum += n;
      }
    }

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
