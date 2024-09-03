/*5. Faça um programa que faça a soma de duas matrizes.  */
public class Lista2Exe12 
{
    public static void main(String[] args) 
    {
        int i, j, max=3, max1=3;
        double[][] mat = new double[max][max1];
        double[][] mat1 = new double[max][max1];
        double[][] mat2 = new double[max][max1];

        for(i=0;i<max;i++)
        {
            for(j=0;j<max1;j++)
            {
                mat[i][j] = i+j*2;
            }
        }

        for(j=0;j<max;j++)
        {
            for(i=0;i<max1;i++)
            {
                mat1[j][i] = mat[i][j];
            }
        }

        for(j=0;j<max;j++)
        {
            for(i=0;i<max1;i++)
            {
                mat2[j][i] = mat[i][j]+mat1[i][j];
            }
        }

//========================================================================================================
        for(i=0;i<max;i++)
        {
            for(j=0;j<max1;j++)
            {
                System.out.print(mat[i][j]+"  ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        for(i=0;i<max;i++)
        {
            for(j=0;j<max1;j++)
            {
                System.out.print(mat1[i][j]+"  ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        for(i=0;i<max;i++)
        {
            for(j=0;j<max1;j++)
            {
                System.out.print(mat2[i][j]+"  ");
            }
            System.out.print("\n");
        }
    }
}
