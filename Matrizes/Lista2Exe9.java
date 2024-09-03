/*2. Faça um algoritmo que construa uma matriz 50 por 50 de números reais e depois de
construída, colocar o conteúdo de sua diagonal principal dentro de um vetor e depois do
vetor montado, imprimir o vetor.*/
public class Lista2Exe9 
{
    public static void main(String[] args) 
    {
        int i, j, max=5, max1=5;
        double[][] mat = new double[max][max1];
        double [] vet = new double[max];

        for(i=0;i<max;i++)
        {
            for(j=0;j<max1;j++)
            {
                mat[i][j] = i+j;
            }
        }

        for(i=0;i<max;i++)
        {
            for(j=0;j<max1;j++)
            {
                if(i == j)
                {
                    vet[i] = mat[i][j];
                }
            }
        }

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
            System.out.print(vet[i]+"  ");
        }
    }
}
