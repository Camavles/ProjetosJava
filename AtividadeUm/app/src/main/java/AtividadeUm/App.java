
package AtividadeUm;

import java.util.Scanner;


public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        
        
        int i;
        
        int media;
        
       // for � usado quando eu seu quantas vezes quero repetir aquela opera��o
        
        for(i = 0; i <= 5; i++) {
            
            Scanner leitorScanner = new Scanner(System.in);
            
            System.out.println("Digite uma media");
            
            media = leitorScanner.nextInt();
            
            if (media >= 5 && media <= 7) {
                System.out.println("Recupera��o");
            } else if (media > 7) {
                System.out.println("Aprovado");
                if (media == 10) {
                    System.out.println("Parabens!!");
                }
            } else {
                System.out.println("Reprovado!");
            }
        }
    }
}
