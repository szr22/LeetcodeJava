import java.util.HashMap;
import java.util.Map;

public class Lc0013RomanToInteger {
    public static void main(String[] args) {
        String s = "Ⅷ";
        int res = romanToInt(s);
        System.out.println(res);

        s = "LVIII";
        res = romanToInt(s);
        System.out.println(res);

        s = "MCMXCIV";
        res = romanToInt(s);
        System.out.println(res);
    }
    private static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len = s.length();
        int sum = map.get(s.charAt(len-1));
        for(int i=len-2; i>=0; i--){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                sum -= map.get(s.charAt(i));
            } else {
                sum += map.get(s.charAt(i));
            }
        }
        return sum;
    }
}
