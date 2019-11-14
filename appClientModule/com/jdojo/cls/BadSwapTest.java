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
 * atomita                        	 8 de nov de 2019	Criacao inicial
 */

package com.jdojo.cls;

public class BadSwapTest {
    public static void swap(int x, int y) {
            System.out.println("#2: x = " + x + ", y = " + y);
     
            int temp = x;
            x = y;
            y = temp;
     
            System.out.println("#3: x = " + x + ", y = " + y);
    }
 
    public static void main(String[] args) {
            int a = 19;
            int b = 37;
     
            System.out.println("#1: a = " + a + ", b = " + b);
     
            // Call the swap() method to swap values of a and b
            BadSwapTest.swap(a, b);
     
            System.out.println("#4: a = " + a + ", b = " + b);
    }
}
