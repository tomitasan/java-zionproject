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

package com.jdojo.inheritance;

public class EarlyBindingTest {
    public static void main(String[] args) {
            EarlyBindingSuper ebSuper = new EarlyBindingSuper();
            EarlyBindingSub ebSub = new EarlyBindingSub();

            // Will access EarlyBindingSuper.str
            System.out.println(ebSuper.str);

            // Will access EarlyBindingSuper.count
            System.out.println(ebSuper.count);

            // Will access EarlyBindingSuper.print()
            ebSuper.print();

            System.out.println("------------------------------");

            // Will access EarlyBindingSub.str
            System.out.println(ebSub.str);

            // Will access EarlyBindingSub.count
            System.out.println(ebSub.count);

            // Will access EarlyBindingSub.print()
            ebSub.print();

            System.out.println("------------------------------");

            // Will access EarlyBindingSuper.str
            System.out.println(((EarlyBindingSuper)ebSub).str);

            // Will access EarlyBindingSuper.count
            System.out.println(((EarlyBindingSuper)ebSub).count);

            // Will access EarlyBindingSuper.print()
            ((EarlyBindingSuper)ebSub).print();

            System.out.println("------------------------------");

            // Assign the ebSub to ebSuper
            ebSuper = ebSub; // Upcasting

            /* Now access methods and fields using ebSuper variable, which is
             referring to a EarlyBindingSub object
            */

            // Will access EarlyBindingSuper.str
            System.out.println(ebSuper.str);

            // Will access EarlyBindingSuper.count
            System.out.println(ebSuper.count);

            // Will access EarlyBindingSuper.print()
            ebSuper.print();
            System.out.println("------------------------------");
    }
}
