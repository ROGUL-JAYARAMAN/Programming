// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;arr[i++]=sc.nextInt());
        Stack<Integer>s1=new Stack<>();
        Stack<Integer>s2=new Stack<>();
        Stack<Integer>temp=new Stack<>();
        int res[]=new int[n];
        Arrays.fill(res,-1);
        
        for(int i=0;i<n;i++)
        {
            while(!s1.isEmpty()&&arr[i]>arr[s1.peek()])
            {
                temp.push(s1.pop());
            }
            while(!s2.isEmpty()&&arr[i]>arr[s2.peek()])
            {
                res[s2.pop()]=arr[i];
            }
            while(!temp.isEmpty())
            {
                s2.push(temp.pop());
            }
            s1.push(i);
        }
        for(int i=0;i<n;System.out.println(res[i++]));
    }
}