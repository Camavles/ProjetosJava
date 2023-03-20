
package Atividade13;

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
        
        if (numero > 10) {
            System.out.println("Seu número é maior que 10");
        } else {
            System.out.println("Seu número é menor que 10");
        }
    }
}
