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
            return this.root==null;
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
                if(stand.left == null && stand.data != -1)
                {
                    Node newnode=new Node(data);
                    stand.left=newnode;
                    return root;
                }
                else
                {
                    store.add(stand.left);
                    rear++;
                }
                if(stand.right==null && stand.data != -1)
                {
                    Node newnode=new Node(data);
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
            Queue<Node> store=new LinkedList<>();
            store.add(root);
            int front=0;
            int rear=0;
            while(front<=rear)
            {
                Node stand=store.remove();
                if(stand.data==-1)
                {
                    front++;
                    continue;
                }
                System.out.print("\n root : "+stand.data );
                if(stand.left!=null)
                {
                    System.out.print(" left : "+ stand.left.data );
                    store.add(stand.left);
                    rear++;
                }
                if(stand.right!=null)
                {
                    System.out.print(" right : "+stand.right.data);
                    store.add(stand.right);
                    rear++;
                }
                front++;
            }
        }
        
        public int sumOfLeftNode(Node root)
        {
            int sum=0;
            if(isEmpty())
            {
                return sum;
            }
            Queue<Node> store = new LinkedList<>();
            store.add(root);
            int front=0;
            int rear=0;
            while(front<=rear)
            {
                Node temp=store.remove();
                if(temp.left!=null)
                {
                    sum+=temp.left.data;
                    store.add(temp.left);
                    rear++;
                }
                if(temp.right!=null)
                {
                    store.add(temp.right);
                    rear++;
                }
                front++;
            }
            return sum;
        }

        
    }

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String str[] = sc.nextLine().split(" ");
        int num[] = new int[str.length];
        int i=0;
        for(String st:str)
        {
            if(st.equals("N"))
            {
                num[i++] = -1;
            }
            else
            {
                num[i++]=Integer.parseInt(st);
            }
        }
        BinaryTree bt= new BinaryTree();
        for(i=0;i<num.length;i++)
        {
            bt.root=bt.Level_Order_Insert(num[i],bt.root);
        }
        bt.print(bt.root);
        System.out.print("\n Sum of left node : "+bt.sumOfLeftNode(bt.root));

    }

}