package com.senac.tads;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        
        String sql = "INSERT INTO produto( NOME, DESCRICAO, PRECO_COMPRA, PRECO_VENDA, QUANTIDADE, DT_CADASTRO) "
                + " VALUES(?,?,?,?,?,?)";
        
        try {
            stmt = cn.prepareStatement(sql);
//            stmt.setInt(1, produto.getIdProduto());
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDescricao());
            stmt.setFloat(3, produto.getPrecoCompra());
            stmt.setFloat(4, produto.getPrecoVenda());
            stmt.setInt(5, produto.getQuantidade());
            stmt.setString(6, produto.getDataAtual());
            stmt.execute();

        } finally {
            ConnectionFactory.closeConnection(cn, stmt);
        }

    }

    public static void inserirCategoria(com.senac.tads.Categoria produto_categoria) throws SQLException, Exception {
        cn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "INSERT INTO produto_categoria(categoriaNome) "
                + " VALUES(?)";
        
        try {
            stmt = cn.prepareStatement(sql);
            stmt.setString(1, produto_categoria.getCategoriaNome());
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

     public List<Produto> consultarProduto() throws SQLException {
        cn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        List<Produto> listaProdutos = new ArrayList<Produto>();
        Produto p;
        
        String sql = "SELECT * FROM produto";
        
         ResultSet rs = null;
        PreparedStatement stm = null;
        
         try {
            stm = cn.prepareStatement(sql);
            stm.setBoolean(1, false);
            rs = stm.executeQuery();
            
            while(rs.next()){
                p = new Produto();
                p.setIdProduto(rs.getInt("ID"));
                p.setNome(rs.getString("NOME"));
                p.setDescricao(rs.getString("DESCRICAO"));
                p.setPrecoCompra(rs.getFloat("PRECO_COMPRA"));
                p.setPrecoVenda(rs.getFloat("PRECO_VENDA"));
                p.setQuantidade(rs.getInt("QUANTIDADE"));
                p.setDataAtual(rs.getDate("D_CADASTRO"));
                listaProdutos.add(p);
            }
            
         }finally {
        }
        
        return listaProdutos;
    }
    
    //Excluir produto de forma lógica
    public static void excluirProduto(String nomeProduto)
            throws SQLException, Exception {

        cn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        String sql = "UPDATE produto SET excluido = ? WHERE nome = ?";

        try {
            stmt = cn.prepareStatement(sql);
            stmt.setBoolean(1, true);
            stmt.setString(2, nomeProduto.toLowerCase());
            stmt.execute();

        } finally {
            ConnectionFactory.closeConnection(cn, stmt);
        }

    }
}
