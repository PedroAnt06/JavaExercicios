package TwoSum;

public class TwoSum {
    public static void main (String[] args){
        twoSum();
    }


    public static void twoSum(){
        int[] nums = {1, 2, 3, 2, 4};
        int target = 5;
        int i = 0;


        while (i < nums.length - 1){
            int o = i + 1;
            while (o < nums.length - 1){
                if (nums[i] + nums[o] == target){
                        System.out.println(nums[i] + ", " + nums[o]);
                }
                o++;
            }
            i++;
        }
    }
}
