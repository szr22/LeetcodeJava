public class Lc0104MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.right = new TreeNode(2);
        t.left.left = new TreeNode(3);
        t.left.right = new TreeNode(4);
        t.right.left = new TreeNode(4);
        t.right.right = new TreeNode(3);

        int res = maxDepth(t);
        System.out.println(res);
    }

    private static int maxDepth(TreeNode root) {
        if (root==null) return 0;
        return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
