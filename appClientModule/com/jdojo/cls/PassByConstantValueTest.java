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

public class PassByConstantValueTest {
    // x uses pass by constant value and y uses pass by value
    public static void test(final int x, int y) {
            System.out.println("#2: x = " + x + ", y = " + y);

            /* Uncommenting following statement will generate a compile-time error */
            // x = 79; /* Cannot change x. It is passed by constant value */

            y = 223; // Ok to change y

            System.out.println("#3: x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
            int a = 19;
            int b = 37;
            System.out.println("#1: a = " + a + ", b = " + b);
            PassByConstantValueTest.test(a, b);
            System.out.println("#4: a = " + a + ", b = " + b);
    }
}