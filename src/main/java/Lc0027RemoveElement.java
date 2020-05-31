public class Lc0027RemoveElement {
    public static void main(String[] args) {
        int[] nums = new int[] {3,2,2,3};
        int val = 3;
        int res = removeElement(nums, val);
        System.out.println(res);
    }
    public static int removeElement(int[] nums, int val) {
        int tail = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i]==val) {
                nums[tail++] = nums[i];
            }
        }
        return tail;
    }
}
