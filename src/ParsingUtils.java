

public class ParsingUtils {



    public static StringBuilder changeLetter(StringBuilder sb, String chars) {
        //parse input
        char[] search = chars.toCharArray();

        for (int i = 0; i < chars.length(); i++) {

                Character find = search[i];
                //compare input to string

                for (int i2 = 0; i2 < sb.length(); i2++)
                    if (sb.charAt(i2) == find) {
                        sb.setCharAt(i2, Character.toUpperCase(find));

                    //           System.out.println(i);
                }
        }
        return sb;
    }

}



