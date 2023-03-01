public class practice10 {

    public static void main (String [] args) {
        String str1 = "listen";
        String str2 = "silent";
        for (int i = 0; i < str1.length(); i++) {
            str2 = str2.replaceFirst("" + str1.charAt(i), "");
        }
        System.out.println(str2.isEmpty() ? "Anagram" : "NOT Anagram");
    }

    }



