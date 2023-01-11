/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> input1=new ArrayList<Integer>();
    List<Integer> input2=new ArrayList<Integer>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> output=new ArrayList<Integer>();
        Inorder(root1,input1);
        Inorder(root2,input2);
        int i = 0, j = 0, k = 0;
        while (i<input1.size() && j <input2.size())
        {
            if (input1.get(i) < input2.get(j))
                output.add(input1.get(i++));
            else
                output.add(input2.get(j++));
        }
        while (i < input1.size())
            output.add(input1.get(i++));
        while (j < input2.size())
            output.add(input2.get(j++));
        return output;
    }
    void Inorder(TreeNode node,List<Integer> input)
    {
        if (node == null)
            return;
        Inorder(node.left,input);
        input.add(node.val);
        Inorder(node.right,input);
    }
}
