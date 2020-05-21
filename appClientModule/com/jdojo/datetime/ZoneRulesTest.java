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
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.zone.ZoneOffsetTransition;
import java.time.zone.ZoneRules;
import java.util.List;
 
public class ZoneRulesTest {
        public static void main(String[] args) {
                LocalDateTime now = LocalDateTime.now();
                System.out.println("Current Date Time: " + now);
                 
                ZoneId fixedZoneId = ZoneId.of("+06:00");
                ZoneId bdDhaka = ZoneId.of("Asia/Dhaka");
                ZoneId usChicago = ZoneId.of("America/Chicago");
                 
                // Print some zone rules for ZoneIds
                printDetails(fixedZoneId, now);
                printDetails(bdDhaka, now);
                printDetails(usChicago, now);
        }
         
        public static void printDetails(ZoneId zoneId, LocalDateTime now) {
                System.out.println("Zone ID: " + zoneId.getId());
 
                ZoneRules rules = zoneId.getRules();
                boolean isFixedOffset = rules.isFixedOffset();
                System.out.println("isFixedOffset(): " + isFixedOffset);
 
                ZoneOffset offset = rules.getOffset(now);
                System.out.println("Zone offset: " + offset);
 
                List<ZoneOffsetTransition> transitions = rules.getTransitions();
                System.out.println(transitions);
        }
}