
package AtividadeSeisNova;

import java.util.Scanner;
public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("Digite o valor de A ");
        a = leitor.nextInt();

        System.out.println("Digite o valor de B");
        b = leitor.nextInt();
        c = a;
        a = b;
        b = c;

        System.out.println("Esses são os valores de A e B: " + a + " " + b);
    }
}
