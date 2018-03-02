/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.tads;

import com.senac.tads.Produto;
import com.senac.tads.ProdutoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultaProduto {

    String nomeProduto; //variável global para consulta

    public String leitor() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Nome do produto: ");
        String input = reader.nextLine();
        return input;
    }

    public void Consultar() throws SQLException, Exception {
        nomeProduto = leitor();

        // ArrayList lista = produtoDAO.lista(); (método faltando)
        // for(ConsultaProduto leitor:lista(produto.nome())){
        // if (nomeProduto==produto.nome()){
        //    lista.add();}
        //}
        // for(int i:lista){
        //   System.out.print(i + " - " produto.nome);
        //}
    }

}
