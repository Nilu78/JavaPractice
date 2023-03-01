import java.util.Arrays;

public class practice22 {
public static void main (String [] args) {

    int[] arr = {9,4,23,6,78,4};
    for (int i = 0 ; i < arr.length; i++) {
        for (int j = 0 ; j < arr.length ; j++) {
            int temp= 0 ;
            if (arr[i]< arr[j]){ // if I change ‘<’ to ‘>’ it will sort from bigger to smaller
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp; } } }
    System.out.println(Arrays.toString(arr));

}

}





