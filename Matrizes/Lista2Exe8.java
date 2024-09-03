/*1. Faça um algoritmo que construa uma matriz de nome MAT de 10 linhas e 15 colunas
contendo números inteiros. Em seguida escreva a soma dos elementos de cada linha e se
a soma dos elementos é par ou impar. Por fim escreva a soma dos elementos de cada
coluna e se a soma dos elementos é par ou impar.*/
public class Lista2Exe8 
{
    public static void main(String[] args) 
    {
        int i, j, max=10, max1=15, soma=0, cont=0, cont2=0;
        int[][] mat = new int[max][max1];
        int[] coluna = new int[max1];

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
                if(cont2 == 0)
                {
                    coluna[j] = mat[i][j];
                }
                if(cont2 > 0)
                {
                    coluna[j] += mat[i][j];
                } 
            }
            cont2++;       
        }

        System.out.printf("\n");
        for(i=0;i<max;i++)
        {
            for(j=0;j<max1;j++)
            {
                soma += mat[i][j];
            }
            
            if(soma % 2 == 0)
            {
                cont++;
            }
            else
            {
                cont--;
            }

            for(j=0;j<max1;j++)
            {
                System.out.print(mat[i][j]+"  ");
            }

            if(cont > 0)
            {
                System.out.printf("| "+soma+"  é par\n");
            }
            if(cont < 0)
            {
                System.out.printf("| "+soma+"  é ímpar\n");
            }

            soma =0;
            cont=0;
        }
        
        System.out.println("----------------------------------------");
        for(i=0; i<max1;i++)
        {
            System.out.print(coluna[i]);
            if(coluna[i] % 2 == 0)
            {
                System.out.printf(" é par  ");
            }
            else
            {
                System.out.printf(" é ímpar  ");
            }
        }
    }    
}