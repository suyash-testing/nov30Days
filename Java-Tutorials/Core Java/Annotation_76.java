class Aa {

  public void showTheDataWhichBelongsToThisClass() {
    System.out.println("In A show");
  }
}

class Bb extends Aa {

  @Override
  public void showTheDataWhichBelongsToThisClass() {
    System.out.println("In B show");
  }
}

public class Annotation_76 {

  public static void main(String[] args) {
    Bb b = new Bb();
    b.showTheDataWhichBelongsToThisClass();
  }
}
