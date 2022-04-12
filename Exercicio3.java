import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe-me um número qualquer e eu vou dizer se é PAR ou IMPAR: ");
        int numero = entrada.nextInt();

        if(numero%2==0) {
            System.out.println("O número " + numero + " é PAR!!");

        }else{
            System.out.println("O número é IMPAR!");

            System.out.println("------------EXPLICAÇÃO------------");
            System.out.println("PARA CHEGAR A ESSE VALOR O PROGRAMA FEZ A DIVISÃO DESSE NÚMERO POR 2. Quando der resto 0, é PAR; E quando der resto diferente de 0, é IMPAR!");


        }

        
    }
    
}
