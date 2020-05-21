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

import java.util.Arrays;

public class ArrayCopyTest {
        public static void main(String[] args) {
                // Have an array with 5 elements
                int[] data = {1, 2, 3, 4, 5 };
 
                // Expand the data array to 7 elements
                int[] eData = expandArray(data, 7);
 
                // Truncate the data array to 3 elements
                int[] tData = expandArray(data, 3);
 
                System.out.println("Using for-loop...");
                System.out.println("Original Array: " + Arrays.toString(data));
                System.out.println("Expanded Array: " + Arrays.toString(eData));
                System.out.println("Truncated Array: " + Arrays.toString(tData));
 
                // Copy data array to new arrays
                eData = new int[9];
                tData = new int[2];
                System.arraycopy(data, 0, eData, 0, 5);
                System.arraycopy(data, 0, tData, 0, 2);
        
                System.out.println("Using System.arraycopy() method...");
                System.out.println("Original Array: " + Arrays.toString(data));
                System.out.println("Expanded Array: " + Arrays.toString(eData));
                System.out.println("Truncated Array: " + Arrays.toString(tData));
        }
 
        // Uses a for-loop to copy an array
        public static int[] expandArray(int[] oldArray, int newLength) {
                int originalLength = oldArray.length;
                int[] newArray = new int[newLength];
                int elementsToCopy = 0;
         
                if (originalLength > newLength) {
                        elementsToCopy = newLength;
                }
                else {
                        elementsToCopy = originalLength;
                }
 
                for (int i = 0; i < elementsToCopy; i++) {
                        newArray[i] = oldArray[i];
                }
                return newArray;
        }
}
