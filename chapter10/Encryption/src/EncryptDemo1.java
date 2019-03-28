import java.io.FileNotFoundException;
import java.util.Scanner;

public class EncryptDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a filename");
        String name = keyboard.nextLine();
        System.out.println("Enter a line number");
        int which = keyboard.nextInt();
        System.out.println("Enter key");
        int key = keyboard.nextInt();
        Encryption test = new RotateEncryption(name,key);

        String result = test.getEncryptedLine(which);
        System.out.println(result);
    }
}
