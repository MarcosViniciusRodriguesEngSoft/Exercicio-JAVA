/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProvaAluno;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class ProvaAluno {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Para a prova 1 de peso 4 informe a nota .: ");
        float nota1 = teclado.nextFloat();
        
        System.out.println("Para a prova 2 de peso 6 informe a nota .: ");
        float nota2 = teclado.nextFloat();
        
        float média = (nota1 + nota2) / 2;
        
        System.out.println("Na Primeira prova o aluno tirou a nota " + nota1 + " na segunda prova o aluno tirou a nota " + nota2 + " obtendo então uma média de " + média + "");
    }
            
}
