import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums){
        for(int i = 0; i< nums.length; i++){
            for(int j = i+1; j< nums.length; j++){
                if(nums[i] == nums[j] ){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPresent(int[] num){
        HashSet<Integer> set = new HashSet<>();
        for (int n : num){
            if (!set.add(n)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {1,1,1,3,3,4,3,2,4,2};//{1,2,3,4};//{1,2,3,1};
        System.out.println(containsDuplicate(numbers));
        System.out.println("Using HashSet: "+isPresent(numbers));
    }
}
