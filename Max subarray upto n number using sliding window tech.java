// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;a[i++]=sc.nextInt());
        int k=sc.nextInt();
        
        int max=0;
        for(int i=0;i<k;i++) //finding the sum for first window for comparing with the next window sum
        {
            max+=a[i]; //finding sum for first window 
        }
        int cur_sum=max;
        for(int i=k;i<n;i++) //a[i]->next window number //a[i-k]->moves to the previous window last element 
        {
            cur_sum=cur_sum+a[i]-a[i-k]; //subracting the leaving window number and add the next window number
            if(cur_sum>max)
            {
                max=cur_sum;
            }
        }
        System.out.print(max);
    }
}