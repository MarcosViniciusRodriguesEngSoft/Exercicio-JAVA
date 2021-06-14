/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PreçoDeVenda;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class PreçoDeVenda {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o preço do Produto .: ");
        float preço = teclado.nextFloat();
        
        System.out.println("Digite a Quantidade do Produto .: ");
        int quantidade = teclado.nextInt();
        
        float produto = preço * quantidade;
        
        System.out.println(" Você comprou " + quantidade + " unidades no valor unitário de " + preço +"");
        
        System.out.println("Digite a Porcentagem de Desconto para o Produto .: ");
        float porcentagem = teclado.nextFloat();
        
        float preçofinal = produto - (porcentagem / 100 * produto);
        
        System.out.println("Você adquiriu " + quantidade + " no Valor de " + preço + " com um desconto de " + porcentagem + "% e seu valor a pagar é de .:" + preçofinal+ "");
        
        
        
    }
}
