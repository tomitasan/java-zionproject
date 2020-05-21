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

package com.jdojo.string;

public class StringComparison {
    public static void main(String[] args) {
            String apple = new String("Apple") ;
            String orange = new String("Orange") ;
             
            System.out.println(apple.equals(orange));
            System.out.println(apple.equals(apple));
            System.out.println(apple == apple);
            System.out.println(apple == orange);
            System.out.println(apple.compareTo(apple));
            System.out.println(apple.compareTo(orange));
            
            System.out.println("-------------------------------------");
            
            String str = "AL,FL,NY,CA,GA";
            
            // Split str using a comma as the delimiter
            String[] parts = str.split(",");
                  
            // Print the the string and its parts
            System.out.println(str);
          
            for(String part : parts) {
                 System.out.println(part);
            }
            System.out.println("-------------------------------------");
            // Join some strings using a comma as the delimiter
            String str1 = String.join(",", "AL", "FL", "NY", "CA", "GA");
            System.out.println(str1);
    }
}
