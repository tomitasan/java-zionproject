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

package com.jdojo.datetime;

import java.time.LocalDate;
import java.time.Month;
 
public class MonthTest {
        public static void main(String[] args) {
                // Use Month.JULY as a method argument
                LocalDate ld1 = LocalDate.of(2012, Month.JULY, 1);
 
                // Derive a Month from a local date
                Month m1 = Month.from(ld1);
 
                // Create a Month from an int value 2
                Month m2 = Month.of(2);
 
                // Get the next month from m2
                Month m3 = m2.plus(1);
 
                // Get the Month from a local date
                Month m4 = ld1.getMonth();
 
                // Convert an enum constant to an int
                int m5 = m2.getValue();
 
                System.out.format("%s, %s, %s, %s, %d%n", m1, m2, m3, m4, m5);
        }
}