public class Lc0028ImplementstrStr {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        int res = strStr(haystack, needle);
        System.out.println(res);
    }

    public static int strStr(String haystack, String needle) {
        int hLen = haystack.length(), nLen = needle.length();
        if (hLen<nLen) return -1;
        for (int i=0; ; i++) {
            if (i+nLen>hLen) return -1;
            for (int j=0; ; j++){
                if (j==nLen) return i;
                if (haystack.charAt(i+j) != needle.charAt(j))
                    break;
            }
        }
    }
}
