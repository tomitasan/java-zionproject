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

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
 
public class DateTimeZoneConversion {
        public static void main(String[] args) {
                LocalDateTime ldt = LocalDateTime.of(2012, Month.MAY, 14, 16, 30);
 
                ZoneId usCentral = ZoneId.of("America/Chicago");
                ZonedDateTime zdt = ZonedDateTime.of(ldt, usCentral);
                System.out.println("In US Central Time Zone:" + zdt);
 
                ZoneId asiaKolkata = ZoneId.of("Asia/Kolkata");
                ZonedDateTime zdt2 = zdt.withZoneSameInstant(asiaKolkata);
                System.out.println("In Asia/Kolkata Time Zone:" + zdt2);
 
                ZonedDateTime zdt3 = zdt.withZoneSameInstant(ZoneId.of("Z"));
                System.out.println("In UTC Time Zone:" + zdt3);
        }
}
