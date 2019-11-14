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
 * atomita                        	 13 de nov de 2019	Criacao inicial
 */

package com.jdojo.exception;

import java.io.StringWriter;
import java.io.PrintWriter;
 
public class StackTraceAsStringTest {
        public static void main(String[] args) {
                try {
                        m1();
                }
                catch(MyException e) {
                        String str = getStackTrace(e);
 
                        // Print the stack trace to the standard output
                        System.out.println(str);
                }
        }
 
        public static void m1() throws MyException {
                m2();
        }
 
        public static void m2() throws MyException {
                throw new MyException("Some error has occurred.");
        }
 
        public static String getStackTrace(Throwable e) {
                StringWriter strWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(strWriter);
                e.printStackTrace(printWriter);
 
                // Get the stack trace as a string
                String str = strWriter.toString();
 
                return str;
        }
}