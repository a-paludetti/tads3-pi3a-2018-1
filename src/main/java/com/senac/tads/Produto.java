/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.tads;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Marcelo Pereira <marcelo.pereira@rerum.com.br>
 */
public class Produto {

    private int idProduto;
    private String nome;
    private String descricao;
    private float precoCompra;
    private float precoVenda;
    private int quantidade;
    private final Date data = new Date(System.currentTimeMillis());
    private final SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-dd");
//    private String categoria;

    public Produto() {
    }

    
    public Produto(String nome, float precoCompra, float precoVenda, int quantidade) {

//        this.idProduto = idProduto;
        this.nome = nome;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.quantidade = quantidade;
//        this.df.format(data);
//        this.categoria = categoria;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getDataAtual(){
        return df.format(data);
    }
    public void setDataAtual(Date data){
        SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-dd");
    }
    

//    public String getCategoria() {
//        return categoria;
//    }
//
//    public void setCategoria(String categoria) {
//        this.categoria = categoria;
//    }
}
