/*3. Faça um programa que gere uma matriz transposta (Matriz transposta é toda a matriz
onde são trocadas as linhas pelas colunas, ou vice-versa).*/
public class Lista2Exe10 
{
    public static void main(String[] args) 
    {
        int i, j, max=5, max1=5;
        double[][] mat = new double[max][max1];
        double[][] mat1 = new double[max][max1];

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
    }
}
