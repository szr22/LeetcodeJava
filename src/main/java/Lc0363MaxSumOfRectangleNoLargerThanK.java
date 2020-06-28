import java.util.TreeSet;

public class Lc0363MaxSumOfRectangleNoLargerThanK {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = {{1,0,1}, {0,-2,3}};
        int k = 2;
        int res = maxSumSubmatrix(matrix, k);
        System.out.println(res);
    }

    private static int maxSumSubmatrix(int[][] matrix, int k) {
        int h = matrix.length, w = 0;
        if (h>0) w = matrix[0].length;
        if (h*w==0) return 0;

        int mx = Math.max(h,w), mn = Math.min(h,w);
        int res = Integer.MIN_VALUE;
        for (int x=0; x<mn; x++){
            int[] sums = new int[mx];
            for (int y = x; y<mn; y++){
                TreeSet<Integer> set = new TreeSet<>();
                int num = 0;
                for (int z=0; z<mx; z++){
                    sums[z] += h>w ? matrix[z][y] : matrix[y][z];
                    num += sums[z];
                    if (num<=k) res = Math.max(res, num);
                    Integer i = set.ceiling(num-k);
                    if (i!=null) res = Math.max(res, num-i);
                    set.add(num);
                }
            }
        }
        return res;
    }
}
