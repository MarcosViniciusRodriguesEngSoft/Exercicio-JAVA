/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SomaTresEMedia;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class SomaTrêsEMédia {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite um Número .: ");
        int num1 = teclado.nextInt();
        
        System.out.println("Digite um Número .: ");
        int num2 = teclado.nextInt();
        
        System.out.println("Digite um Número .: ");
        int num3 = teclado.nextInt();
        
        int num4 = (num1 + num2 + num3) / 3;
        
        System.out.println("A Média da soma de " + num1 + " + " + num2 + " + " + num3 + " é = " + num4 + "");
        
    }
}
