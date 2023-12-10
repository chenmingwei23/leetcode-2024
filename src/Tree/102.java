class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Map<Integer, List<Integer>> levelToNode = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        DFS(root, levelToNode, 0);
        for(int i = 0; i < levelToNode.size(); i ++) {
            res.add(levelToNode.get(i));
        }
        return res;
    }

    public void DFS(TreeNode node, Map<Integer, List<Integer>> map, int currentHeight) {
        if (node == null) {
            return;
        }
        if(map.get(currentHeight) == null) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(node.val);
            map.put(currentHeight, tmp);
        }
        else{
            map.get(currentHeight).add(node.val);
        }
        currentHeight ++;
        DFS(node.left, map, currentHeight);
        DFS(node.right, map, currentHeight);
    }
}