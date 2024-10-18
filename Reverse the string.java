// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str[]=sc.nextLine().split(" ");
        for(int i=str.length-1;i>=0;i--)
        {
            System.out.print(str[i]+" ");
        }
        System.out.println();
        for(int i=0;i<str.length;i++)
        {
            for(int j=str[i].length()-1;j>=0;j--)
            {
                System.out.print(str[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}