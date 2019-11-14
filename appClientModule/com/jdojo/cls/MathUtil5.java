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

public class MathUtil5 {
    public static int max(int n1, int n2, int... num) {
            // Initialize max to teh maximu of n1 and n2
            int max = (n1 > n2 ? n1 : n2);
             
            for(int i = 0; i < num.length; i++) {
                    if (num[i] > max) {
                            max = num[i];
                    }
            }
            return max;
    }
     
    public static void main(String[] args) {
            System.out.println("max(7, 9) = " + MathUtil5.max(7, 9));
            System.out.println("max(70, 19, 30) = " + MathUtil5.max(70, 19, 30));
            System.out.println("max(-7, -1, 3) = " + MathUtil5.max(-70, -1, 3));
    }
}
