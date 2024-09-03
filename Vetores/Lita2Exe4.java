/*4. Ler um vetor com 10 nomes de pessoas, após pedir que o usuário digite um nome
qualquer de pessoa. Escrever a mensagem “ACHEI”, se o nome estiver armazenado no
vetor C ou “NÃO ACHEI” caso contrário*/
//import javax.swing.JOptionPane;
import java.util.Scanner;
public class Lita2Exe4 
{
    public static void main(String[] args)
    {
        int i, max=3, cont=0;
        String[] c = new String[max];
        String c1;
        Scanner tec = new Scanner(System.in);

        for(i=0;i<max;i++)//Receber nomes
        {
            System.out.println("Informe o "+(i+1)+"º nome de pessoa : ");
            c[i] = tec.nextLine();
            System.out.println("\n");
            
        }

        System.out.println("\n\nInforme um nome para ser buscado: ");
        c1 = tec.nextLine();
        for(i=0;i<max;i++)
        {
           if(c[i].equals(c1))
            {
                System.out.println("!!ACHEI!!");
                cont++;
                break;
            } 
        }
        if(cont==0)
        {
            System.out.println("!!NÃO ACHEI!!");
        }
        
        tec.close();
    }
}
