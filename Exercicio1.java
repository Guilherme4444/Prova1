//package P1.java;
import java.util.Scanner;


public class Exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número para fazer a operação: : ");
        Double N1 = entrada.nextDouble();

        System.out.print("Digite outro número:   ");
        Double N2 = entrada.nextDouble();

        System.out.print("Escolha a operação a ser feita (+; -; *; /: ");
        char operacao = entrada.next().charAt(0);

        double resultado;

        switch (operacao) {
            case '+'   :
                resultado = N1 + N2;
                System.out.print("A SOMA desses número é: " + resultado);
                break;
            
            case '-' :
                resultado = N1 - N2;
                System.out.println("Resultado: " + resultado);
                break;

                case '*' :
            resultado = N1 * N2;
            System.out.println("Resultado: " + resultado);
            break;

            case '/' :
            resultado = N1 / N2;
            System.out.println("Resultado: " + resultado);
            break;

        }
            entrada.close();

    }
    
}