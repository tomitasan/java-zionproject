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
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;
 
public class TimeBetween {
        public static void main(String[] args) {
                LocalDate ld1 = LocalDate.of(2014, Month.JANUARY, 7);
                LocalDate ld2 = LocalDate.of(2014, Month.MAY, 18);
                long days = DAYS.between(ld1, ld2);
                 
                LocalTime lt1 = LocalTime.of(7, 0);
                LocalTime lt2 = LocalTime.of(9, 30);
                long hours = HOURS.between(lt1, lt2);
                long minutes = MINUTES.between(lt1, lt2);
                 
                System.out.println("Using between (days): " + days);
                System.out.println("Using between (hours): " + hours);
                System.out.println("Using between (minutes): " + minutes);
                 
                // Using the until() method
                long days2 = ld1.until(ld2, DAYS);
                long hours2 = lt1.until(lt2, HOURS);
                long minutes2 = lt1.until(lt2, MINUTES);
 
                System.out.println("Using until (days): " + days2);
                System.out.println("Using until (hours): " + hours2);
                System.out.println("Using until (minutes): " + minutes2);
        }
}
