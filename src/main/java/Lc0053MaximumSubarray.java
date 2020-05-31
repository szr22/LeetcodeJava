public class Lc0053MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int res = maxSubArrayDivide(nums);
        System.out.println(res);
    }
    public static int maxSubArray(int[] nums) {
        if (nums.length==0) return Integer.MIN_VALUE;
        int cur = nums[0], total = nums[0];
        for (int num:nums) {
            cur = Math.max(num, cur+num);
            total = Math.max(total, cur);
            System.out.println(cur+","+total);
        }
        return total;
    }

    public static int maxSubArrayDivide(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }

    private static int helper(int[] nums, int left, int right) {
        if (left>=right) return nums[left];
        int mid = (left+right)/2;
        int leftRes = helper(nums, left, mid);
        int rightRes = helper(nums, mid+1, right);
        int leftMax = nums[mid], rightMax = nums[mid+1];
        int temp = 0;
        for (int i=mid; i>=left; i--){
            temp += nums[i];
            leftMax = Math.max(leftMax, temp);
        }
        temp = 0;
        for (int i=mid+1; i<=right; i++){
            temp += nums[i];
            rightMax = Math.max(rightMax, temp);
        }
        return Math.max(Math.max(leftRes, rightRes), leftMax+rightMax);
    }
}
