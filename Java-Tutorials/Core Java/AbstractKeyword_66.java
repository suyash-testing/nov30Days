abstract class Car{
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("Play Music");
    }
}
// ! cannot create object of abstract class.
abstract class GWagon extends Car{
  public void drive(){
    System.out.println("Driving in Gwagon");
  }
//     public void fly(){
//     System.out.println("Flying in Gwagon");
//   }
}

class GWagonAdv extends GWagon{  // concreate class

    public void fly() {
    }
}
public class AbstractKeyword_66 {
  public static void main(String args[]){
        GWagonAdv car = new GWagonAdv();
        car.playMusic();
        car.drive();
        car.fly();
  }   
}
