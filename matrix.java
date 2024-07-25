import java.util.Scanner;

class matrix_op
{
    int i=0;
    int j=0;
    int k=0;
    int A[][]=new int[3][3];
    int B[][]=new int[3][3];
    int C[][]=new int[3][3];
    Scanner sc=new Scanner(System.in);
    void getmatrix()
    {
        System.out.println("enter matrix A :");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                A[i][j]=sc.nextInt();
            
            }
        }

        System.out.println("enter matrix B :");

        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                B[i][j]=sc.nextInt();
    
            }
        } 

        
    }

    void putmatrix()
    {
        System.out.println("matrix A is :");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(A[i][j]+ " ") ;
            }
            System.out.println();
        }

        System.out.println("matrix B is :");

        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(B[i][j]+ " ") ;
            } 
            System.out.println();
        }
        

       
    }

    void addmatrix()
    {
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                for(k=0;k<3;k++)
                {
                    C[i][j]=A[i][j]+B[i][j];
                }
            } 
        }

        System.out.println("addition of matrix A and B is :");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(C[i][j]+ " ") ;
            } 
            System.out.println();
        }
    }
    
}

public class matrix 
{
    public static void main(String[] args)
    {
        matrix_op m1=new matrix_op();
        m1.getmatrix();
        m1.putmatrix();
        m1.addmatrix();

    }
}
