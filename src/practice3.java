public class practice3 {


    public static void main(String[] args) {
        String givenStr = "Kac defa java geceiyok ki java sayisini javada say";
        int counter = 0 ;
        for (int i = 0 ; i<givenStr.length()-3 ; i++){
            if (givenStr.substring(i, i+ 4 ).equalsIgnoreCase("java"))
                counter++; }
        System.out.println(counter);
    }
}
