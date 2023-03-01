public class practice24 {


    public static void main(String[] args) {
        String num = String.valueOf(153);
        int length = num.length();
        int number = Integer.parseInt(num);
        int temp= 0 ;
        int sum= 0 ;
        while (number!= 0 ){
            temp=number%10 ;
            sum+=Math.pow(temp,length);
            number/= 10 ;
        }
        if (sum==Integer.parseInt(num)){
            System.out.println( "Armstrong number");
        }
        else {
            System.out.println( "Not an Armstrong number");
        }

    }

}



