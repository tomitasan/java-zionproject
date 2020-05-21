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

public class ArrayInit {
    private boolean[] bArray = new boolean[3];  // An instance variable

    public ArrayInit() {
            // Display the initial value for elements of the instance
            // variable bArray
            for (int i = 0; i < bArray.length; i++) {
                    System.out.println("bArray[" + i + "]:" + bArray[i]);
            }
    }

    public static void main(String[] args) {
            System.out.println("int array initialization:");

            int[] empId = new int[3];  // A local array variable
            for (int i = 0; i < empId.length; i++) {
                    System.out.println("empId[" + i + "]:" + empId[i]);
            }

            System.out.println("boolean array initialization:");
             
            // Initial value for bArray elements are displayed
            // inside the constructor
            new ArrayInit();

            System.out.println("Reference type array initialization:");

            String[] name = new String[3];  // A local array variable
            for (int i = 0; i < name.length; i++) {
                    System.out.println("name[" + i + "]:" + name[i]);
            }
}
}
