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

import java.text.Collator;
import java.util.Locale;
 
public class CollatorStringComparison {
        public static void main(String[] args) {
                // Create a Locale object for US
                Locale USLocale = new Locale("en", "US");
 
                // Get collator instance for US
                Collator c = Collator.getInstance(USLocale);
                String str1 = "cat";
                String str2 = "Dog";
 
                int diff = c.compare(str1, str2);
 
                System.out.print("Comparing using Collator class: ");
                print(diff, str1, str2);
 
                System.out.print("Comparing using String class: ");
                diff = str1.compareTo(str2);
                print(diff, str1, str2);
        }
 
        public static void print(int diff, String str1, String str2) {
                if (diff > 0) {
                        System.out.println(str1 + " comes after " + str2);
                }
                else if (diff < 0) {
                        System.out.println(str1 + " comes before " + str2);
                }
                else {
                        System.out.println(str1 + " and " + str2 + " are the same.");
                }
        }
}