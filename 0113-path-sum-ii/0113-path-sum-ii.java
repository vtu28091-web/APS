class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(root, targetSum, path, ans);
        return ans;
    }
    void dfs(TreeNode root, int target, List<Integer> path,
             List<List<Integer>> ans) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        if (root.left == null && root.right == null) {
            if (target == root.val) {
                ans.add(new ArrayList<>(path));
            }
        } else {
            dfs(root.left, target - root.val, path, ans);
            dfs(root.right, target - root.val, path, ans);
        }
        path.remove(path.size() - 1);
    }
}