public class practice30 {

    public static void main(String[]args){
        int[] nums = {1 ,4 ,7 ,9 ,3 ,56 ,3 };
        int max= 0 ;
        for (int i = 0 ; i <nums.length ; i++) {
            if (nums[i]>max){
                max=nums[i];
            } }
        System.out.println(max);
    }
}
