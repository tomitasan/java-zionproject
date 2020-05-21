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

import java.time.DayOfWeek;
import static java.time.DayOfWeek.FRIDAY;
import static java.time.DayOfWeek.MONDAY;
import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.SUNDAY;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
 
public class CustomAdjuster {
        public final static TemporalAdjuster WEEKDAYS_WITH_NO_FRIDAY_13 =
                        TemporalAdjusters.ofDateAdjuster(CustomAdjuster::getWeekDayNoFriday13);
         
        // No public constructor as it is a utility class
        private CustomAdjuster() { }
 
        private static LocalDate getWeekDayNoFriday13(LocalDate date) {
                // Initialize the new date with the original one
                LocalDate newDate = date;
                 
                DayOfWeek day = date.getDayOfWeek();
                if (day == SATURDAY || day == SUNDAY || (day == FRIDAY && date.getDayOfMonth() == 13)) {
                        // Return next Monday
                        newDate = date.with(TemporalAdjusters.next(MONDAY));
                }
                return newDate;
        }
}