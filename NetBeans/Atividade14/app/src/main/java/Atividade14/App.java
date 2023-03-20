
package Atividade14;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int valorA;
        int valorB;
        
        System.out.println("Digite o valor de A");
        valorA = leitor.nextInt();
        
        System.out.println("Digite o valor de B");
        valorB = leitor.nextInt();
    
        if (valorA > valorB) {
            System.out.println("A é o valor maior, que é" + valorA);
        } else {
            System.out.println("B é o maior valor, que é " + valorB);
        }
    }
}
