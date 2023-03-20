
package CondicionaisDois;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        
        int dadoUm = 3;
        
             switch (dadoUm) {
            case 1:
                System.out.println("Caso um");
                break;
            case 2:
                System.out.println("Caso dois");
                break;
                
            default:  
                System.out.println("Nao computado");
        }

    }
}
