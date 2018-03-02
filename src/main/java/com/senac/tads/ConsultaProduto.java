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

    Produto p;

    public static String leitor() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Nome do produto: ");
        String input = reader.nextLine();
        return input;
    }

    public static String Procurar() throws SQLException, Exception {
        String nomeProduto = leitor();

        ArrayList<ConsultaProduto> lista = new ArrayList();

        //for (ConsultaProduto leitor : lista(produto.nome())) {
        //  if (nomeProduto.equalsIgnoreCase(this.toString())) {
        //    lista.add(this);
        //    }
        //}
        for (int i = 0; i < lista.size(); i++) {
            return ((i + lista.get(i).toString()));
        }
        return nomeProduto;
    }
    
    public static Produto prourarProduto(List<Produto> listaProdutos, String nome){
        Produto p = new Produto();
        for(int i = 0; i < listaProdutos.size(); i++){
            if(listaProdutos.get(i).getNome().equals(nome)){
                p=listaProdutos.get(i);
            }
        }
        
        return p;
    }

}
