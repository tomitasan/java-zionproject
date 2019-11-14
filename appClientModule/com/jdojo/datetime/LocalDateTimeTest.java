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
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
 
public class LocalDateTimeTest {
        public static void main(String[] args) {
                // Create a local date and time
                LocalDate ld = LocalDate.of(2012, Month.MAY, 11);
                LocalTime lt = LocalTime.of(8, 52, 23);
                System.out.println("ld: " + ld);
                System.out.println("ld.isLeapYear(): " + ld.isLeapYear());
                System.out.println("lt: " + lt);
                 
                // Create a local datetime from the local date and time
                LocalDateTime ldt = LocalDateTime.of(ld, lt);
                System.out.println("ldt: " + ldt);
                 
                // Add 2 months and 25 minutes to the local datetime
                LocalDateTime ldt2 = ldt.plusMonths(2).plusMinutes(25) ;
                System.out.println("ldt2: " + ldt2);
                 
                // Derive the local date and time from teh localdatetime
                LocalDate ld2 = LocalDate.from(ldt2);
                LocalTime lt2 = LocalTime.from(ldt2);
                System.out.println("ld2: " + ld2);
                System.out.println("lt2: " + lt2);
        }
}