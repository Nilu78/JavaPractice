public class practice7 {

    public static void main(String[] args) {
        String str0 = "DuoTech.academy";
        int letterCounter = 0;
        str0 = str0.toLowerCase();
        String usedLetters= "";
        for (int i= 0 ; i<str0.length();i++){
            letterCounter= 0 ;
            if (usedLetters.contains(str0.charAt(i)+ "")) continue;
// if we used the letter before it willskip thisiterator/loop
            for (int j= 0 ; j<str0.length();j++ ){
                if (str0.charAt(i)==str0.charAt(j)){
                    letterCounter++;
                } }
            System.out.println(str0.charAt(i)+ " = " + letterCounter);
            usedLetters +=str0.charAt(i);
    }


}

    }
