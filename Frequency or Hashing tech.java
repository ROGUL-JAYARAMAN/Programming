// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //getting array elements
        ArrayList<Integer> a=new ArrayList();
        while(sc.hasNext())
        {
            a.add(sc.nextInt());
        }
        
        //Getting max element
        Iterator<Integer> it=a.iterator();
        int max=Integer.MIN_VALUE;
        while(it.hasNext())
        {
            int num=it.next();
            if(num>max)
            {
                max=num;
            }
        }
        
        //Hashing technique or Frequency method
        Iterator<Integer> freq_it=a.iterator(); 
        int freq[]=new int[max+1];
        // Arrays.fill(freq,0);
        while(freq_it.hasNext())
        {
            int num=freq_it.next();
            freq[num]++;
        }
        
        //printing - 1 -> print in ascending order frequency
        System.out.println("Print - 1 ");
        for(int i=0;i<max+1;i++)
        {
            if(freq[i]!=0)
            {
                System.out.println(i + " -> "+freq[i]);
            }
        }
        
        System.out.println("\n"+"Print - 2");
        
        //printing - 2  -> print in input order frequency
        Iterator<Integer> print_it=a.iterator();
        while(print_it.hasNext())
        {
            int num=print_it.next();
            if(freq[num]!=0)
            {
                System.out.println(num+" -> "+freq[num]);
                freq[num]=0;
            }
        }
    }
}