import java.util.Scanner;

public class Ps04 {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");

        int num = scanner.nextInt();
        if (num < 0)
        {
            System.out.println("Input must be greater than zero.");
        }else {
            int fact = fact(num);
            System.out.println(num +"! = " + fact );
        }

}
    static int fact(int n)
    {
        int output;
        if(n==0){
            return 1;
        }

        output = fact(n-1)* n;
        return output;
    }
}