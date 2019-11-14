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

public class Account {
    private double balance;

    public double getBalance() {
            // Return the balance of this account
            return this.balance;
    }

    public int credit(double amount) {
            // Make sure credit amount is not negative, NaN or infinity
            if (amount < 0.0 || Double.isNaN(amount) || Double.isInfinite(amount)) {
                    System.out.println("Invalid credit amount: " + amount);
                    return -1;
            }

            // Credit the amount
            System.out.println("Crediting amount: " + amount);
            this.balance = this.balance + amount;
            return 1;
    }

    public int debit(double amount) {
            // Make sure the debit amount is not negative, NaN or infinity */
            if (amount < 0.0 || Double.isNaN(amount) || Double.isInfinite(amount)) {
                    System.out.println("Invalid debit amount: " + amount);
                    return -1;
            }

            // Make sure a minimum balance of zero is maintained
            if (this.balance < amount) {
                    System.out.println("Insufficient fund. Debit attempted: " + amount);
                    return -1;
            }

            // Debit the amount
            System.out.println("Debiting amount: " + amount);
            this.balance = this.balance - amount;
            return 1;
    }
    private boolean isValidAmount(double amount, String operation) {
        // Make sure amount is not negative, NaN or infinity
        if (amount < 0.0 || Double.isNaN(amount) || Double.isInfinite(amount)) {
          System.out.println("Invalid " + operation + " amount: " + amount);
          return false;
        }
        return true;
    }
    
    
}