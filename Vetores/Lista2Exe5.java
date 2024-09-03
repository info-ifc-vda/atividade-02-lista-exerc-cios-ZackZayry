/*5. Faça um programa que leia e monte dois vetores de números inteiros com 20 números
cada. Depois de montados gere um terceiro vetor formado pela diferença dos dois vetores
lidos, um quarto vetor formado pela soma dos dois vetores lidos e por último um quinto
vetor formado pela multiplicação dos dois vetores lidos.*/
import javax.swing.JOptionPane;
public class Lista2Exe5 
{
    public static void main(String[] args) 
    {
        int i, max=3;
        double[] vet1 = new double[max];
        double[] vet2 = new double[max];
        double[] vet3 = new double[max];
        double[] vet4 = new double[max];
        double[] vet5 = new double[max];

        for(i=0;i<max;i++)
        {
            String valor1 = JOptionPane.showInputDialog("Informe o "+(i+1)+"º número para o vetor 1: ");
            vet1[i] = Double.parseDouble(valor1);
        }

        for(i=0;i<max;i++)
        {
            String valor2 = JOptionPane.showInputDialog("Informe o "+(i+1)+"º número para o vetor 2: ");
            vet2[i] = Double.parseDouble(valor2);
        }

        for(i=0;i<max;i++)
        {
            vet3[i] = vet1[i]-vet2[i];
            vet4[i] = vet1[i]+vet2[i];
            vet5[i] = vet1[i]*vet2[i];
        }

        for(i=0;i<max;i++)
        {
            JOptionPane.showMessageDialog(null, "Valores "+vet1[i]+"   "+vet2[i]+"\nDiferença "+vet3[i]+"\nSoma "+vet4[i]+"\nMultiplicação "+vet5[i]);
        }
    }    
}
