/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controle_biblioteca;

import java.util.Scanner;

/**
 *
 * @author marcos
 */
public class Principal {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);   
        String res;
        double percentual, percentvalor, total;
        
        Cliente cadastro = new Cliente();
        Produto produto = new Produto();
        
        cadastro.codigo = 403;
	cadastro.nome = "Marcos Vinicius Rodrigues";
	cadastro.telefone = "(44) 99820-4407";
	cadastro.rua = "Pedro Álvares Cabral";
	cadastro.numero = 3409;
	cadastro.bairro = "Parque Pioneiro";
	cadastro.cidade = "Sarandi";
	cadastro.estado = "Parana";
	cadastro.cep = "87114120";
        produto.codigo = 001;
        produto.descricao = "Memória USB Flash Drive, mais conhecido como pendrive, é um dispositivo constituído por uma memória flash e que possui a função de armazenamento";
        produto.valor = 25.50;
        produto.quantidade = 1;
        
        
        System.out.println("N° 053 : Venda realizada para o cliente");
        System.out.println("Cliente: " +cadastro.nome);
        System.out.println("Valor Final: " +produto.valor);   
        System.out.println("Produto vendido com desconto? Sim ou Não? ");
        res = teclado.next();
                
        if ("Sim".equals(res)){
            System.out.println("Qual o percentual de desconto? ");
            percentual = teclado.nextDouble();
            percentvalor = produto.valor*(percentual/100);
            total = produto.valor - percentvalor;
            System.out.println("valor do percentual informado para desconto.: R$ " +percentvalor);
            System.out.println("Valor Total da Venda.: R$ " +total);
	}else if ("Não".equals(res)){
            System.out.println("Venda sem desconto!");
            System.out.println("Valor Total da Venda.: R$ " +produto.valor);
        }
        
    }
}