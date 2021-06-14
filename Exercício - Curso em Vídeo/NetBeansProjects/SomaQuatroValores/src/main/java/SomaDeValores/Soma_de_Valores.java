/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SomaDeValores;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Soma_de_Valores {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o Primeiro Número .: ");
        int num1 = teclado.nextInt();
        
        System.out.println("Digite o Segundo Número .: ");
        int num2 = teclado.nextInt();
        
        System.out.println("Digite o Terceiro Número .: ");
        int num3 = teclado.nextInt();
        
        System.out.println("Digite o Quarto Número .: ");
        int num4 = teclado.nextInt();
        
        int num5 = num1 + num2 + num3 + num4;
        
        System.out.print("A soma de " + num1 + " + " + num2 + " + " + num3 + " + " + num4 + " é = " + num5 + "" );
    }
    
}
