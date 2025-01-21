import java.util.Scanner;

public class Main 
{
    public static class Node
    {
        int data;
        Node next;

        Node(int data)   // constructor for creating node
        {
            this.data = data;  // insert data
            next = null;       // initialize next-address  
        }
    }

    public static class LinkedList
    {
        Node head = null;
        Node tail = null;
        int len = 0;

        public boolean isEmpty()  // check if linked list is empty
        {
            return head == null;
        }

        public void ins_beg(int data)  // insert data at the beginning of the linked list
        {
            Node newnode = new Node(data);
            len++;
            if (isEmpty())  // if the list is empty, head and tail point to new node
            {
                head = newnode;
                tail = newnode;
            }
            else  // if the list is not empty
            {
                newnode.next = head;  // newnode->next = head
                head = newnode;       // head = newnode
            }
        }

        public void ins_end(int data)  // insert data at the end of the linked list
        {
            Node newnode = new Node(data);
            len++;
            if (isEmpty())  // if the list is empty, head and tail point to new node
            {
                this.head = newnode;
                this.tail = newnode;
            }
            else  // if the list is not empty
            {
                this.tail.next = newnode;  // tail->next = newnode
                this.tail = newnode;       // tail = newnode
            }
        }

        public void ins_btw(int pos,int data)  //Insert in between
        {
            if(pos-1==0)            //for 0 index
            {
                ins_beg(data);
            }
            else(pos-1==len)        //for last index
            {
                ins_end(data);
            }
            else       //for inbetween -> 1.create new_node 2.connect newnode & temp.next 3.connect temp & new_node 4.temp -> req.pos-1
            {
                Node newnode=new Node(data);
                int i=0;
                Node temp=this.head;  
                while(temp.next!=null)  
                {
                    if(pos-2==i)
                    {
                        break;
                    }
                    temp=temp.next;
                }
                newnode.next=temp.next;
                temp.next=newnode;
            }
        }
        
        public int delete_beg()  // deleting the head of linked List -> change the head to cur.head->next
        {
            if (isEmpty())  // if LinkedList is Empty
            {
                System.out.print("Linked List Is Empty");
                return -1;
            } 
            else if (head == tail)  // linked list contain only one element head=tail
            {                 
                Node temp = this.head;    // store head for value retrieving
                int num = temp.data;      
                this.head = null;     // set head to null
                this.tail = null;     // set tail to null 
                --len;   
                return num;
            }
            else
            {
                Node temp = this.head;    // store the head in temp
                head = this.head.next;    // change head to cur.head->next
                int num = temp.data;      // store the value of deleted node for returning
                --len;
                return num;               // return deleted value
            }
        }

        public int delete_end()  // traverse up to tail->prev and set tail as tail->prev
        {                       
            if (isEmpty())  // if LinkedList is Empty
            {
                System.out.print("Linked List Is Empty");
                return -1;
            } 
            else if (head == tail)  // linked list contain only one element head=tail
            {                 
                Node temp = this.head;    // store head for value retrieving
                int data = temp.data;      
                this.head = null;     // set head to null
                this.tail = null;     // set tail to null    
                --len;
                return data;
            }
            else
            {
                 Node temp = this.head;        // traverse logic 
                while (temp.next != tail)  
                {
                    temp = temp.next;
                }                           
                Node del = tail;         // temp stands in tail->prev, we need to delete tail
                tail = temp;
                tail.next = null;
                int del_data = del.data;
                return del_data;
            }
           
        }

        public int delete_btw(int pos)
        {
            if(pos==1)                   //for deleting 1st element
            {
                return delete_beg();
            }
            else if(pos-1==len)         //for deleting last element
            {
                return delete_end();
            }
            else                        //for deleting in_between element - traverse upto req.pos-1 - store->deleting_node
            {
                Node temp=this.head;         // temp for traverse
                int i=0;                     // for monitoring the cur_index 
                while(temp.next.next!=tail)  // traverse upto delete_node->prev_node
                {                            // traverse_logic
                    if(pos-2==i)
                    {
                        break;
                    }
                    temp=temp.next;
                }                           //traverse logic
                Node delete=temp.next;      //store the delete node for making it next null or to delete it 
                temp.next=temp.next.next;   //disconnect link btw del_node and prev_node
                delete.next=null;           //disconnect link btw del_node and next_node
                return delete.data;
            }
        }

        public void reverse()
        {
            Node reverse_tail=this.head; //after reversed tail converted to head
            Node curr = this.head;
            Node prev = null;
            Node temp = null;
            while (curr != null)  // future change as next-element & current change as pre-element
            {
                temp = curr.next;          // store the next element in a temp to prevent the link breakage
                curr.next = prev;          // change the current->next as prev 
                prev = curr;               // previous change as current 
                curr = temp;               // current will move to next non-reversed next 
            }
            head = prev;
            tail=reverse_tail;
        }

         public Node mid_element(Node head)  //Floid Algorithim -slow_ptr -fast_ptr -both start with head
         {
            Node slow=head;     
            Node fast=head;
            while(fast!=null&&fast.next!=null)      //run until fast!=null && fast->next!=null
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;       //slow will point mid element
         }  

         public boolean palindrome(Node head)
         {
            Node mid=mid_element();
            Node head_1=mid.next;
            boolean res=true;
            Node temp=head;
            while(head_1!=null)
            {
                if(temp.data!=head_1.data)
                {
                    return false;
                }
                temp=temp.next;
                head_1=head_1.next;
            }
            return res;
         } 

        public void print()  // print the linked list
        {
            Node temp = head;  // store the head in temp for traversing or act like an iterator
            while (temp != null)  // check if temp is null
            {
                System.out.print(temp.data + " ");  // print the temp data
                temp = temp.next;  // move temp from current node to next node 
            }
            System.out.println();
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
        list.print();
        list.delete_end();
        list.print();
    }
}
