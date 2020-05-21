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

import java.util.regex.Pattern;
import java.util.regex.Matcher;
 
public class PatternMatcher {
        public static void main(String[] args) {
                String regex = "[abc]@.";
 
                String source = "cric@jdojo.com is a valid email address";
                PatternMatcher.findPattern(regex, source);
 
                source = "kelly@jdojo.com is invalid";
                PatternMatcher.findPattern(regex, source);
 
                source = "a@band@yea@u";
                PatternMatcher.findPattern(regex, source);
 
                source = "There is an @ sign here";
                PatternMatcher.findPattern(regex, source);
        }
 
        public static void findPattern(String regex, String source) {
                // Compile regex into a Pattern object
                Pattern p = Pattern.compile(regex);
 
                // Get a Matcher object
                Matcher m = p.matcher(source);
 
                // Print regex and source text
                System.out.println("\nRegex:" + regex);
                System.out.println("Text:" + source);
 
                // Perform find
                boolean found = false;
                while (m.find()) {
                                                         System.out.println("Matched Text:" + m.group() +
                                          ", Start:" + m.start() +
                                          ", " + "End:" + m.end());
 
                       // We found at least one match. Set the found flag to true
                       found = true;
                }
 
                if (!found) {
                       // We did not find any match
                       System.out.println("No match found");
                }
        }
}
