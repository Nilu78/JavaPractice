public class practice5 {

        public static void main(String[] args) {
            String text = "amalgam";
            boolean check = true;
            for (int i= 0 ; i<text.length()/2 ; i++){
                if (text.charAt(i) != text.charAt(text.length()-1 -i)){

                    check= false;
                    break; }
            }
            if (check) System.out.println("Palindrome");
            else System.out.println("Not Palindrome");

        }
    }

