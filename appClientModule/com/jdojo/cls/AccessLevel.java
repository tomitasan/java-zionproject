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
 * atomita                        	 8 de nov de 2019	Criacao inicial
 */

package com.jdojo.cls;

public class AccessLevel {
    private int v1 = 100;
    int v2 = 200;
    protected int v3 = 300;
    public int v4 = 400;

    private void m1() {
            System.out.println("Inside m1():");
            System.out.println("v1 = " + v1 + ", v2 = " + v2 +
                               ", v3 = " + v3 + ", v4 = " + v4);
    }

    void m2() {
            System.out.println("Inside m2():");
            System.out.println("v1 = " + v1 + ", v2 = " + v2 +
                               ", v3 = " + v3 + ", v4 = " + v4);
    }

    protected void m3() {
            System.out.println("Inside m3():");
            System.out.println("v1 = " + v1 + ", v2 = " + v2 +
                               ", v3 = " + v3 + ", v4 = " + v4);
    }

    public void m4() {
            System.out.println("Inside m4():");
            System.out.println("v1 = " + v1 + ", v2 = " + v2 +
                               ", v3 = " + v3 + ", v4 = " + v4);
    }
}
