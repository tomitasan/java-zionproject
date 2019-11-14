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

package com.jdojo.string;

public class StringInSwitch {
    public static void main(String[] args) {
            operate("on");
            operate("off");
            operate("ON");
            operate("Nothing");
            operate("OFF");
            operate(null);
    }

    public static void operate(String status) {
            // Check for null
            if (status == null) {
                    System.out.println("status cannot be null.");
                    return;
            }

            // Convert to lowercase
            status = status.toLowerCase();

            switch (status) {
                    case "on":
                            System.out.println("Turn on");
                            break;
                    case "off":
                            System.out.println("Turn off");
                            break;
                    default:
                            System.out.println("Unknown command");
                            break;
            }
    }
}
