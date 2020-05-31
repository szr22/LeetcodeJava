import java.util.Arrays;

public class Lc0026RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        int res = removeDuplicates(nums);
        System.out.println(res);
    }

    private static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n<=1) return n;
        int tail = 1;
        for (int i=1; i<n; i++) {
            if (nums[i-1] != nums[i]) {
                nums[tail++] = nums[i];
            }
            System.out.println(Arrays.toString(nums));
        }
        return tail;
    }
}
