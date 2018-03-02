/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.tads;

import java.util.Scanner;

/**
 *
 * @author aayan
 */
public class ExcluirProduto {

    static void Exclusao() {

        try {

            Scanner ler = new Scanner(System.in);

            Produto aSerExcluido;
            String nomeDoProduto;

            System.out.println("===  Excluir  ===");
            System.out.println("Nome do produto: ");

            nomeDoProduto = ler.nextLine();
            
            ProdutoDAO.excluirProduto(nomeDoProduto);
            
            

            /*Metodo de consulta
            para verificar se o produto existe
            se existir verificar se ele ja foi excluido
            se ele nao foi excluido OK
        
            aSerExcluido = ProdutoDAO.Consultar(nomeDoProduto);
            
             */
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
