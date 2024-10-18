// "static void main" must be defined in a public class.
public class Main {
    public static long length(long n)
    {
        long len=0;
        do
        {
            len++;
            n/=10;  
        }while(n!=0);
        
        return len;
    }
    
    public static long SumOfDigit(long num)
    {
        long sum=0;
        if(length(num)!=1)
        {
            while(num!=0)
            {
                sum+=num%10;
                num/=10;
            }
            sum=SumOfDigit(sum);
        }
        else
        {
            return num;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num=sc.nextInt();
        num=SumOfDigit(num);
        System.out.print(num);
    }
}