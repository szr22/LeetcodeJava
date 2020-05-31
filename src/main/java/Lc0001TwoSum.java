import java.util.Arrays;
import java.util.HashMap;

public class Lc0001TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 7, 11, 15 };
        int target = 9;
        int[] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int rest = target - nums[i];
            if(map.containsKey(rest)){
                res[0] = map.get(rest);
                res[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
