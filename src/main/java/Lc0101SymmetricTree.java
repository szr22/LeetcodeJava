import java.util.LinkedList;

public class Lc0101SymmetricTree {
    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.right = new TreeNode(2);
        t.left.left = new TreeNode(3);
        t.left.right = new TreeNode(4);
        t.right.left = new TreeNode(4);
        t.right.right = new TreeNode(3);

        boolean res = isSymmetric(t);
        System.out.println(res);
    }

    private static boolean isSymmetricRec(TreeNode root) {
        return root == null || helper(root.left, root.right);
    }

    private static boolean helper(TreeNode left, TreeNode right) {
        if (left==null || right==null) return left==right;
        if (left.val != right.val) return false;
        return helper(left.left, right.right)
                && helper(left.right, right.left);
    }

    private static boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        LinkedList<TreeNode> q = new LinkedList<>();
        q.add(root.left);
        q.add(root.right);

        TreeNode left, right;
        while (q.size()>1) {
            left = q.pop();
            right = q.pop();
            if (left==null && right==null) continue;
            if (left==null || right==null) return false;
            if (left.val!=right.val) return false;
            q.add(left.left);
            q.add(right.right);
            q.add(left.right);
            q.add(right.left);
        }
        return true;
    }
}
