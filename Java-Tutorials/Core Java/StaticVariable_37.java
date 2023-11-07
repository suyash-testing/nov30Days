class Mobile{
    String brand ;
    int price ;
    static String name;

    // This is static block,  it will run only once.
    // Not like constructor
    static{ 
        name = "Phone";
    }

    public Mobile(){
        brand = "BrandName";
        price = 2000;
    }

    public void show(){
        System.out.println(brand + " " + price + " " + name);
    }
    public static void show1(Mobile m1){
        System.out.println(m1.brand + " " + m1.price + " " + name);
    }
}
public class StaticVariable_37 {
    public static void main(String args[]){
        Mobile m1 = new Mobile();
        m1.brand="Apple";
        m1.price=1300;

        Mobile m2 = new Mobile();
        m2.brand="Samsung";
        m2.price=1000;


        // m1.show();
        // m2.show();

        Mobile m3 = new Mobile();
        Mobile m4 = new Mobile();
        Mobile.show1(m3);
        Mobile.show1(m4);
    }
}