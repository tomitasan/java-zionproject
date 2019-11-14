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

public class StackFrameTest {
    public static void main(String[] args) {
            m1();
    }

    public static void m1() {
            m2();
    }

    public static void m2() {
            m3();
    }

    public static void m3() {
            // Create a Throwable object that will hold the stack state
            // at this point for the thread that executes the following statement
            Throwable t = new Throwable();

            // Get the stack trace elements
            StackTraceElement[] frames = t.getStackTrace();

            // Print details about the stack frames
            printStackDetails(frames);
    }

    public static void printStackDetails(StackTraceElement[] frames) {
            System.out.println("Frame count: " + frames.length);

            for (int i = 0; i < frames.length; i++) {
                    // Get frame details
                    int frameIndex = i; // i = 0 means top frame
                    String fileName = frames[i].getFileName();
                    String className = frames[i].getClassName();
                    String methodName = frames[i].getMethodName();
                    int lineNumber = frames[i].getLineNumber();

                    // Print frame details
                    System.out.println("Frame Index: " + frameIndex);
                    System.out.println("File Name: " + fileName);
                    System.out.println("Class Name: " + className);
                    System.out.println("Method Name: " + methodName);
                    System.out.println("Line Number: " + lineNumber);
                    System.out.println("---------------------------");
            }
    }
}