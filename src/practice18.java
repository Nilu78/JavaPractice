import java.util.Arrays;

public class practice18 {

    public static void main (String [] args){

        String str= "AAABBBCCC";
        String result = "";
        for (int i = 0 ; i < str.length(); i++)
            if (!result.contains("" + str.charAt(i)))
                result += "" + str.charAt(i);
        System.out.println(result);

    }

        public static void SortLettersAndNumbersFromString(String str) {
            String str2 = "";
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i))) {
                    str2 += str.charAt(i);

                }

            }

        }
    }

