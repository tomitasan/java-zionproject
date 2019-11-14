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

public class ShallowCloneTest {
    public static void main(String[] args)  {
            ShallowClone sc = new ShallowClone(100.00);
            ShallowClone scClone = (ShallowClone)sc.clone();
     
            // Print the value in original and clone
            System.out.println("Original:" + sc.getValue());
            System.out.println("Clone :" + scClone.getValue());
     
            // Change the value in original and it will change the value
            // for clone too because we have done shallow cloning
            sc.setValue(200.00);
     
            // Print the value in original and clone
            System.out.println("Original:" + sc.getValue());
            System.out.println("Clone :" + scClone.getValue());
    }
}
