// "static void main" must be defined in a public class.
public class Main {
    public static int Travel(int mat[][],int row,int col)
    {
        int row_len=mat.length;
        int col_len=mat[0].length;
        if(row>=row_len||col>col_len)
        {
            return 0;
        }
        if(row==row_len-1 && col==col_len-1)
        {
            return 1;
        }
        return Travel(mat,row,col+1)+Travel(mat,row+1,col);
    }
    public static void main(String[] args) {
        int m=2;
        int n=3;
        int mat[][]=new int[m][n];
        System.out.print(Travel(mat,0,0));
    }
}