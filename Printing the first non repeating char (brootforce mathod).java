// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int state=0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    state++;
                }
            }
            if(state==1)
            {
                System.out.print(str.charAt(i));
                break;
            }
            state=0;            
        }

    }
}