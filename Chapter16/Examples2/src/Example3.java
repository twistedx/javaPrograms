public class Example3 {

    private static String possible = "123";

    public static void printPass(String pass) {
        if (pass.length() < 2) {
            for (int i = 0; i < possible.length(); i++) {
                printPass(pass + possible.charAt(i));
            }

        } else {
            System.out.println(pass);
        }
    }

    public static void main(String[] args) {
        printPass("");
    }
}

