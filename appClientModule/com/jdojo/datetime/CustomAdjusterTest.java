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
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
 
public class CustomAdjusterTest {
        public static void main(String[] args) {
                LocalDate ld1 = LocalDate.of(2013, Month.DECEMBER, 12); // Thursday
                LocalDate ld2 = LocalDate.of(2013, Month.DECEMBER, 13); // Friday
                LocalDate ld3 = LocalDate.of(2013, Month.DECEMBER, 14); // Saturday
                 
                LocalDate ld1Adjusted = ld1.with(CustomAdjuster.WEEKDAYS_WITH_NO_FRIDAY_13);
                System.out.println(ld1 + " adjusted to " + ld1Adjusted);
                 
                LocalDate ld2Adjusted = ld2.with(CustomAdjuster.WEEKDAYS_WITH_NO_FRIDAY_13);
                System.out.println(ld2 + " adjusted to " + ld2Adjusted);
                 
                LocalDate ld3Adjusted = ld3.with(CustomAdjuster.WEEKDAYS_WITH_NO_FRIDAY_13);
                System.out.println(ld3 + " adjusted to " + ld3Adjusted);
                 
                // Use it to adjust a ZonedDateTime
                ZonedDateTime zdt =
                        ZonedDateTime.of(ld2, LocalTime.of(8, 45), ZoneId.of("America/Chicago"));
                ZonedDateTime zdtAdjusted = zdt.with(CustomAdjuster.WEEKDAYS_WITH_NO_FRIDAY_13);
                System.out.println(zdt + " adjusted to " + zdtAdjusted);
        }
}