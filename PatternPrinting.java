// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        //Print Upward
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i>=j)
                {
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------");
        
        //Print Downward
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i<=j)
                {
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------");
        
        //Print Upward - Number
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i>=j)
                {
                    System.out.print(i+1+" ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------");
        
        //Print Upward - Number
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i>=j)
                {
                    System.out.print(j+1+" ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------");
        
        //Print Upward - ABCDE
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i>=j)
                {
                    char ch=(char)(65+j);
                    System.out.print(ch+" ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------");
        
        //Print Upward - ABCDE
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i>=j)
                {
                    char ch=(char)(65+i);
                    System.out.print(ch+" ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------");
        
        //Print
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j>n-i)
                {
                    System.out.print("*"+" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------");
        
        //Print -Z
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if((i==1)||(i==n)||i+j==n+1)
                {
                   System.out.print("*"+" "); 
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------");

        // "static void main" must be defined in a public class.

        int l=1;
        int r=n*n+1;
        for(int i=n;i>0;i--)
        {
            for(int s=n;s>i;s--)
            {
                System.out.print("--");
            }
            for(int j=i;j>0;j--)
            {
                System.out.print(l++ + "*");
            }
            for(int j=i;j>1;j--)
            {
                System.out.print(r++ +"*");
            }
            System.out.println(r);
            r=r-(i-1)*2;
        }
    }
}
    }
}