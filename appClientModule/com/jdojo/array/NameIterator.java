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

public class NameIterator {
        public static void main(String[] args) {
                // Create an ArrayList of String
                ArrayList<String> nameList = new ArrayList<String>();
 
                //Add some names
                nameList.add("Christopher");
                nameList.add("Kathleen");
                nameList.add("Ann");
 
                // Get the count of names in the list
                int count = nameList.size();
 
                // Let us print the name list
                System.out.println("List of names...");
                for(int i = 0; i < count; i++) {
                        String name = nameList.get(i);
                        System.out.println(name);
                }
 
                // Let us remove Kathleen from the list
                nameList.remove("Kathleen");
 
                // Get the count of names in the list again
                count = nameList.size();
 
                // Let us print the name list again
                System.out.println("After removing Kathleen...");
                for(int i = 0; i < count; i++) {
                        String name = nameList.get(i);
                        System.out.println(name);
                }
        }
}