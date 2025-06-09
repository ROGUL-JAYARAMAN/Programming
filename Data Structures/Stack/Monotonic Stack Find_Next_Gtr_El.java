/*  Find the next greater elment with O(n)  */

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int res[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty()&&arr[i]>arr[st.peek()])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                res[i]=-1;
            }
            else
            {
                res[i]=arr[st.peek()];
            }
            st.push(i);
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}