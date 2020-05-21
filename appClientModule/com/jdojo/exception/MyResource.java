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

package com.jdojo.exception;

public class MyResource implements AutoCloseable {
    private int level;
    private boolean exceptionOnClose;

    public MyResource(int level, boolean exceptionOnClose) {
            this.level = level;
            this.exceptionOnClose = exceptionOnClose;
            System.out.println("Creating MyResource. Level = " + level);
    }

    public void use() {
            if (level <= 0) {
                    throw new RuntimeException("Low in level.");
            }
            System.out.println("Using MyResource level " + this.level);
            level--;
    }

    @Override
    public void close() {
            if (exceptionOnClose) {
                    throw new RuntimeException("Error in closing");
            }
            System.out.println("Closing MyResource...");
    }
}