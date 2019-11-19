/*
 * Copyright (c) - UOL Inc,
 * Todos os direitos reservados
 *
 * Este arquivo e uma propriedade confidencial do Universo Online Inc.
 * Nenhuma parte do mesmo pode ser copiada, reproduzida, impressa ou
 * transmitida por qualquer meio sem autorizacao expressa e por escrito
 * de um representante legal do Universo Online Inc.
 *
 * All rights reserved
 *
 * This file is a confidential property of Universo Online Inc.
 * No part of this file may be reproduced or copied in any form or by
 * any means without written permisson from an authorized person from
 * Universo Online Inc.
 *
 * Historico de revisoes
 * Autor                             Data       Motivo
 * --------------------------------- ---------- -----------------------
 * atomita                        	 18 de nov de 2019	Criacao inicial
 */

package com.jdojo.array;

public class RaggedArray {
    public static void main(String[] args) {
            // Create a two-dimensional array of 3 rows
            int[][] raggedArr = new int[3][];
            
            int[][] arr = {{10, 20, 30}, {11, 22}, {222, 333, 444, 555}};

            // Add 2 columns to the first row
            raggedArr[0] = new int[2];

            // Add 1 column to the second row
            raggedArr[1] = new int[1];

            // Add 3 columns to the third row
            raggedArr[2] = new int[3];

            // Assign values to all elements of raggedArr
            raggedArr[0][0] = 1;
            raggedArr[0][1] = 2;
            raggedArr[1][0] = 3;
            raggedArr[2][0] = 4;
            raggedArr[2][1] = 5;
            raggedArr[2][2] = 6;

            // Print all elements. One row at one line
//            System.out.println(raggedArr[0][0] + "\t" + raggedArr[0][1]);
//            System.out.println(raggedArr[1][0]);
//            System.out.println(raggedArr[2][0] + "\t" + raggedArr[2][1] + "\t" + raggedArr[2][2]);
            
            System.out.println(arr[0][0] + "\t" + arr[0][1] + "\t" + arr[0][2]);
            System.out.println(arr[1][0] + "\t" + arr[1][1]);
            System.out.println(arr[2][0] + "\t" + arr[2][1] + "\t" + arr[2][2] + "\t" + arr[2][3]);   
    }
}
