
package Atividade8;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        /* 
        Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) 
        dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e 
        também a quantidade de dólares disponíveis com o usuário;
         */
        
        Scanner leitor = new Scanner(System.in);
        
        float valorReais = 0.0f;
        float valorDolar = 0.0f;
        float valorCotacao =  0.0f;
        
        System.out.println("Digite o valor em R$ ");
        valorReais = leitor.nextFloat();
        
        System.out.println("Digite o valor da cotação do Dolar");
        valorCotacao = leitor.nextFloat();
        
        valorDolar = valorReais / valorCotacao;
        System.out.println("Esse é o seu dinheiro em dólares: " + valorDolar);
        
    }
}
