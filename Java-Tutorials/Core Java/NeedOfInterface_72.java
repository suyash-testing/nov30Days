// Need of interface
interface Computer {
  public abstract void code();
}

class Laptop implements Computer {

  public void code() {
    System.out.println("code , compile , run");
  }
}

class Desktop implements Computer {

  public void code() {
    System.out.println("code , compile , run : Faster");
  }
}

class Developer {

  public void devApp(Computer lap) {
    lap.code();
  }
}

public class NeedOfInterface_72 {

  public static void main(String[] args) {
    Computer lap = new Laptop();
    Computer desk = new Desktop();

    Developer dev = new Developer();
    dev.devApp(lap);
  }
}
