// "static void main" must be defined in a public class.
public class Main {
    public static int length(int n)
    {
        int len=0;
        do
        {
            len++;
            n/=10;  
        }while(n!=0);
        
        return len;
    }
    
    public static int SumOfDigit(int num)
    {
        int sum=0;
        while(num!=0)
        {
            sum+=(num%10);
            num/=10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(length(num)!=1)
        {
            num=SumOfDigit(num);
        }
        System.out.print(num);
    }
}