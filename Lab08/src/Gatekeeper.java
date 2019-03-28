import java.util.*;

public class Gatekeeper {


  public static void main(String[] args) {
    //parse the user database
    Map<String, User> user_map = Database.load();

    //You now have a map full of users.
    //The key is the username and the value is the user object.
    //How can you check to see if the given username/password is correct?

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter username");
    String user = keyboard.nextLine();

    if (user_map.get(user) == null) {
      System.out.println("That username does not exist.");
      System.exit(0);
    }
    User check = user_map.get(user);
    System.out.println("Enter password");
    String password = keyboard.nextLine();


    if (check.password.equals(password)) {
      System.out.println("Successfully logged in.");
      System.out.printf("Welcome %s %s\n", check.first_name, check.last_name);

    } else {
      System.out.println("Incorrect password");
    }

  }


}




