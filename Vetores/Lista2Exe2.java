/*2. Ler um vetor de 10 elementos. Crie um segundo vetor, com todos os elementos na
ordem inversa, ou seja, o último elemento passará a ser o primeiro, o penúltimo será o
segundo e assim por diante. Imprima os dois vetores.*/
import javax.swing.JOptionPane;
public class Lista2Exe2 
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
            vet2[(max-1)-i] = vet1[i];
        }
        
        for(i=0;i<max;i++)
        {
            JOptionPane.showMessageDialog(null, vet1[i]+"\n"+vet2[i]);
        }
    }
        
}
