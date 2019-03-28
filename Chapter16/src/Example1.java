import java.util.Scanner;

public class Example1 {

  public static void crash(int x){
    System.out.println(x);
    x++;
  crash(x);
  }
  public static int factShort(int num){
    return num == 0 ? 1 : num * factShort(num -1);
  }

  public static int fact(int num){
    if (num == 0){
      return 1; // base case
    }
    else{
      return num * fact(num -1);
    }
  }


  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter an int");
    int input = keyboard.nextInt();
    System.out.println(fact(input));

    }
}
