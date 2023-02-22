
package AtividadeTres;


import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        int numeroUm;
        int numeroDois;
        
        int soma;
        int subtracao;
        int divisao;
        int mul;
        
        char contador = 'S';
        
        Scanner leitorScanner = new Scanner(System.in);
        
        
        while(contador == 'S' || contador == 's') {
            
            
            System.out.println("Digite o numero um: ");

            numeroUm = leitorScanner.nextInt();

            System.out.println("Digite o numero dois ");

            numeroDois = leitorScanner.nextInt();

            if (numeroUm >= numeroDois) {

                soma = numeroUm + numeroDois;
                mul = numeroUm * numeroDois;
                divisao = numeroUm / numeroDois;
                subtracao = numeroUm - numeroDois;

                System.out.println("Sua soma é: " + soma);
                System.out.println("Sua subtracao é: " + subtracao);
                System.out.println("Sua multiplicação é: " + mul);
                System.out.println("Sua divisaoa é: " + divisao);

            } else {
                System.out.println("Seu numero 1 precisa ser maior que o numero dois!");
            }
            
            System.out.println("Deseja Continuar? ");
            contador = leitorScanner.next().charAt(0);
        }
    }  
}
