public class Lc0058LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        int res = lengthOfLastWord(s);
        System.out.println(res);
    }

    private static int lengthOfLastWord(String s) {
        int idx = s.length()-1;
        while (idx>=0 && s.charAt(idx) == ' ') idx--;
        int end = idx;
        while (idx>=0 && s.charAt(idx) != ' ') idx--;
        return end-idx;
    }

    private static int lengthOfLastWordSplit(String s) {
        String[] sArr = s.split(" ");
        return sArr[sArr.length-1].length();
    }
}
