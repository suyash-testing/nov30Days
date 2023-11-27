import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CollectionAPI_96 {

  public static void main(String[] args) {
    Set<Integer> nums = new HashSet<Integer>();
    nums.add(2);
    nums.add(1);
    nums.add(1);
    nums.add(2);
    nums.add(2);
    nums.add(2);
    nums.add(3);

    for (int n : nums) {
      System.out.println(n);
    }
  }
}
/*

Collection : List(ArrayList,LinkList) , Queue(Deque), Set(HashSet,LinkedListSet)

ArrayList<String> fruits = new ArrayList<>();

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");

    System.out.println("First fruit: " + fruits.get(0));

    fruits.remove("Banana");

    System.out.println("Fruits:");
    for (String fruit : fruits) {
      System.out.println(fruit);
    }

*/
