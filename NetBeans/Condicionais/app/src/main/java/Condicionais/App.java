
package Condicionais;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
//        int numeroUm = 1;
//        int numeroDois = 4;
//        
//        float soma = numeroUm + numeroDois;
//        
//       if( soma > 5 ) {
//           System.out.println(soma);
//       } else {
//           System.out.println("Valor nao computado");
//       }
// operadores relacionais
// > maior
// < menor
// >= maior ou igual
// <= menor ou igual
// == estritamente igual
// != diferente
// operador lógico:
//&& e
// || ou 
// ! negação 

         int media = 10;
         
        if (media > 7) {
            if (media == 10) {
                System.out.println("Parabens fechou com 10");
            } else {
                System.out.println("Aprovada");
            }
        } else {
            System.out.println("Recuperação");
        }
    }
}
