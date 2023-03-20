
package Atividade7;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        
        // :F=(9*C+160) / 5
        
        Scanner leitor = new Scanner(System.in);
        
        int temperaturaC;
        int temperaturaF;
        
        
        System.out.println("Digite a temperatura em Celcius:");
        temperaturaC = leitor.nextInt();
        
        temperaturaF = (9*temperaturaC+160)/5;
        
        System.out.println("Sua temperatura em F é " + temperaturaF);
        
        
        
        
        
        
    }
}
