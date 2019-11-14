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

import java.time.ZoneOffset;

public class ZoneOffsetTest {
    public static void main(String[] args) {
            // Create zone offset using hour, minute, and second
            ZoneOffset zos1 = ZoneOffset.ofHours(-6);
            ZoneOffset zos2 = ZoneOffset.ofHoursMinutes(5, 30);
            ZoneOffset zos3 = ZoneOffset.ofHoursMinutesSeconds(8, 30, 45);
            System.out.println(zos1);
            System.out.println(zos2);
            System.out.println(zos3);

            // Create zone offset using offset ID as a string
            ZoneOffset zos4 = ZoneOffset.of("+05:00");
            ZoneOffset zos5 = ZoneOffset.of("Z"); // Same as ZoneOffset.UTC
            System.out.println(zos4);
            System.out.println(zos5);

            // Print the values for zone offset constants
            System.out.println("ZoneOffset.UTC: "  + ZoneOffset.UTC);
            System.out.println("ZoneOffset.MIN: "  + ZoneOffset.MIN);
            System.out.println("ZoneOffset.MAX: "  + ZoneOffset.MAX);
    }
}