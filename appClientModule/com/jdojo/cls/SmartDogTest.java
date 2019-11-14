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

public class SmartDogTest {
    public static void main(String[] args)  {
            // Create two SmartDog objects
            SmartDog sd1 = new SmartDog();
            SmartDog sd2 = new SmartDog("Nova", 219.2);

            // Print details about the two dogs
            sd1.printDetails();
            sd2.printDetails();

            // Make them bark
            sd1.bark();
            sd2.bark();

            // Change the name and price of Unknown dog
            sd1.setName("Opal");
            sd1.setPrice(321.80);

            // Print details again
            sd1.printDetails();
            sd2.printDetails();

            // Make them bark one more time
            sd1.bark();
            sd2.bark();
    }
}
