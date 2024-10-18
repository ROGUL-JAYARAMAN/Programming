// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;a[i++]=sc.nextInt());
        int k=sc.nextInt();
        
        int max=Integer.MIN_VALUE;
        int ans=0;
        int st=0;
        int ed=k;
        while(ed<=n)
        {
            for(int i=st;i<=ed;i++)
            {
                ans+=a[i];
            }
            if(ans>max)
            {
                max=ans;
            }
            if(ans<0)
            {
                ans=0;
            }
            ans=0;
            st++;ed++;
        }
        System.out.print(max);
    }
}
