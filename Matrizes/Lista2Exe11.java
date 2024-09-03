/*4. Faça um programa que faça a multiplicação de duas matrizes.*/
public class Lista2Exe11 
{
    public static void main(String[] args) 
    {
        int i, j, k, l, max=3, max1=3;
        double[][] mat = new double[max][max1];
        double[][] mat1 = new double[max][max1];
        double[][] mat2 = new double[max][max1];
        double resultado = 0;

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
                mat1[j][i] = (i+2)/(j+1);
            }
        }

        for(j=0;j<max;j++)
        {
            for(k=0;k<max1;k++)
            {
                for(l=0;l<max;l++)
                {
                    System.out.print("("+mat[j][l]+")x("+mat1[l][k]+") + ");
                    resultado += mat[j][l]*mat1[l][k]; 
                }
                System.out.print(" = "+resultado+"\n");
                mat2[j][k] = resultado;
                resultado=0;
            }
            System.out.print("\n");             
        }
                
//============================================================================================================
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
