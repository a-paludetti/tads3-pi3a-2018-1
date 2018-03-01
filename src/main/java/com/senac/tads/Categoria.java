/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.tads;

/**
 *
 * @author Vinicius Presoto
 */
public class Categoria {

    public static int Categoria(Produto p) {
        int abc = 0;
        String cba = p.getCategoria();

        switch (cba.charAt(0)) {
            case 'A':
                abc = 1;
                break;
            case 'B':
                abc = 2;
                break;
            case 'C':
                abc = 3;
                break;
            case 'D':
                abc = 4;
                break;
            case 'E':
                abc = 5;
                break;
            case 'F':
                abc = 6;
                break;
            case 'G':
                abc = 7;
                break;
            case 'H':
                abc = 8;
                break;
            case 'I':
                abc = 9;
                break;
            case 'J':
                abc = 10;
                break;
            case 'K':
                abc = 11;
                break;
            case 'L':
                abc = 12;
                break;
            case 'M':
                abc = 13;
                break;
            case 'N':
                abc = 14;
                break;
            case 'O':
                abc = 15;
                break;
            case 'P':
                abc = 16;
                break;
            case 'Q':
                abc = 17;
                break;
            case 'R':
                abc = 18;
                break;
            case 'S':
                abc = 19;
                break;
            case 'T':
                abc = 20;
                break;
            case 'U':
                abc = 21;
                break;
            case 'V':
                abc = 22;
                break;
            case 'W':
                abc = 23;
                break;
            case 'X':
                abc = 24;
                break;
            case 'Y':
                abc = 25;
                break;
            case 'Z':
                abc = 26;
                break;
            default:
                abc = 546;
                break;
        }

        return abc;
    }

    public static int CodigoCategoria(Produto p) {
        int abc = 0;
        String categoria = p.getCategoria();

        switch (categoria) {
            case "Alimento":
                abc = 1100;
                break;
            case "Bebida":
                abc = 1200;
                break;
            case "Limpeza":
                abc = 1300;
                break;
            case "Eletronico":
                abc = 1400;
                break;
            case "Moveis":
                abc = 1500;
                break;
            case "Automotivo":
                abc = 1600;
                break;
            case "Pet":
                abc = 1700;
                break;
            default:
                abc = 1404;
                break;
        }

        return abc;
    }
}
