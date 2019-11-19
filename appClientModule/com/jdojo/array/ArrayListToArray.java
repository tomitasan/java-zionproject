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

import java.util.ArrayList;
import java.util.Arrays;
 
public class ArrayListToArray {
        public static void main(String[] args){
                ArrayList<String> al = new ArrayList<String>();
                al.add("cat");
                al.add("dog");
                al.add("rat");
 
                // Print the content of arrayList
                System.out.println("ArrayList:" + al);
                 
                // Create an array of teh same length as teh ArrayList
                String[] s1 = new String[al.size()];
                 
                // Copy the ArrayList elements to teh array
                String[] s2 = al.toArray(s1);
                 
                // s1 has enough space to copy all ArrayList elements.
                // al.toArray(s1) returns s1 itself
                System.out.println("s1 == s2:" + (s1 == s2));
                System.out.println("s1:" + Arrays.toString(s1));
                System.out.println("s2:" + Arrays.toString(s2));
 
                // Create an array of string with 1 element.
                s1 = new String[1];
                s1[0] = "hello" ; // Store hello in first element
 
                // Copy ArrayList to the array s1
                s2 = al.toArray(s1);
 
                /* Since s1 doesn't have sufficient space to copy all ArrayList elements,
                al.toArray(s1) creates a new String array with 3 elements in it. All elements of
                arraylist are copied to new array. Finally, new array is returned. Here, s1 ==
                s2 is false. s1 will be untouched by the method call.
                */
                System.out.println("s1 == s2:" + (s1 == s2));
                System.out.println("s1:" + Arrays.toString(s1));
                System.out.println("s2:" + Arrays.toString(s2));
        }
}