public class practice6 {

    public static void main(String[] args) {
        String str1 = "Deneme";
        String str2 = "";
        for (int i = str1.length() - 1; i >= 0; i--)
            str2 += str1.charAt(i);
        if (str1.equalsIgnoreCase(str2))
            System.out.println(str1 + " is a palindrome" + " Here is the reversed = " + str2);
        else
            System.out.println(str1 + " is NOT a palindrome!" + " Here is the reversed = " + str2);
       System.out.println(str2);


    }

}
