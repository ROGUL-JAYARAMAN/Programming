import java.util.*;
public class Main
{

    public static class Node  //strore tree node structure
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static class BinaryTree
    {
        Node root=null;
        
        public boolean isEmpty()
        {
            return this.root==null
        }

        public Node Level_Order_Insert(int data,Node root)
        {
            if(isEmpty())
            {
                Node newnode=new Node(data);
                return newnode;
            }
            Queue<Node> store=new LinkedList<>();
            store.add(root);
            int front=0;
            int rear=0;
            while(front<=rear)
            {
                Node stand=store.remove();
                if(cur.left==null)
                {
                    Node newnode=new Node();
                    stand.left=newnode
                    return root;
                }
                else
                {
                    store.add(stand.left);
                    rear++;
                }
                if(cur.right==null)
                {
                    Node newnode=new Node();
                    stand.right=newnode;
                    return root;
                }
                else
                {
                    store.add(stand.left);
                    rear++;
                }
                front++;
            }
            return root;
        }

        public void print(Node root)
        {
            if(isEmpty())
            {
                return;
            }
            Queue<Node> store=new LinkedList()<>;
            store.add(root);
            int front=0;
            int rear=0;
            while(front<=rear)
            {
                Node stand=store.remove();
                System.out.print(stand.data);
                if(stand.left!=null)
                {
                    stand.add(stand.left);
                    rear++;
                }
                if(stand.right!=null)
                {
                    stand.add(stand.right);
                    rear++;
                }
                front++;
            }
        }
    }

    public static void main(String[]args)
    {
        
    }

}