/*6. Utilizando vetores, crie um programa que organize uma quantidade qualquer de
números inteiros fornecidos pelo usuário da seguinte forma: primeiro os números pares
em ordem crescente e depois os números ímpares em ordem decrescente.*/
import java.util.Scanner;
//import javax.swing.JOptionPane;
public class Lista2Exe6 
{
    public static void main(String[] args) 
    {
        int i, max=10, cont1=0, cont2=0;
        int[] vet1 = new int[max];
        int[] vet2 = new int[max];
        int[] vet3 = new int[max];
        Scanner tec = new Scanner(System.in);

        for(i=0;i<max;i++)
        {
            //String valor = JOptionPane.showInputDialog("Informe o "+(i+1)+" valor");
            System.out.println("Informe o "+(i+1)+"º valor: ");
            vet1[i] = tec.nextInt();
        }

        for(i=0;i<max;i++)
        {
            if(vet1[i] % 2 ==0)
            {
                vet2[i] = vet1[i];
                cont1++;
            }

            if(vet1[i] % 2 != 0)
            {
                vet3[i]=vet1[i];
                cont2++;
            }
        }
        
        for(i=0;i < (max - i);i++)
        {
            for(int j =0;j < (max - i - 1);j++)
            {
               if(vet2[j] > vet2[j+1])
                {
                    int aux = vet2[j];
                    vet2[j] = vet2[j+1];
                    vet2[j+1] = aux;
                } 
            }
            
        }

        for(i=0;i<(max-1);i++)
        {
            for(int j =0; j< (max-i-1);j++)
            {
                if(vet3[j] < vet3[j+1])
                {
                    int aux = vet3[j];
                    vet3[j] = vet3[j+1];
                    vet3[j+1] = aux;
                }   
            }

        }

        System.out.printf("\n\nvetor 1:\n");
        for(i=0;i<max;i++)
        {
            System.out.print(vet1[i]+"  ");
        }
        System.out.printf("\nNúmeros pares em ordem cresente:\n");
        for(i=(max-cont1);i<max;i++)
        {
            System.out.print(vet2[i]+"  ");
        }
        System.out.printf("\nNúmeros ímpares em decrescente:\n");
        for(i=0;i<cont2;i++)
        {
            System.out.print(vet3[i]+"  ");
        }
        
        tec.close();
    }   
}
