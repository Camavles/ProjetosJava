
package Atividade11;

import java.util.Scanner;
public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float precoCusto = 0.0f;
        float acrescimo = 0.0f;
        float calculo = 0.0f;
        float precoVenda = 0.0f;
        
        System.out.println("Digite o preço de custo em R$ ");
        precoCusto = leitor.nextFloat();
        
        System.out.println("Digite o valor de acrescimo R$ ");
        acrescimo = leitor.nextFloat();
        
        if (acrescimo < 1) {
            calculo = precoCusto * acrescimo;
            precoVenda = precoCusto + calculo;
            System.out.println("Este é o seu valor de venda R$ " + precoVenda);
        } else {
            calculo = precoCusto * acrescimo;
            System.out.println("Este é o seu preço de venda R$ " + calculo);
        }
    }
}
