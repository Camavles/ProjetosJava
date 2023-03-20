
package Atividade9;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       
       float valorDepositado = 0.0f;
       
       double rendimento = 0.07d;
       
       double valorFinal = 0.00d;
       
       System.out.println("Digite o valor a ser depositado");
       valorDepositado = leitor.nextFloat();
       
       rendimento = valorDepositado * rendimento;
       valorFinal =  valorDepositado + rendimento;
       
       System.out.println("Esse é o seu valor final R$ " + valorFinal);
      
    }
}
