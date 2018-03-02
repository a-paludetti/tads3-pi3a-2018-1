/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.tads;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author aayan
 */
public class Menu {

    /*Criar um menu com as funcionalidades de inserir, editar/autalizar, 
    excluir e consultar.
     */
    public static void main(String[] args) throws SQLException{
        Principal();
    }

    static void Principal() throws Exception {

        Scanner ler = new Scanner(System.in);

        //Escolha do cliente
        String escolha;
        int escolhaNum;
        boolean isNumber;
        boolean sair = false;

        do {
            //Menu visivel
            System.out.println("===  Menu  ===\n");

            System.out.printf("1 - Consultar\n2 - Inserir\n3 - Alterar"
                    + "\n4 - Excluir\n5 - Sair\n\nEscolha um número: ");

            //Entrada do cliente
            escolha = ler.nextLine();

            //Verificar ESCOLHA
            isNumber = escolha.matches("\\d+");

            if (isNumber) {
                escolhaNum = Integer.parseInt(escolha);
                escolhaNum = Opcoes(escolhaNum);
                if (escolhaNum == 5) {
                    sair = true;
                }
            } else {
                System.err.println("Escolha um dos números acima.");
                escolhaNum = 0;
                sair = false;
            }

        } while (sair == false);
    }
    
    public int[] produtoCategoria(int produtoID, int categoriaID) throws SQLException{
        int[] pc = new int[2];
        for(int i = 0; i < pc.length; i++){
            if(i==0){
                pc[i] = produtoID;
            }else{
                pc[i] = categoriaID;
            }
        }
            
        return pc;
    }
    
    public int produtoID(List<Produto> produtos)

    static int Opcoes(int escolhaNum) throws SQLException, Exception{

        switch (escolhaNum) {
            case 1:
                //Metodo de Consulta
                System.out.println("Consulta");
                break;
            case 2:
                //Metodo de Insercao
                System.out.println("Inserir");
                break;
            case 3:
                //Metodo de Alteracao
                System.out.println("Alterar");
                break;
            case 4:
                //Metodo de Exclusao
                //System.out.println("Excluir");
                ExcluirProduto.Exclusao();
                break;
                case 5:
                // Listar as Categorias cadastradas
                    Categoria cat = new Categoria();
                    cat.getCategorias();
                break;
                case 6:
                // Listar as Categorias cadastradas
                    Categoria cat2 = new Categoria();
                    cat.getCategorias();
                break;
            case 0:
                //Sair
                System.out.println("Programa finalizado.");
                break;
            default:
                //Entrada invalida
                System.err.println("Erro\nEscolha uma das opções acima.");
                escolhaNum = 99;
                break;
        }

        return escolhaNum;
    }

}
