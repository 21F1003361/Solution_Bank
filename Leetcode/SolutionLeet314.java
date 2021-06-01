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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        
        List<List<Integer>> result=new ArrayList<>();
        Map<Integer,List<Integer>> table=new HashMap<>();
        class pair{
            TreeNode node;
            int seq;
            pair(TreeNode a,int b){
                node=a;
                seq=b;
            }
        }
        
        Queue<pair> Q=new LinkedList<>();
        if(root!=null) Q.add(new pair(root,0));
        
        while(!Q.isEmpty()){
            
            pair p=Q.remove();
            //System.out.println(p.node.val);
            List<Integer> clist=table.getOrDefault(p.seq,new ArrayList<Integer>());
            clist.add(p.node.val);
            table.put(p.seq,clist);
            if(p.node.left!=null) Q.add(new pair(p.node.left,p.seq-1));
            if(p.node.right!=null) Q.add(new pair(p.node.right,p.seq+1));
            
        }
        
        List<Integer> keys=new ArrayList<>(table.keySet());
        Collections.sort(keys);
        for(int a:keys)
            result.add(table.get(a));
        
        return result;
        
    }
}