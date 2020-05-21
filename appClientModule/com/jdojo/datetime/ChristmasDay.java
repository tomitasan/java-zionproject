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
import java.time.MonthDay;
import java.time.Year;
import java.time.format.TextStyle;
import java.util.Locale;
 
public class ChristmasDay {
        public static void main(String[] args) {
                MonthDay dec25 = MonthDay.of(Month.DECEMBER, 25);
                Year year = Year.now();
                 
                // Construct and print Christmas days in next five years
                for (int i = 0; i <= 5; i++) {
                        LocalDate ld = year.plusYears(i).atMonthDay(dec25);
                        int yr = ld.getYear();
                        String weekDay = ld.getDayOfWeek()
                                           .getDisplayName(TextStyle.FULL, Locale.getDefault());
                        System.out.format("Christmas in %d is on %s.%n", yr, weekDay);
                }
        }
}
