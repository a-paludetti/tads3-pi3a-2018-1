package com.senac.tads;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Vinicius Presoto
 */
public class ProdutoDAO {
    
    private static Connection cn = null;
    
    private static List<ProdutoDAO> listaProduto = new ArrayList<ProdutoDAO>();
    
    public static void inserir(com.senac.tads.Produto produto) throws SQLException, Exception {
        cn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "INSERT INTO produto(idProduto, nome, descricao, precoCompra, precoVenda, quantidade, categoria) "
                + " VALUES(?,?,?,?,?,?,?,?)";
        
        try {
            stmt = cn.prepareStatement(sql);
            stmt.setInt(1, produto.getIdProduto());
            stmt.setString(2, produto.getNome());
            stmt.setString(3, produto.getDescricao());
            stmt.setFloat(4, produto.getPrecoCompra());
            stmt.setFloat(5, produto.getPrecoVenda());
//            stmt.setString(6, produto.getCategoria());
            stmt.execute();
            
        } finally {
            ConnectionFactory.closeConnection(cn, stmt);
        }
        
    }

    public static void inserirCategoria(com.senac.tads.Categoria produto_categoria) throws SQLException, Exception {
        cn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "INSERT INTO produto_categoria(categoriaId, categoriaNome, produtoId) "
                + " VALUES(?,?,?)";
        
        try {
            stmt = cn.prepareStatement(sql);
            stmt.setInt(1, produto_categoria.getCategoriaId());
            stmt.setString(2, produto_categoria.getCategoriaNome());
            stmt.setInt(3, produto_categoria.getProdutoId());
            stmt.execute();
            
        } finally {
            ConnectionFactory.closeConnection(cn, stmt);
        }
        
    }
    
//    Validação do produto a ser gravado na base.
    public static void validaProduto(com.senac.tads.Produto produto) throws Exception {
        if (produto.getIdProduto() <= 0) {
            throw new Exception("Não foi informado produto.");
        }
        
        if (produto.getNome().equalsIgnoreCase(null)) {
            throw new Exception("Nome inválido");
        }
        
        if (produto.getDescricao().equalsIgnoreCase(null)) {
            throw new Exception("Descrição inválida.");
        }
        
        if (produto.getPrecoCompra() <= 0.00) {
            throw new Exception("Preço inválido.");
        }
        
        if (produto.getPrecoVenda() <= 0.00) {
            throw new Exception("Preço inválido.");
        }
        
        if (produto.getQuantidade() <= 0) {
            throw new Exception("Quantidade inválida, informe a quantidade em estoque.");
        }
        
//        if (produto.getCategoria().contentEquals("Escolha")) {
//            throw new Exception("Categoria de produto inválida, selecione uma das opções");
//        }
        
    }

    //Excluir produto de forma lógica
    public static void excluirProduto(com.senac.tads.Produto produto)
            throws SQLException, Exception {
        
        cn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "UPDATE produto SET excluido = ? WHERE id = ?";
        
        try {
            stmt = cn.prepareStatement(sql);
            stmt.setBoolean(1, true);
            stmt.setInt(2, produto.getIdProduto());
            stmt.execute();
            
        } finally {
            ConnectionFactory.closeConnection(cn, stmt);
        }
        
    }
    
}
