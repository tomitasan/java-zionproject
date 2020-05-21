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
 * atomita                        	 14 de nov de 2019	Criacao inicial
 */

package com.jdojo.string;

public class StringLength {
    public static void main (String[] args) {
            // Create two string objects
            String str1 = new String() ;
            String str2 = new String("Hello") ;

            // Get the length of str1 and str2
            int len1 = str1.length();
            int len2 = str2.length();

            // Display the length of str1 and str2
            System.out.println("Length of \"" + str1 + "\" = " + len1);
            System.out.println("Length of \"" + str2 + "\" = " + len2);
    }
}