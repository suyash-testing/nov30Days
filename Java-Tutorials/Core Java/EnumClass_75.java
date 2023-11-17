enum Laptops {
  Macbook(2000),
  XPS(2200),
  Surface(),
  Thinkpad(1800);

  private int price;

  private Laptops() {
    this.price = 500;
  }

  private Laptops(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}

public class EnumClass_75 {

  public static void main(String[] args) {
    // Laptops lap = Laptops.Macbook;
    // System.out.println(lap.getPrice());

    for (Laptops lap : Laptops.values()) {
      System.out.println(lap + " " + lap.getPrice());
    }
  }
}
