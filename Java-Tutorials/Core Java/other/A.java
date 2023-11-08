package other;
class Launch{
    public void abc(){
        A a1 = new A();
        System.out.println(a1.marks);
    }
}
public class A {
    protected int marks = 100 ;
    public void show(){ System.out.println(marks);}
}
