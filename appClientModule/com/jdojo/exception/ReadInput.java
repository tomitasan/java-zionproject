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
 * atomita                        	 13 de nov de 2019	Criacao inicial
 */

package com.jdojo.exception;

import java.io.IOException;

public class ReadInput {
        public static char readChar() {
                char c = '\u0000';
                int input = 0;
                try {
                        input = System.in.read();
                        if (input != -1) {
                                c = (char)input;
                        }
                }
                catch (IOException e) {
                        System.out.print("IOException occurred while reading input.");
                }
                return c;
        }
}