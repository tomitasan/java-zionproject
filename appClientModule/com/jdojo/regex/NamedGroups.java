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

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class NamedGroups {
        public static void main(String[] args) {
                // Prepare the regular expression
                String regex =
                       "\\b(?<areaCode>\\d{3})(?<prefix>\\d{3})(?<lineNumber>\\d{4})\\b";
                 
                // Reference first two groups by names and the thrd oen as its number
                String replacementText = "(${areaCode}) ${prefix}-$3";
                 
                String source = "3342449027, 2339829, and 6152534734";
 
                // Compile the regular expression
                Pattern p = Pattern.compile(regex);
 
                // Get Matcher object
                Matcher m = p.matcher(source);
 
                // Replace the phone numbers by formatted phone numbers
                String formattedSource = m.replaceAll(replacementText);
 
                System.out.println("Text: " + source);
                System.out.println("Formatted Text: " + formattedSource);
        }
}
