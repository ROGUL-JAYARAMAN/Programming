// "static void main" must be defined in a public class.
public class Main {
    public static void Sort(int a[],float b[],int n,ArrayList arr)
    {
        int s1=0;
        int s2=0;
        while(s1<n||s2<n)
        {
            if(s1<n&&s2<n){
            if(a[s1]>b[s2])
            {
                arr.add(a[s1]);
                s1+=1;
            }
            else
            {
                arr.add(a[s2]);
                s2+=1;
            }}
            if(s1<n)
            {
                arr.add(a[s1]);
                s1+=1;
            }
            if(s2<n)
            {
                arr.add(b[s2]);
                s2+=1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        float b[]=new float[n];
        
        for(int i=0;i<n;a[i++]=sc.nextInt());
        for(int i=0;i<n;b[i++]=sc.nextFloat());
        
        ArrayList arr=new ArrayList<>();
        Sort(a,b,n,arr);
        Iterator it=arr.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
    }
}