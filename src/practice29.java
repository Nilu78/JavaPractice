import java.util.Arrays;
import java.util.Collections;

import java.util.Arrays;
public class practice29 {

    public static void main(String[]args){

        String str = "DC501GCCCA098911";
            for(int i = 0; i < str.length(); i++) {
                String str2 = "" + str.charAt(i);
                if(Character.isAlphabetic(str.charAt(i)) && i < str.length()-1 ) {
                    if(Character.isDigit(str.charAt(i+1)) ) {
                        str2 +=","; } }
                if(Character.isDigit(str.charAt(i)) && i < str.length()-1) {
                    if(Character.isAlphabetic(str.charAt(i+1))) {
                        str2 +=","; } } }
            String[] array = str .split(",");
            str ="";
            for(String each: array) {
                char[] chars=each.toCharArray();
                Arrays.sort(chars);
                for(char eachChar: chars){
                    str +=""+eachChar; } }
            System.out.println(str); }
    }



