/*1. Faça um programa que leia um conjunto não determinado de valores, um de cada vez, e
escreva uma tabela com cabeçalho, que deve ser repetido a cada vinte linhas. A tabela
deverá conter o valor lido, seu cubo e sua raiz quadrada. Finalize quando a entrada for
um número negativo ou 0.*/
import javax.swing.JOptionPane;
public class Lista2Exe1 
{

    public static void main(String[] args)
    {
        int i;
        double[] vet1 = new double[100000];
        double[] vet2 = new double[100000];
        double[] vet3 = new double[100000];
        int cont =0;

        for(;;)//Recebe os valores
        {
            String valor = JOptionPane.showInputDialog("Informe um valor(0 ou menor para finalizar):");
            vet1[cont] = Double.parseDouble(valor);
            if(vet1[cont] <= 0)
            {
                break;
            }
            if(cont >= vet1.length)
            {
                JOptionPane.showMessageDialog(null, "!!Foi exedido o valor maximo!!");
            }
            cont++;
        }

        for(i=0;i<cont;i++)//Faz os cálculos
        {
            vet2[i] = Math.pow(vet1[i], 3);
            vet3[i] = Math.sqrt(vet1[i]);
        }

        for(i=0;i<cont;i++)
        {
            JOptionPane.showMessageDialog(null, "Valor    POTEN    RAIZ\n________________________________\n"+vet1[i]+"    "+vet2[i]+"    "+vet3[i]);
        }
    }
}