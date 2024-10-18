// "static void main" must be defined in a public class.
public class Main {
    
    public static boolean palindrome(int num)
    {
        if(num<0)
        {
            return false;
        }
        int rev=0;
        int safe=num;
        while(num!=0)
        {
            rev*=10;
            rev+=num%10;
            num/=10;
        }
        if(rev==safe)
        {
            return true;
        }
        return false;
    }

    public static boolean primeNumber(int num)
    {
        boolean res=true;
        if(num<=1)
        {
            return false;
        }
        else
        {
            for(int i=2;i<=Math.sqrt(num);i++)
            {
                if(num%i==0)
                {
                    return false;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        int s1=start;
        
        //Prime Number
        while(start<end)
        {    
            if(primeNumber(start))
            {
                System.out.println("Prime Number : "+start);
            }
            start++;
        }
        
        //Palindrome
        while(s1<end)
        {
            if(palindrome(s1))
            {
                System.out.println("Palindrome Number : "+s1);
            }
            s1++;
        }
    }
}