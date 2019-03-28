import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Encryption
{
    protected String filename;
    protected int key;
    protected Scanner inputFile;

    public Encryption(String filename) throws FileNotFoundException {
        this.filename = filename;
        this.key = 0;
        this.inputFile = new Scanner(new File(this.filename));
    }

    public Encryption(String filename, int key) throws FileNotFoundException
    {
        this.filename = filename;
        this.key = key;
        this.inputFile = new Scanner(new File(this.filename));
    }

    public String getLine(int which) {
        return "getLine not properly implemented";
    }
    public String getEncryptedLine(int which) {
        return "getEncryptedLine not properly implemented";
    }
}
