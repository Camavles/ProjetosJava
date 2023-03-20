
package videoN;

import java.util.Scanner;



public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
       // na verdade esse é o video P
        /*
       Fa�a um algoritmo que receba o pre�o de custo e o pre�o de venda de 40 produtos. Mostre como resultado 
       se houve lucro, preju�zo ou empate para cada produto. Informe o valor de custo de cada produto, o valor
       de venda de cada produto, am�dia de pre�o de custo e do pre�o de venda;
       */
        
        // número de repetiçãoo usando o i
        
        Scanner leitorScanner = new Scanner(System.in);
        
        double precoCusto;
        double precoVenda;
        double calculeLucro;
        int qtdProdutos = 40;
        double mediaPreco;
        double calculePreco;
        
        int i;
        
        for(i = 1; i <= 2; i++) {
            
            System.out.println("Digite o preço de custo:");
            
            precoCusto = leitorScanner.nextDouble();
            
            System.out.println("Digite o preço de venda:");
            
            precoVenda = leitorScanner.nextDouble();

            mediaPreco = +precoVenda;
            calculePreco = (mediaPreco / 2);
            calculeLucro = precoVenda - precoCusto;

            if (precoVenda < precoCusto) {
                System.out.println("Voce teve prejuízo, pois seu preço de venda foi de "
                        + precoVenda + " Seu preço custo foi de " + precoCusto + "Seu prejuízo foi de: ");

            } else if (precoVenda == precoCusto) {
                System.out.println(" Voce teve um empate, pois seu preco venda foi de: "
                        + precoVenda + " Seu preço custo foi de " + precoCusto);
            } else {

                System.out.println("Seu lucro foi de: " + calculeLucro + " Seu preco venda foi de: "
                        + precoVenda + " Seu preço custo foi de " + precoCusto + "Sua media é: " + calculePreco);

            }

        
        }
       
    }
}
