public class practice28 {

    public static void main(String[]args){
        String str= "AAABBBCCCDEF";
        String result = "";
        for (int i = 0 ; i <str.length(); i++) {
            if (str.contains(""+str.charAt(i))){
                str=str.replaceAll(""+str.charAt(i),"");
            } }
        System.out.println(str);
    }
}
