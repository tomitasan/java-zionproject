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

public class StringBuilderTest {
    public static void main(String[] args) {
            // Create an empty StringNuffer
            StringBuilder sb = new StringBuilder();
            printDetails(sb);

            // Append "blessings"
            sb.append("blessings");
            printDetails(sb);

            // Insert "Good " in the beginning
            sb.insert(0, "Good ");
            printDetails(sb);

            // Delete the first o
            sb.deleteCharAt(1);
            printDetails(sb);

            // Append " be with you"
            sb.append(" be with you");
            printDetails(sb);

            // Set the length to 3
            sb.setLength(3);
            printDetails(sb);

            // Reverse the content
            sb.reverse();
            printDetails(sb);
    }

    public static void printDetails(StringBuilder sb) {
            System.out.println("Content: \"" + sb + "\"");
            System.out.println("Length: " + sb.length());
            System.out.println("Capacity: " + sb.capacity());

            // Print an empty line to separate results
            System.out.println();
    }
}