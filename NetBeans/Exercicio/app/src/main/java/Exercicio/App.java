
package Exercicio;


import java.util.Scanner; 

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
       
        
        Scanner leitorScanner = new Scanner(System.in);
        
        char desejaContinuar = 'S';
        
       
        while (desejaContinuar == 'S' || desejaContinuar == 's') {
            System.out.println("Digite um numero: ");
            int numero = leitorScanner.nextInt();

            if (numero == 0) {
                System.out.println("Seu numero � 0");
            } else if (numero < 0) {
                System.out.println("Seu n�mero � negativo");
            } else {
                System.out.println("Seu n�mero � positivo");
            }
            
            System.out.println("Deseja continuar?");
            
            desejaContinuar = leitorScanner.next().charAt(0);
        }
        
        
        
    }
}
