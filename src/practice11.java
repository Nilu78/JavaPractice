import java.util.Arrays;

public class practice11 {

    public static void main(String[] args){
        String str1 = "listen";
        String str2 = "silent";
        String str11 = "";
        String str22 = "";
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (char each:ch1) {
            str11+=each;
        }
        for (char each:ch2) {
            str22+=each;
        }
        System.out.println(str11.equals(str22) ? "Anagram" : "NOT Anagram");


    }
}
