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
 
public class MethodTypeTest {
        public static void main(String[] args) {
                // Create an instance of the MethodTYpe class
                MethodType mt = new MethodType();
 
                System.out.println("Invoking instance method...");
 
                // Invoke the instance method
                mt.printMN();
 
                System.out.println("Invoking class method on class name...");
 
                // Invoke the class method using the class name
                MethodType.printM();
 
                System.out.println("Invoking class method on an instance...");
 
                // Invoke the class method using the instance reference
                mt.printM();
        }
}
