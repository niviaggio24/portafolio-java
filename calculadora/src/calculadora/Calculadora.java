/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author FREYN
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1 = 5;
        int num2 = 3;

        System.out.println("CALCULADORA");
        System.out.println("");
        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
        System.out.println("");
        System.out.println("RESULTADOS");
        System.out.println("");
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + ((float) num1 / num2));
        System.out.println("Módulo: " + (num1 % num2));
    }
    
}
