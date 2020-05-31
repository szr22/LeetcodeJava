public class Lc0067AddBinary {
    public static void main(String[] args) {
        String a = "11", b = "1";
        String res = addBinary(a, b);
        System.out.println(res);

        a = "1010";
        b = "1011";
        res = addBinary(a, b);
        System.out.println(res);
    }

    private static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0, idx1 = a.length()-1, idx2 = b.length()-1;
        while (idx1>=0 && idx2>=0){
            carry += a.charAt(idx1--) - '0';
            carry += b.charAt(idx2--) - '0';
            sb.insert(0, (char) (carry%2+'0'));
            carry /= 2;
        }
        while (idx1>=0){
            carry += a.charAt(idx1--) - '0';
            sb.insert(0, (char) (carry%2+'0'));
            carry /= 2;
        }
        while (idx2>=0){
            carry += a.charAt(idx2--) - '0';
            sb.insert(0, (char) (carry%2+'0'));
            carry /= 2;
        }
        if (carry == 1) {
            sb.insert(0, '1');
        }
        return sb.toString();
    }
}
