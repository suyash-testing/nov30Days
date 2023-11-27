class Counter {

  public int count = 0;

  public synchronized void increment() {
    this.count += 1;
  }

  public int getCount() {
    return count;
  }
}

public class RaceCondition_94 {

  public static void main(String[] args) throws InterruptedException {
    Counter c = new Counter();

    Runnable a = () -> {
      for (int i = 0; i < 10000; i++) {
        c.increment();
      }
    };

    Runnable b = () -> {
      for (int i = 0; i < 10000; i++) {
        c.increment();
      }
    };

    Thread t1 = new Thread(a);
    Thread t2 = new Thread(b);

    t1.start();
    t2.start();

    t1.join(); // Wait for t1 to complete
    t2.join(); // Wait for t2 to complete

    System.out.println(c.getCount());
  }
}
