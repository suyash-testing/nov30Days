// class ThreadParent {}

// class ThreadA implements Runnable {

//   public void run() {
//     for (int i = 0; i < 5; i++) {
//       System.out.println("Hi");
//       try {
//         Thread.sleep(10);
//       } catch (InterruptedException e) {
//         e.printStackTrace();
//       }
//     }
//   }
// }

// class ThreadB implements Runnable {

//   public void run() {
//     for (int i = 0; i < 5; i++) {
//       System.out.println("Hello");
//       try {
//         Thread.sleep(10);
//       } catch (InterruptedException e) {
//         e.printStackTrace();
//       }
//     }
//   }
// }

public class ThreadPriorityAndSleep_92 {

  public static void main(String[] args) {
    Runnable a = () -> {
      for (int i = 0; i < 5; i++) {
        System.out.println("Hi");
        try {
          Thread.sleep(10);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    };

    Runnable b = () -> {
      for (int i = 0; i < 5; i++) {
        System.out.println("Hello");
        try {
          Thread.sleep(10);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    };

    Thread t1 = new Thread(a);
    Thread t2 = new Thread(b);

    t1.start();
    t2.start();
  }
}
