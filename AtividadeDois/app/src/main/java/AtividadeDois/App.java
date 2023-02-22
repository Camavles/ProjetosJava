
package AtividadeDois;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
      
        
        int numeroUm;
        
        int numeroDois;

        int soma;

        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite o numero 1: ");

        numeroUm = leitorScanner.nextInt();

        System.out.println("Digite o numero 2: ");

        numeroDois = leitorScanner.nextInt();

        soma = numeroUm + numeroDois;

        System.out.println("Sua soma é: " + soma);
        
        
        
        
    }
}
