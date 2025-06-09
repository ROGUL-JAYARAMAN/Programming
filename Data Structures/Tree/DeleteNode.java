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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
        {
            return root;
        }
        else if(root.val<key)
        {
            root.right=deleteNode(root.right,key);
        }
        else if(root.val>key)
        {
            root.left=deleteNode(root.left,key);
        }
        else
        {
            //case 1 : Delete node is child node
            if(root.left==null && root.right==null)
            {
                TreeNode toDelete=root; //make a copy of node to be deleted
                toDelete=null; //no use we use delete in cpp 
                root=null; //we have deleteed the root->pointed add so set it to null and return it
                return root;
            }

            //case 2 : Delete node has one child
            else if(root.right==null || root.left==null)
            {
                //Delete node has only right child
                if(root.left==null)
                {
                    TreeNode toDelete=root; //node to be deleted
                    root = root.right; // move the root to its child for changing its parent node
                    toDelete=null;
                    return root;
                }

                //Deletet node has only left child
                if(root.right==null)
                {
                    TreeNode toDelete=root;
                    root = root.left;
                    toDelete = null;
                    return root;
                }
            }

            //case 3 : Delete node has two child
            else 
            {
                TreeNode rightMin = root.right; //store the right-sub-tree's MIN_Value
                TreeNode temp = rightMin; //used itreating to required node 

                //traverse left from right_sub_tree bcz small values locates in left side of a tree
                while(temp.left!=null) 
                {
                    temp=temp.left;
                } 
                rightMin=temp; //found the value and assign it to the req variable
                root.val=temp.val; //change the delete node value to right-sub-tree min value

                //remove the original copy by deleting the right-sub-tree MIN_Value
                root.right=deleteNode(root.right,rightMin.val); 
                return root;                
            }
        }
    return root;
    }
}