import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = new int[] {-1,-2,-3,-4,-5};
        int[] index = new int[2];
        index = twoSum(nums,-8);
        Arrays.sort(index);
        System.out.println(Arrays.toString(index));

    }

    public static int[] twoSum(int[] nums, int target) {
        int start =0, end = nums.length-1,tar = 0, mid =(start + end) / 2;

        //Arrays.sort(nums);
        while(start <= end){
            //mid = (start + end)/2;
            tar = nums[start] + nums[end];
            if(tar > target){
                end--;
            }
            else if(tar < target){
                start++;
            }
            else {
                break;
            }
        }
        int[] index = new int[] {start,end};
        return index;
    }
}