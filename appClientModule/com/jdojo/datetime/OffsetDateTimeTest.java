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

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
 
public class OffsetDateTimeTest {
        public static void main(String[] args) {
                // Get the current offset time
                OffsetTime ot1 = OffsetTime.now();
                System.out.println("Current offset time: " + ot1);
 
                // Creete a zone offset +05:30
                ZoneOffset offset = ZoneOffset.ofHoursMinutes(5, 30);
 
                // Create an offset time
                OffsetTime ot2 = OffsetTime.of(16, 40, 28, 0, offset);
                System.out.println("An offset time: " + ot2);
 
                // Get the current offset datetime
                OffsetDateTime odt1 = OffsetDateTime.now();
                System.out.println("Current offset datetime: " + odt1);
 
                // Create an offset datetime
                OffsetDateTime odt2 = OffsetDateTime.of(2012, 5, 11,
                                                        18, 10, 30, 0,
                                                        offset);
                System.out.println("An offset datetime: " + odt2);
 
                // Get the local date and time from the offset datetime
                LocalDate ld1 = odt1.toLocalDate();
                LocalTime lt1 = odt1.toLocalTime();
                System.out.println("Current Local Date: " + ld1);
                System.out.println("Current Local Time: " + lt1);
 
                // Get the instant from the offset datetime
                Instant i1 = odt1.toInstant();
                System.out.println("Current Instant: " + i1);
 
                // Create an offset datetime from the instant
                ZoneId usChicago = ZoneId.of("America/Chicago");
                OffsetDateTime odt3 = OffsetDateTime.ofInstant(i1, usChicago);
                System.out.println("Offset datetime from instant: " + odt3);
                
                ZoneId usChicago1 = ZoneId.of("America/Chicago");
                ZoneOffset offset5 = ZoneOffset.of("-05:00");
                ZoneOffset offset6 = ZoneOffset.of("-06:00");
                ZoneOffset offset7 = ZoneOffset.of("-07:00");
                 
                // At 2013-10-03T01:30, -05:00 and -06:00 offsets were valid for
                // the time zone America/Chicago
                LocalDateTime ldt = LocalDateTime.of(2013, Month.NOVEMBER, 3, 1, 30);
                ZonedDateTime zdt5 = ZonedDateTime.ofLocal(ldt, usChicago1, offset5);
                ZonedDateTime zdt6 = ZonedDateTime.ofLocal(ldt, usChicago1, offset6);
                ZonedDateTime zdt7 = ZonedDateTime.ofLocal(ldt, usChicago1, offset7);
                System.out.println("With offset " + offset5 + ": " + zdt5);
                System.out.println("With offset " + offset6 + ": " + zdt6);
                System.out.println("With offset " + offset7 + ": " + zdt7);
                
        }
}