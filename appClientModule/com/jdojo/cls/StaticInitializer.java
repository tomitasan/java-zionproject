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

public class StaticInitializer {
    private static int num;

    // An instance initializer
    {
            System.out.println("Inside instance initializer.");
    }

    // A static initializer. Note the use of the keyword static below.
    static {
            num = 1245;
            System.out.println("Inside static initializer.");
    }

    // Constructor
    public StaticInitializer() {
            System.out.println("Inside constructor.");
    }

    public static void main(String[] args) {
            System.out.println("Inside main() #1. num: " + num);

            // Declare a reference variable of the class
            StaticInitializer si;

            System.out.println("Inside main() #2. num: " + num);

            // Create an object
            new StaticInitializer();

            System.out.println("Inside main() #3. num: " + num);

            // Create another object
            new StaticInitializer();
    }
}