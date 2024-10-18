import java.util.Scanner;

public class Main 
{
    public static class Node
    {
        int data;
        Node next;

        Node(int data)   //constructor for creating node
        {
            this.data = data;  //insert data
            next = null;       //initialize next-add  
        }
    }

    public static class LinkedList
    {
        Node head = null;
        Node tail = null;
        int len = 0;

        boolean isEmpty()  // check if linked list is empty
        {
            return head == null;
        }

        void ins_beg(int data)  //insert data at the beginning of the linked list
        {
            Node newnode = new Node(data);
            len++;
            if (isEmpty())  //if the list is empty, head and tail point to new node
            {
                head = newnode;
                tail = newnode;
            }
            else  //if the list is not empty
            {
                newnode.next = head;  //newnode->next = head
                head = newnode;       //head = newnode
            }
        }

        void ins_end(int data)  //insert data at the end of the linked list
        {
            Node newnode = new Node(data);
            len++;
            if (isEmpty())  //if the list is empty, head and tail point to new node
            {
                this.head = newnode;
                this.tail = newnode;
            }
            else  //if the list is not empty
            {
                this.tail.next = newnode;  //tail->next = newnode
                this.tail = newnode;       //tail = newnode
            }
        }
        
        void reverse()
        {
            Node curr=this.head;
            Node prev=null;
            Node temp=null;
            while(curr!=null)  //future change as next-element & current change as pre-element
            {
                temp=curr.next;          //store the next element in a temp to prevent the link breakage
                curr.next=prev;          //change the current->next as prev *next will be the prev* 
                prev=curr;               //previous change as current 
                curr=temp;               //current will moved to next non-reversed next *first el link br*
            }
            head=prev;
        }

        void print()  //print the linked list
        {
            Node temp = head;  //store the head in temp for traversing or act like an iterator
            while (temp != null)  //check if temp is null (temp has traversed the last element)
            {
                System.out.print(temp.data + " ");  //print the temp data
                temp = temp.next;  //move temp from current node to next node 
            }
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        while (sc.hasNextInt()) 
        {
            int data = sc.nextInt();
            list.ins_beg(data);
        }
        list.print();
        list.reverse();
        System.out.print("\n"+"Reversed Value of Linked List : ");
        list.print();
    }
}
