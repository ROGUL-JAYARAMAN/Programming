// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        Stack<Character> st=new Stack<>();
        boolean res=false;
        for(int i=0;i<len;i++)
        {
            char a=str.charAt(i);
            if((a=='{')||(a=='(')||(a=='['))
            {
                st.push(a);
            }
            else
            {
                if(!st.isEmpty())
                {    
                    if((st.peek()=='{'&&a=='}')||(st.peek()=='['&&a==']')||(st.peek()=='('&&a==')'))
                    {
                        st.pop();
                        res=true;
                    }
                    else
                    {
                        res=false;
                        break;
                    }
                }
                else
                {
                    res=false;
                    break;
                }
            }
        }
        if(!st.isEmpty())
        {
            res=false;
        }
        System.out.print(res);
    }
}