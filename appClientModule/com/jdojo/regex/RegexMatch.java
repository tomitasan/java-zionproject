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

package com.jdojo.regex;


public class RegexMatch {
    public static void main(String[] args) {
            // Prepare a regular expression to represent a pattern
            String regex = ".@.";
            
            // newStr will contain "webmaste***dojo.com"
            String newStr = "webmaster@jdojo.com".replaceAll(regex,"***");
             
            // newStr will contain "***"
            newStr = "A@B".replaceAll(regex,"***");
             
            // newStr will contain "***and***"
            newStr = "A@BandH@G".replaceAll(regex,"***");
             
            // newStr will contain "B%T" (same as the original string)
            newStr = "B%T".replaceAll(regex,"***");
             
            // Try matching many strings against the regular expression
            RegexMatch.matchIt("a@k", regex);
            RegexMatch.matchIt("webmaster@jdojo.com", regex);
            RegexMatch.matchIt("r@j", regex);
            RegexMatch.matchIt("a%N", regex);
            RegexMatch.matchIt(".@.", regex);
    }

    public static void matchIt(String str, String regex) {
            // Test for pattern match
            if (str.matches(regex)) {
                   System.out.println(str + " matches the regex " + regex);
            }
            else {
                   System.out.println(str + " does not match the regex " + regex);
            }
    }
}
