/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.tads;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Vinicius Presoto
 */
public class Categoria {

    private int categoriaId;
    
    private String categoriaNome;
    
    private int produtoId;
    
    public Categoria(){
        
    }
    public Categoria(String nome){
        this.categoriaNome = nome;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getCategoriaNome() {
        return categoriaNome;
    }

    public void setCategoriaNome(String categoriaNome) {
        this.categoriaNome = categoriaNome;
    }

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }
    
    public List<Categoria> getCategorias() throws SQLException{
        return ProdutoDAO.listarCategoria();
    }
    
    public void setProdutoCategoria(int produtoID, int CategoriaID) throws SQLException{
        
    }
}
    
