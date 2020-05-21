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

public class AccountTest {
    public static void main(String[] args) {
            Account ac = new Account();
            double balance = ac.getBalance();
            System.out.println("Balance = " + balance);
             
            // Credit and debit some amount
            ac.credit(234.78);
            ac.debit(100.12);
             
            balance = ac.getBalance();
            System.out.println("Balance = " + balance);
             
            // Attempt to credit and debit invalid amounts
            ac.credit(-234.90);
            ac.debit(Double.POSITIVE_INFINITY);

            balance = ac.getBalance();
            System.out.println("Balance = " + balance);

            // Attempt to debit more than the balance
            ac.debit(2000.00);
             
            balance = ac.getBalance();
            System.out.println("Balance = " + balance);
    }
}