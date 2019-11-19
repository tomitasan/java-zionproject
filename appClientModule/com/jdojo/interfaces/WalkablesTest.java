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
 * atomita                        	 19 de nov de 2019	Criacao inicial
 */

package com.jdojo.interfaces;

public class WalkablesTest {
    public static void main(String[] args) {
            Walkable[] w = new Walkable[4];
            w[0] = new Person("Jack");
            w[1] = new Duck("Jeff");
            w[2] = new Person("John");
            w[3] = new Cat("Tom");
            System.out.printf("*%n**%n***%n****%n*****%n");
     
            // Let everyone walk
            Walkables.letThemWalk(w);
    }
}
