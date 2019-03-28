import java.util.Scanner;

public class Lab01 {

  public static void count(int num){
    if (num % 2 == 0){
      System.out.println(num * -1);
      count(num -1);
    }
    else if (num > 1) {
        System.out.println(num);
        count(num -1 );
         }

    else if (num == 1){
    System.out.println(num);
  }
  }
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a number");
    int temp = keyboard.nextInt();
    count(temp);

  }
}
