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

package com.jdojo.exception;

public class FinallyTest {
    public static void main(String[] args) {
            int x = 10, y = 0, z;
            try {
                    System.out.println("Before dividing x by y.");
                    z = x / y;
                    System.out.println("After dividing x by y.");
            }
            catch (ArithmeticException e) {
                    System.out.println("Inside catch block - 1.");
            }
            finally {
                    System.out.println("Inside finally block - 1.");
            }

            System.out.println("-------------------------------");

            try {
                    System.out.println("Before setting z to 2449.");
                    z = 2449;
                    System.out.println("After setting z to 2449.");
            }
            catch (Exception e) {
                    System.out.println("Inside catch block - 2.");
            }
            finally {
                    System.out.println("Inside finally block - 2.");
            }

            System.out.println("-------------------------------");

            try {
                    System.out.println("Inside try block - 3.");
            }
            finally {
                    System.out.println("Inside finally block - 3.");
            }

            System.out.println("-------------------------------");

            try {
                    System.out.println("Before executing System.exit().");
                    System.exit(0);
                    System.out.println("After executing System.exit().");
            }
            finally {
                    // This finally block will not be executed
                    // because application exits in try block
                    System.out.println("Inside finally block - 4.");
            }
    }
}