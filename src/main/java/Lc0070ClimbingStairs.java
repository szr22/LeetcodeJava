public class Lc0070ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;
        int res = climbStairs(n);
        System.out.println(res);
    }

    private static int climbStairs(int n) {
        int i = 1, j = 1;
        while (--n>0){
            j = j+i;
            i = j-i;
        }
        return j;
    }
}
