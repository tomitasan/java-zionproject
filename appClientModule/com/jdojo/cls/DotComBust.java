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
 * atomita                        	 27 de jan de 2020	Criacao inicial
 */

/**
 * 
 */
package com.jdojo.cls;

/**
 * @author atomita
 *
 */

import java.util.*;

public class DotComBust
{
    private GameHelper helper = new GameHelper();
    private ArrayList <DotCom> dotComsList = new ArrayList <DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        
        DotCom two = new DotCom();
        two.setName("eToys.com");
        
        DotCom three = new DotCom();
        three.setName("Go2.com");
        
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        
        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com and Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");
        
        for (DotCom dotComToSet: dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }
    
    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess:");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    
    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";
        
        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            
            if(result.equals("hit")) {
                    break;
            }
            if (result.equals("kill")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }
    
    private void finishGame() {
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if(numOfGuesses <=18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Yook you long enought. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }
    
    public static void main(String[] args)
    {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
