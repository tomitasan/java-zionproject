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
 * atomita                        	 7 de nov de 2019	Criacao inicial
 */

package com.jdojo.intro;

public class NumTest {
    public static void main(String[] args) {
            int anInt = 100;
            long aLong = 200L;
            byte aByte = 65;
            short aShort = -902;
            char aChar = 'A';
            float aFloat = 10.98F;
            double aDouble = 899.89;
             
            // Print values of the variables
            System.out.println("anInt = " + anInt);
            System.out.println("aLong = " + aLong);
            System.out.println("aByte = " + aByte);
            System.out.println("aShort = " + aShort);
            System.out.println("aChar = " + aChar);
            System.out.println("aFloat = " + aFloat);
            System.out.println("aDouble = " + aDouble);
             
            // Print some double constants
            System.out.println("Max double = " + Double.MAX_VALUE);
            System.out.println("Min double = " + Double.MIN_VALUE);
            System.out.println("Positive infinity for double = " + Double.POSITIVE_INFINITY);
            System.out.println("Negative infinity for double = " + Double.NEGATIVE_INFINITY);
            System.out.println("Not-a-Number for double = " + Double.NaN);
            System.out.println("Double takes " + Double.BYTES + " bytes");
            
            for(int i = 1; i <= 3; i++) {
                // Inner for-loop statement
                for(int j = 1; j <= 3; j++) {
                        System.out.print(i + "" + j);
         
                        // Prints a tab after each column value
                        System.out.print("\t");
                }
         
                System.out.println(); // Prints a new line       
        }
            
            for(int x=1;x<10;x++) {
                if(x%2==0) continue;
                System.out.println(x);
            }
            
            
            outer: // The label "outer" starts here
                
                for(int i = 1; i <= 3; i++) {
                        for(int j = 1; j <= 3; j++) {
                                System.out.print(i + "" + j);
                                System.out.print("\t");
                                if (i == j) {
                                        System.out.println(); // Print a new line
                                        continue outer; // Continue the outer loop
                                }
                 
                        }
                }  // The label "outer" ends here
    }
}
