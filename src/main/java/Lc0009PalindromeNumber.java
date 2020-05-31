public class Lc0009PalindromeNumber {
    public static void main(String[] args) {
        int x = 12321;
        boolean res = isPalindrome(x);
        System.out.println(res);

        x = 0;
        res = isPalindrome(x);
        System.out.println(res);
    }
    private static boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x!=0 && x%10==0) return false;
        int halfReverseX = 0;
        for(;x>halfReverseX;x/=10){
            halfReverseX = halfReverseX*10 +x%10;
        }
        return halfReverseX == x || halfReverseX/10 == x;
    }

    private static boolean isPalindromeToChar(int x) {
        if(x<0) return false;
        String str = String.valueOf(x);
        int n = str.length();
        int end = n-1;
        for(int i=0; i<n; i++){
            if(i>=end){
                break;
            }
            if(str.charAt(i)!=str.charAt(end)){
                return false;
            }
            end--;
        }
        return true;
    }
}
