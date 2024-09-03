/*3. Ler um vetor de 10 elementos inteiros e positivos. Criar um segundo vetor da seguinte
forma: os elementos de índice par receberão os respectivos elementos divididos por 2; os
elementos de índice ímpar receberão os respectivos elementos multiplicados por 3.
Imprima os dois vetores.*/
import javax.swing.JOptionPane;
public class Lista2Exe3 
{
    public static void main(String[] args)
    {
        int i, max=10;
        double[] vet1 = new double[max];
        double[] vet2 = new double[max];

        for(i=0;i<max;i++)
        {
            String valor = JOptionPane.showInputDialog("Informe o "+(i+1)+"º valor desejado:");
            vet1[i] = Double.parseDouble(valor);

            if(vet1[i] % 2 == 0)
            {
                vet2[i] = vet1[i]/2;
            }
            else
            {
                vet2[i] = vet1[i]*3;
            }
        }

        for(i=0;i<max;i++)
        {
            JOptionPane.showMessageDialog(null, vet1[i]+"\n"+vet2[i]);
        }
    }
}
