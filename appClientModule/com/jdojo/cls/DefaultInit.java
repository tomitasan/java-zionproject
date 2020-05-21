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

class DefaultInit {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    boolean bool;
    String str;
     
    public static void main(String[] args) {
            // Create an object of DefaultInit class
            DefaultInit obj = new DefaultInit();
             
            // Print the default values for all instance variables
            System.out.println("byte is initialized to " + obj.l);
            System.out.println("short is initialized to " + obj.s);
            System.out.println("int is initialized to " + obj.i);
            System.out.println("long is initialized to " + obj.l);
            System.out.println("float is initialized to " + obj.f);
            System.out.println("double is initialized to " + obj.d);
            System.out.println("boolean is initialized to " + obj.bool);
            System.out.println("String is initialized to " + obj.str);
            
            int max1 = MathUtil5.max(12, 8);        // will return 12
            int max2 = MathUtil5.max(10, 1, 30);    // will return 30
            int max3 = MathUtil5.max(11, 3, 7, 37); // will return 37
            
            System.out.println("Valor de max1: "+ max1);
            System.out.println("Valor de max2: "+ max2);
            System.out.println("Valor de max2: "+ max3);
    }
}