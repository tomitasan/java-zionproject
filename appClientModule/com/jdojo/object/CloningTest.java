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

public class CloningTest {
    public static void main(String[] args)  {
//            DoubleHolder dh = new DoubleHolder(100.00);
            
            DoubleHolder dh = new DoubleHolder(100.00);
            DoubleHolder dhClone = dh.clone();// Clone dh. No cast is needed
            
     
            // Clone dh
//            DoubleHolder dhClone = (DoubleHolder)dh.clone();
            
            // Print the values in original and clone
            System.out.println("Original:" + dh.getValue());
            System.out.println("Clone :" + dhClone.getValue());
     
            // Change the value in original and clone
            dh.setValue(200.00);
            dhClone.setValue(400.00);
            
            
     
            // Print the values in original and clone again
            System.out.println("Original:" + dh.getValue());
            System.out.println("Clone :" + dhClone.getValue());
    }
}