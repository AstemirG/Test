import java.lang.reflect.Array;
import java.util.Scanner;
import java.security.MessageDigest;
public class Main {
    public static void main(String[] args) {

        String s = "Was it a cat I saw!!@@@##$$$";
        s = s.replaceAll("[^a-zA-Z0-9]","");
        String revs = new StringBuilder(s).reverse().toString();
        System.out.println(revs);
        boolean res=revs.equalsIgnoreCase(s);
        System.out.println(res);
        enum Day
        {
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY
        }
    }
}