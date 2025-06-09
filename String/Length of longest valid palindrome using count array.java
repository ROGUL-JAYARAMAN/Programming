// "static void main" must be defined in a public class.
public class Main {
    
    //Manacher Algorithm
    public static int longestPalindrome(String str,int n)
    {
        int a[]=new int[n];
        for(int i=1;i<n-1;i++)
        {
            int l=i-1;
            int r=i+1;
            while(l>=0&&r<=n-1)
            {
                if(str.charAt(l)==str.charAt(r))
                {
                    ++a[i];
                }
                --l;
                ++r;
            }
        }
        
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;
    }
    
    public static String ConvertToOdd(String str,int n)
    {
        String a="$";
        for(int i=0;i<n;i++)
        {
            a+=str.charAt(i)+"$";
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        str=ConvertToOdd(str,n);
        n=str.length();
        System.out.print(longestPalindrome(str,n));
    }
}