import java.util.Scanner;

public class DomainParser {
    public static String getTopLevelDomain(String domain){

     int num = domain.lastIndexOf('.');
     return domain.substring(num + 1);

    }



    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a String");
        String domain = keyboard.nextLine();
        System.out.println("Top level domain: " + getTopLevelDomain(domain));

    }
}
