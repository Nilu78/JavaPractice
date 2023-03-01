public class practice21 {

    public static void main (String []args){
        int[] arr = {9 ,4 ,23 ,6 ,78 ,4 };
        int min = arr[0 ];
        for (int i= 0 ; i<arr.length; i++){
            if (min > arr[i]){
                min=arr[i];
            } }
        System.out.println(min);

    }
}
