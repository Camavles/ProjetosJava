/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadeClasses;


public class Pessoa {
    
    private float peso;
    private float altura;
    
    
    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }
    
    // métodos acessores 
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    // get é para eu acessar aquilo que foi digitado pelo usuário sem acessar de forma direta;
    public float getPeso() {
        return peso;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float getAltura() {
        return altura;
    }
    
    
}
