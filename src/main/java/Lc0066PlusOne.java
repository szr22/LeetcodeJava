import java.util.Arrays;

public class Lc0066PlusOne {
    public static void main(String[] args) {
        int[] digits = new int[] {4,3,2,1};
        int[] res = plusOne(digits);
        System.out.println(Arrays.toString(res));

        digits = new int[] {9, 9, 9};
        res = plusOne(digits);
        System.out.println(Arrays.toString(res));

        digits = new int[] {2, 9, 9};
        res = plusOne(digits);
        System.out.println(Arrays.toString(res));
    }

    private static int[] plusOne(int[] digits) {
        int n = digits.length-1;
        if (digits[n]<9){
            digits[n] += 1;
        } else {
            do {
                digits[n--] = 0;
            } while (n>=0 && digits[n]==9);
            if (digits[0] != 0){
                digits[n]++;
            }else{
                digits = new int[digits.length+1];
                digits[0] = 1;
            }
        }
        return digits;
    }
}
