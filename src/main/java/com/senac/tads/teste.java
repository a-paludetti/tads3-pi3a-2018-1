/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.tads;

/**
 *
 * @author Marcelo Pereira <marcelo.pereira@rerum.com.br>
 */
public class teste {
    public static void main(String[] args) {
        Produto p = new Produto(1, "teste", 10, 20, 10);
        System.out.println(p.getNome());
        System.out.println(p.getPrecoCompra());
        System.out.println(p.getQuantidade());
        System.out.println(p.getDataAtual());
    }
    
}
