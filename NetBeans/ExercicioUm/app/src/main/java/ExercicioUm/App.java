
package ExercicioUm;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        int numero;
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite um valor");
        numero = leitorScanner.nextInt();
                
        if (numero >= 100 && numero <= 200) {
            System.out.println("N�mero est� no intervalo");
        } else {
            System.out.println("Numero n�o esta no intervalo");
        }
    }
}
