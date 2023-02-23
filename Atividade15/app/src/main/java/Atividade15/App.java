
package Atividade15;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Digite um número");
        numero = leitor.nextInt();
        
        if (numero >= 100 && numero <= 200) {
            System.out.println("Seu número está dentro do intervalor " + numero);
        } else {
            System.out.println("Seu número não está no intervalor " + numero);
        }
    }
}
