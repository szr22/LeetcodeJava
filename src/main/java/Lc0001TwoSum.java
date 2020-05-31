import java.util.Arrays;
import java.util.HashMap;

public class Lc0001TwoSum {
    public static void main(final String[] args) {
        final int[] nums = new int[] { 2, 7, 11, 15 };
        final int target = 9;
        final int[] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }

    private static int[] twoSum(final int[] nums, final int target) {
        final int[] res = new int[2];
        final HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            final int rest = target - nums[i];
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
