/*7. Dados dois vetores de tamanho N, faça uma função que diga se eles possuam conteúdo
igual*/
import java.util.Scanner;
public class Lista2Exe7 
{
    public static void main(String[] args) 
    {
        int i, max=3;
        double[] vet1 = new double[max];
        double[] vet2 = new double[max];
        Scanner tec = new Scanner(System.in);
        int cont=0;

        for(i=0;i<max;i++)
        {
            System.out.println("Informe o "+(i+1)+"º valor vetor 1:");
            vet1[i] = tec.nextDouble();
            if(i > 1)
            {
                if(vet1[i] < vet1[i-1])
                {
                    double aux = vet1[i-1];
                    vet1[i-1] = vet1[i];
                    vet1[i] = aux;
                }
            }
        }
        for(i=0;i<max;i++)
        {
            System.out.println("Informe o "+(i+1)+"º valor vetor 2:");
            vet2[i] = tec.nextDouble();
            if(i > 1)
            {
                if(vet2[i] < vet2[i-1])
                {
                    double aux = vet2[i-1];
                    vet2[i-1] = vet2[i];
                    vet2[i] = aux;
                }
            }
        }

        for(i=0;i<max;i++)
        {
            if(vet1[i] != vet2[i])
            {
                cont++;
            }
        }

        System.out.printf("\n\nVetor 1:\n");
        for(i=0;i<max;i++)
        {
            System.out.print(vet1[i]+"  ");
        }
        System.out.printf("\n\nVetor 2:\n");
        for(i=0;i<max;i++)
        {
            System.out.print(vet2[i]+"  ");
        }

        if(cont == 0)
        {
            System.out.println("\n\nOs vetores tem elementos iguais");
        }
        else
        {
            System.out.println("\n\nOs vetores não tem elementos iguais");
        }

        tec.close();
    }
}
