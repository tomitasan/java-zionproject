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

package com.jdojo.array;

import java.util.Arrays;

public class Calc {
        public static void main(String[] args) {
                // Print the list of commandline argument
                System.out.println(Arrays.toString(args));
                 
                // Make sure we received three arguments and the
                // the second argument has only one character to indicate operation.
                if (!(args.length == 3 && args[1].length() == 1)) {
                        printUsage();
                        return;  // Stop the program here
                }
 
                // Parse the two number operands. Place the parsing code inside a try-catch,
                // so we will handle the error in case both operands are not numbers.
                double n1 = 0.0;
                double n2 = 0.0;
                try {
                        n1 = Double.parseDouble(args[0]);
                        n2 = Double.parseDouble(args[2]);
                }
                catch (NumberFormatException e) {
                        System.out.println("Both operands must be a number");
                        printUsage();
                        return; // Stop the program here
                }
 
                String operation = args[1];
                double result = compute(n1, n2, operation);
 
                // Print the result
                System.out.println(args[0] + args[1] + args[2] + "=" + result);
    }
 
    public static double compute(double n1, double n2, String operation)
        {
                // Initialize the result with not-a-number
                double result = Double.NaN;
                 
                switch (operation) {
                        case "+":
                                result = n1 + n2;
                                break;
                        case "-":
                                result = n1 - n2;
                                break;
                        case "*":
                                result = n1 * n2;
                                break;
                        case "/":
                                result = n1 / n2;
                                break;
                        default:
                                System.out.println("Invalid operation:" + operation);
                }
 
                return result;
        }
 
        public static void printUsage() {
                System.out.println("Usage: java com.jdojo.array.Calc expr");
                System.out.println("Where expr could be:");
                System.out.println("n1 + n1");
                System.out.println("n1 - n2");
                System.out.println("n1 * n2");
                System.out.println("n1 / n2");
                System.out.println("n1 and n2 are two numbers");
        }
}