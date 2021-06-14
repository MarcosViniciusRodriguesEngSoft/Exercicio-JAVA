/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nome_e_ano;

import java.util.Scanner;

/**
 *
 * @author marco
 */

public class CalculoIdade {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        System.out.println("digite o seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Digite o ano de nascimento: ");
        
        int anoNascimento = teclado.nextInt();
        int idade = 2020 - anoNascimento;
        System.out.println("Olá, " + nome + " Você possui " + idade + " anos.");
    }
}
