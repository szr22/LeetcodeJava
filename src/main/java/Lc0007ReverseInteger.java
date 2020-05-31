public class Lc0007ReverseInteger {
    public static void main(String[] args) {
        int x = -1234567899;
        int res = reverse(x);
        System.out.println(res);
    }

    private static int reverse(int x) {
        long res = 0;
        for (; x!=0; x/=10){
            res = res*10 + x%10;
        }
        return res>Integer.MAX_VALUE || res<Integer.MIN_VALUE ? 0 : (int)res;
    }
}
