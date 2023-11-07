class A{
    public void show(){
        System.out.println("In a show");
    }
    public void config(){
        System.out.println("In A config");
    }
}
class B extends A{
    public void show(){
        System.out.println("In b show");
    }
}

public class MethodOverriding_52 {
    public static void main(String args[]){
        B b = new B();
        b.show();
    }
}
