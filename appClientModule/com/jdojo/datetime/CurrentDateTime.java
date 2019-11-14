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
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
//adicionado * para puxar todos os meses
import static java.time.Month.*;
 
public class CurrentDateTime {
        public static void main(String[] args) {
                // Get current date, time, and datetime
                LocalDate dateOnly = LocalDate.now();
                LocalTime timeOnly = LocalTime.now();
                LocalDateTime dateTime = LocalDateTime.now();
                ZonedDateTime dateTimeWithZone = ZonedDateTime.now();
 
                System.out.println("Current Date: " + dateOnly);
                System.out.println("Current Time: " + timeOnly);
                System.out.println("Current Date and Time: " + dateTime);
                System.out.println("Current Date, Time, and Zone: " + dateTimeWithZone);
 
                // Construct a birth date and time from date-time components
                LocalDate myBirthDate = LocalDate.of(1984,SEPTEMBER, 30);
                LocalTime myBirthTime = LocalTime.of(7, 30);
                System.out.println("My Birth Date: " + myBirthDate);
                System.out.println("My Birth Time: " + myBirthTime);
        }
}
