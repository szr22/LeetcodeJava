public class Lc0014LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","floght"};
        String res = longestCommonPrefix(strs);
        System.out.println(res);
    }

    private static String longestCommonPrefix(String[] strs){
        int n = strs.length;
        if (n==0) return "";
        int minLen = 0x7fffffff;
        for (String str: strs) minLen = Math.min(minLen, str.length());
        for (int j=0; j<minLen; j++){
            for (int i=0; i<n; i++){
                if (strs[0].charAt(j) != strs[i].charAt(j)){
                    return strs[0].substring(0, j);
                }
            }
        }
        return strs[0].substring(0, minLen);
    }
}
