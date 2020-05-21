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
 * atomita                        	 22 de jan de 2020	Criacao inicial
 */

/**
 * 
 */
package com.jdojo.cls;

/**
 * @author atomita
 *
 */
public class GuessGame
{
    Player p1;
    Player p2;
    Player p3;
    
    public void startGame() {
        p1 = new Player ();
        p2 = new Player ();
        p3 = new Player ();
        
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I´m thinking of a number between 0 and 9...");
        
        while (true) {
            
            System.out.println("Numer to guess is " +  targetNumber);
            
            p1.guess();
            p2.guess();
            p3.guess();
            
            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);
            
            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);
            
            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);
            
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            
            if (p1isRight | p2isRight | p3isRight) {
                
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over!");
                break;
            } else {
                System.out.println("Players will have to try again...");
            }
        }
    }
}