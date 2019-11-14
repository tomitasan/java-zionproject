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

class FieldAccessTest {
    public static void main(String[] args) {
            // Create an instance of Human class
            Human jack = new Human();
     
            // Increase count by one
            Human.count++;
     
            // Assign values to name and gender
            jack.name = "Jack Parker";
            jack.gender = "Male";
     
            // Read and print the values of name, gender and count
            String jackName = jack.name;
            String jackGender = jack.gender;
            long population = Human.count;
     
            System.out.println("Name: " + jackName);
            System.out.println("Gender: " + jackGender);
            System.out.println("Population: " + population);
     
            // Change the name
            jack.name = "Jackie Parker";
     
            // Read and print the changed name
            String changedName = jack.name;
            System.out.println("Changed Name: " + changedName);
    }
}
