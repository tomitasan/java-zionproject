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

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
 
public class PeriodTest {
        public static void main(String[] args) {
                ZoneId usCentral = ZoneId.of("America/Chicago");
                LocalDateTime ldt = LocalDateTime.of(2012, Month.MARCH, 10, 7, 30);
                ZonedDateTime zdt1 = ZonedDateTime.of(ldt, usCentral);
                Period p1 = Period.ofDays(1);
                Duration d1 = Duration.ofHours(24);
 
                // Add a period of 1 day and a duration of 24 hours
                ZonedDateTime zdt2 = zdt1.plus(p1);
                ZonedDateTime zdt3 = zdt1.plus(d1);
 
                System.out.println("Start Datetime: " + zdt1);
                System.out.println("After 1 Day period: " + zdt2);
                System.out.println("After 24 Hours duration: " + zdt3);
        }
}