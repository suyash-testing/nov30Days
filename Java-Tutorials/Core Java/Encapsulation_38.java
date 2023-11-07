class Human{
    private int age;
    private String name ;
 
    // Constructor
    Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
};

public class Encapsulation_38 {
    public static void main(String args[]){
        Human h1 = new Human("Suyash Mishra" , 20);
        h1.setName("Suyash Mishra"); 
        System.out.println(h1.getName());
    }
}
