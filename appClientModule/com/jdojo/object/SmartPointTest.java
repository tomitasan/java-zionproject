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

package com.jdojo.object;

public class SmartPointTest {
    public static void main(String[] args)  {
            SmartPoint pt1 = new SmartPoint(10, 10);
            SmartPoint pt2 = new SmartPoint(10, 10);
            SmartPoint pt3 = new SmartPoint(12, 19);
            SmartPoint pt4 = pt1;
     
            System.out.println("pt1 == pt1: " + (pt1 == pt1));
            System.out.println("pt1.equals(pt1): " + pt1.equals(pt1));
     
            System.out.println("pt1 == pt2: " + (pt1 == pt2));
            System.out.println("pt1.equals(pt2): " + pt1.equals(pt2));
     
            System.out.println("pt1 == pt3: " + (pt1 == pt3));
            System.out.println("pt1.equals(pt3): " + pt1.equals(pt3));
     
            System.out.println("pt1 == pt4: " + (pt1 == pt4));
            System.out.println("pt1.equals(pt4): " + pt1.equals(pt4));
    }
}