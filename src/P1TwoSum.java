import java.util.Arrays;

public class P1TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = {-1, -1};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}