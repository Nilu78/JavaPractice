public class practice33 {

    public static void main(String[]args) {
        long number;
        long temp = 0 ;
        long reverse= 0 ;
        int numOfLoops = String.valueOf(0).length();
        String revStr= "";
        for (int i = 0 ; i <numOfLoops ; i++) {
            revStr+=temp%10 ;
            temp/= 10 ;
        }
        reverse=Integer.parseInt(revStr);
        if (reverse==0){
            System.out.println( "Palindrome");
        }
        else {
            System.out.println( "Not a palindrome");
        }

    }
}

