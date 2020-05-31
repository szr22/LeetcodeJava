public class Lc0035SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        int res = searchInsert(nums, target);
        System.out.println(res);
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        int mid = (left+right) / 2;
        while (left<=right){
            if (target<=nums[mid])
                right = mid-1;
            else
                left = mid+1;
            mid = (left+right)>>1;
        }
        return left;
    }
}
