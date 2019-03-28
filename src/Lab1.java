import java.util.ArrayList;
import java.util.Scanner;

public class Lab1 {

  public static String checker(String email){
    int result = email.indexOf("@");
    return email.substring(result+1);


  }


  public static void main(String[] args){


   Scanner keyboard = new Scanner(System.in);
   System.out.println("Enter your email");
   String email = keyboard.nextLine();
   if (email.contains("@") && email.contains(".")){
     System.out.println("Valid email");
     System.out.println("Domain: " + checker(email));
   } else
     System.out.println("Invalid email");




 }

}
