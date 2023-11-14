// enum Status {
//   Running,
//   Failed,
//   Success,
//   Pending,
// }

// public class Enum_73 {

//   public static void main(String args[]) {
//     Status s = Status.Failed;
//     System.out.println(s);

//   }
// }


// public class Enum_73 {

//   public static String longestCommonPrefix(String[] strs) {
//     Arrays.sort(strs);
//     int length = strs.length;

//     String firstStr = strs[0];
//     String lastStr = strs[length - 1];
//     StringBuilder commonPrefix = new StringBuilder();

//     for (int i = 0; i < firstStr.length(); i++) {
//         System.out.println(strs[i]);
//       if (i < lastStr.length() && firstStr.charAt(i) == lastStr.charAt(i)) {
//         commonPrefix.append(firstStr.charAt(i));
//       } else {
//         break;
//       }
//     }

//     return commonPrefix.toString();
//   }

//   public static void main(String[] args) {
//     String[] input = { "flower", "flow", "flight" };
//     String output = longestCommonPrefix(input);

//     System.out.println("Input: " + Arrays.toString(input));
//     System.out.println("Output: " + output);
//   }
// }
