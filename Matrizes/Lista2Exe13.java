/*5. Faça um programa que preencha uma matriz 7x7 de números inteiros e crie dois vetores
com sete posições cada um, que contenham respectivamente, o maior elemento de
cada uma das linhas e o menor elemento de cada uma das colunas. Escreva a matriz
e os dois vetores gerados.*/
public class Lista2Exe13 
{
    public static void main(String[] args) 
    {
        int i, j, max=3, max1=3;
        int[][] mat1 = new int[max][max1];
        int[] vet1 = new int[max];
        int[] vet2 = new int[max];
        int cont=0;

        for(i=0;i<max;i++)
        {
            for(j=0;j<max1;j++)
            {
                //mat1[i][j] = ((i+2)/(j+1))+(i*j);
                mat1[i][j] = (((i+2)/(j+1))+(i*j))-(i);
            }
        }

        for(i=0;i<max;i++)
        {
            for(j=0;j<max1;j++)
            {
                if(cont == 0)
                {
                    vet1[i] = mat1[i][j];
                    vet2[i] = mat1[j][i];
                    cont++;
                }
                else if(cont > 0)
                {
                    if(vet1[i] > mat1[i][j])
                    {
                        vet1[i] = mat1[i][j];
                    }

                    if(vet2[i] < mat1[j][i])
                    {
                        vet2[i] = mat1[j][i];
                    }
                }
                System.out.print(mat1[i][j]+"  ");
            }
            cont--;
            System.out.print("| "+vet1[i]+"\n");
        }

        System.out.print("------------\n");
        for(i=0;i<max;i++)
        {
            System.out.print(vet2[i]+"  ");
        }
    }
}
