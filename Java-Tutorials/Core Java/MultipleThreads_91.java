class ThreadA extends Thread {

  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("Hi");
    }
  }
}

class ThreadB extends Thread {

  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("Hello");
    }
  }
}

public class MultipleThreads_91 {

  public static void main(String[] args) {
    ThreadA a = new ThreadA();
    ThreadB b = new ThreadB();
    a.start();
    b.start();
  }
}
