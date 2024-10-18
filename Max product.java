// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int mul=1;
        int add=0;
        while(num>4)
        {
            mul*=3;
            add+=3;
            num-=3;
        }
        if(num>0)
        {
            mul*=num;
            add+=num;
            num-=num;
        }
        System.out.print(mul+" "+add);
    }
}