import java.util.Random;

public class Die {

  private int numSides;
  private int value;
  private static Random rng = new Random();// init static variable here

  public Die(int numSides) {

    if (numSides >= 4){
      this.numSides = numSides;
    }
    else {
      throw new IllegalArgumentException("Need at least 4 sides");
    }
  }

  public int getSides(){
    return  numSides;
  }
  public void roll(){
    value = rng.nextInt(numSides) +1 ;
  }
  public int getValue(){
    return value;
  }
}
