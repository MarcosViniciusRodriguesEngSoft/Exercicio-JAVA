/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SobrenomeENome;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Nome {
    public static void main(String[]angs){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite seu Nome .: ");
        String nome = teclado.nextLine();
        
        System.out.println("Digite seu Sobrenome .: ");
        String sobrenome = teclado.nextLine();
        
        System.out.println("Seu Sobrenome é, " + sobrenome + " e seu Nome é, " + nome + "");
             
    }
}
