public class Threads_90 extends Thread {

  // initiated run method for Thread
  public void run() {
    System.out.println("Thread Started Running...");
  }

  public static void main(String[] args) {
    Threads_90 g1 = new Threads_90();

    // Invoking Thread using start() method
    g1.start();
  }
}
