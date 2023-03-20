
package AtividadeQuatro;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
       
        float combustivel;
        float distancia;
        float media;
        char desejaContinuar = 'S';
        
        
        Scanner leitorScanner = new Scanner(System.in);
        
        while (desejaContinuar == 's' || desejaContinuar == 'S' ) {
            
        System.out.println("Digite o combustível total gasto em litros: ");
        combustivel = leitorScanner.nextFloat();
        System.out.println("Digite a distância total percorrida em km:");
        distancia = leitorScanner.nextFloat();
        
        media = combustivel / distancia;
        
        System.out.println("Seu consumo médio de combustível em litros eh: " + media + " por km rodado");
        
        System.out.println("Deseja continuar? ");
        desejaContinuar = leitorScanner.next().charAt(0);
        }
    }
}
