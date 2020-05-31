public class Lc0069SqrtX {
    public static void main(String[] args) {
        int x = 80;
        int res = mySqrt(x);
        System.out.println(res);
    }

    private static int mySqrt(int x) {
        long n = x;
        while (n*n>x){
            n = (n + x/n) >> 1;
            System.out.println(n);
        }
        return (int) n;
    }
}
