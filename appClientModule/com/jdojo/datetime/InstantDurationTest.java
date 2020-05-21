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
import java.time.Instant;
 
public class InstantDurationTest {
        public static void main(String[] args) {
                Instant i1 = Instant.ofEpochSecond(20);
                Instant i2 = Instant.ofEpochSecond(55);
                System.out.println("i1:" + i1);
                System.out.println("i2:" + i2);
                 
                Duration d1 = Duration.ofSeconds(55);
                Duration d2 = Duration.ofSeconds(-17);
                System.out.println("d1:" + d1);
                System.out.println("d2:" + d2);
                 
                // Compare instants
                System.out.println("i1.isBefore(i2):" + i1.isBefore(i2));
                System.out.println("i1.isAfter(i2):" + i1.isAfter(i2));
                 
                // Add and subtract durations to instants
                Instant i3 = i1.plus(d1);
                Instant i4 = i2.minus(d2);
                System.out.println("i1.plus(d1):" + i3);
                System.out.println("i2.minus(d2):" + i4);
                 
                // Add two durations
                Duration d3 = d1.plus(d2);
                System.out.println("d1.plus(d2):" + d3);
        }
}