
package Atividade10;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float valorCompra = 0.0f;
        float valorPrestacoes = 0.0f;
        
        System.out.println("Digite o valor total da compra");
        valorCompra = leitor.nextFloat();
        
        valorPrestacoes = valorCompra / 5;
        
        System.out.println("Valor das suas prestações é R$ " + valorPrestacoes);
    }
}
