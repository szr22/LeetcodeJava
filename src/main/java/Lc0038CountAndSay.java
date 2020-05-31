public class Lc0038CountAndSay {
    public static void main(String[] args) {
        int n = 10;
        String res = countAndSay(n);
        System.out.println(res);
    }

    public static String countAndSay(int n) {
        String str = "1";
        while (--n>0){
            int cnt = 1;
            StringBuilder sb = new StringBuilder();
            char[] chars = str.toCharArray();
            int len = chars.length;
            for (int i=1; i<len; i++){
                if (chars[i-1]==chars[i])
                    cnt++;
                else {
                    sb.append(cnt).append(chars[i - 1]);
                    cnt = 1;
                }
            }
            str = sb.append(cnt).append(chars[len-1]).toString();
        }
        return str;
    }
}
