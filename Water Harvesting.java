// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;a[i++]=sc.nextInt());
        int l_max[]=new int[n];
        int r_max[]=new int[n];
        int sum=0;
        int max=a[0];
        //l max
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            l_max[i]=max;
        }
        
        //r max
        max=a[n-1];
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            r_max[i]=max;
        }
        
        //find difference of min and array element
        for(int i=0;i<n;i++)
        {
            int min=0;
            if(l_max[i]<=r_max[i])
            {
                min=l_max[i];
            }
            else
            {
                min=r_max[i];
            }
            sum+=min-a[i];
        }
        System.out.print(sum);
    }
}