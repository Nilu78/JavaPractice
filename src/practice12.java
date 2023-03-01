import java.util.Arrays;
import java.util.TreeSet;

import static java.util.Arrays.*;

public class practice12 {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        TreeSet<String> set1 = new TreeSet<>(Arrays.asList(str1.split("")));
        TreeSet<String> set2 = new TreeSet<>(Arrays.asList(str2.split("")));

        System.out.println(set1.equals(set2) ? "DuoTech" : "Academy");


    }
}
