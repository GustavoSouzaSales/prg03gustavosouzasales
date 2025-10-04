/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade06.view;

/**
 *
 * @author gugsa
 */
public class Fatorial {
    
    // Os 3 atributos principais.
    private int num = 0;
    private int fat = 1;
    private String formula = "";
    
    
    // Aqui irá preencher o valor e calcular o fatorial.
    public void setValor(int n){
         num = n;
         int f = 1;
         String s = "";
         
         for(int c = n; c > 1; c--){
             f *= c;
             s += c + " x ";
         }
         
        s += "1 = "; // Para concatenar com o 1.
        fat = f;
        formula = s;
    
    }
    
    // Aqui irá pegar o valor do fatorial.
    public int getFatorial(){
        return fat;
    }
    
    
    // Aqui irá pegar a fórmula.
    public String getFormula(){
        return formula;
    }
    
    
}
