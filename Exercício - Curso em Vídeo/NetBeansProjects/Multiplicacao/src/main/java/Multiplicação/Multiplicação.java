/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multiplicação;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Multiplicação {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um Número.: ");
        int num1 = teclado.nextInt();
        
        System.out.println("Digite um Número.: ");
        int num2 = teclado.nextInt();
        
        int num3 = num1 * num2;
        
        System.out.println("A multiplicação de " + num1 + " mais " + num2 + " é igual a .: " + num3 + "");
        
    }
}
