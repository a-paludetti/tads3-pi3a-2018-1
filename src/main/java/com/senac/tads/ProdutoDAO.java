
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

        String sql = "INSERT INTO produto(idProduto, nome, descricao, precoCompra, precoVenda, quantidade) "
                + " VALUES(?,?,?,?,?,?,?)";

        try {
            stmt = cn.prepareStatement(sql);
            stmt.setInt(1, produto.getIdProduto());
            stmt.setString(2, produto.getNome());
            stmt.setString(3, produto.getDescricao());
            stmt.setFloat(4, produto.getPrecoCompra());
            stmt.setFloat(5, produto.getPrecoVenda());
            stmt.setInt(6, produto.getQuantidade());
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

}
