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

package com.jdojo.cls.p1;

import com.jdojo.cls.AccessLevel;

public class AccessLevelTest2 {
        public static void main(String[] args) {
                AccessLevel al = new AccessLevel();
 
                //int a = al.v1; /* A compile-time error */
                //int b = al.v2; /* A compile-time error */
                //int c = al.v3; /* A compile-time error */
                int d = al.v4;
 
                System.out.println("d = " + d);
 
                //al.m1(); /* A compile-time error */
                //al.m2(); /* A compile-time error */
                //al.m3(); /* A compile-time error */
                al.m4();
 
                /* Modify the values of instance variables */
                //al.v2 = 20;  /* A compile-time error */
                //al.v3 = 30;  /* A compile-time error */
                al.v4 = 40;
 
                System.out.println("After modifying v4...");
                //al.m2();  /* A compile-time error */
                //al.m3();  /* A compile-time error */
                al.m4();
  }
}