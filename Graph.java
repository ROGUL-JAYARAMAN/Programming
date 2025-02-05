// "static void main" must be defined in a public class.
public class Main {
    
    // Array List Implementation
    public static class GraphArrayList
    {
        // for creating dynamic only declaration 
        // allocate the space in constructor
        int vertex;
        ArrayList<ArrayList<Integer>> graph;
        
        GraphArrayList(int vertex)
        {
            this.vertex=vertex;
            graph=new ArrayList<ArrayList<Integer>>();
            for(int i=0;i<vertex;i++)         //need to create a nested array list
            {                            //we are going inside each arry list and 
                graph.add(new ArrayList<Integer>());
            }
        }
        
        public void addEdge(int source,int destination)
        {
            graph.get(source).add(destination);  //get is used to retrive data based on index   
            
                //undirected graph
            //graph.get(source).add(destination);
            //graph.add(destination).get(source);
        }
        
        public void breadthFirstSearch(int src)
        {
            boolean visited[]=new boolean[vertex];
            Arrays.fill(visited,false);
            Queue<Integer> store=new LinkedList<>();
            visited[src]=true;
            store.add(src);
            while(!store.isEmpty())
            {
                int temp=store.remove();
                System.out.print(temp+" ");
                for(int data:graph.get(temp))
                {
                    if(!visited[data])
                    {
                        visited[data]=true;
                        store.add(data);
                    }
                }
            }
        }
        
        public void printGraph()
        {
            for(int i=0;i<graph.size();i++)
            {
                System.out.print(i+" -> ");
                for(int j=0;j<graph.get(i).size();j++)
                {
                    System.out.print(graph.get(i).get(j)+" ");
                }
                System.out.println();
            }
        }
    }
    
    //Matrix Method
    public static class GraphMatrix
    {
        int vertex;
        int graph[][];
        
        GraphMatrix(int vertex)
        {
            this.vertex=vertex;
            graph=new int[vertex][vertex];
            for(int i=0;i<vertex;i++)
            {
                for(int j=0;j<vertex;j++)
                {
                    graph[i][j]=0;
                }
            }
        }
        
        public void addEdge(int src,int des)
        {
            graph[src][des]=1;
        }
        
        public void printGraph()
        {
            for(int i=0;i<vertex;i++)
            {
                for(int j=0;j<vertex;j++)
                {
                    System.out.print(graph[i][j]+" ");
                }
                System.out.println();
            }
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertex=sc.nextInt();
        int edges= sc.nextInt();
        GraphArrayList g1=new GraphArrayList(vertex);
        GraphMatrix g2=new GraphMatrix(vertex);
        while(edges-- > 0)
        {
            int src=sc.nextInt();
            int des=sc.nextInt();
            g1.addEdge(src,des);
            g2.addEdge(src,des);
        }
        System.out.println("\nArrayList Print");
        g1.printGraph();
        System.out.println("\nMatrix Print");
        g2.printGraph();
        System.out.println("\nBreadth First Search");
        g1.breadthFirstSearch(0);
    }
}