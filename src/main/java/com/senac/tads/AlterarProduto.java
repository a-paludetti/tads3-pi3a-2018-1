/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.tads;

import com.senac.tads.Produto;
import com.senac.tads.ProdutoDAO;
import com.senac.tads.ConsultaProduto;
import java.util.Scanner;

/**
 *
 * @author Red
 */
public class AlterarProduto {

    public String procurarProduto() throws Exception {
        String p;
        return p = com.senac.tads.ConsultaProduto.Procurar();
    }

    public void menu() {
        Scanner leitor = new Scanner(System.in);

        String escolha;
        int escolhaNum;
        boolean sair = false;

        do {
            //Menu visivel
            System.out.println("===  Menu  ===\n");
            System.out.printf("1 - Procurar\n2 - Alterar Preço\n3 - Alterar Quantidade\n4 - Sair.");

            //Entrada do cliente
            escolha = leitor.nextLine();

            escolhaNum = Integer.parseInt(escolha);
            // escolhaNum = 
            if (Integer.parseInt(escolha) == 4) {
                sair = true;
            }

        } while (sair == false);
    }

}
