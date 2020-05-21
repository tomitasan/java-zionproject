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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author atomita
 *
 */
public class SimpleDotComTestDrive {

    public static void main (String[] args) throws IOException {
        
       int numOfGuessess = 0;       
//       String result = null;    
       GameHelper helper = new GameHelper ();
       
       SimpleDotCom theDotCom = new SimpleDotCom();
       
       int randomNum = (int) Math.random() * 5;
       int[] locations = {randomNum, randomNum + 1, randomNum + 2};
       
       theDotCom.setLocationCells(locations);      
       boolean isAlive = true;    
//       BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
       while (isAlive) {         
//           System.out.print("Enter with guess: ");
//           String userGuess = in.readLine();
           
           String guess = helper.getUserInput("Enter a number:");
           
           String result = theDotCom.checkYourself(guess);
           
           numOfGuessess++;
           
           if (result.equals("kill")) {
               isAlive = false;
               System.out.println("You took " + numOfGuessess + " guessess");
           }   
//           if (result == "kill") {
//               break;
//           }
//           else {               
//               if (result == "hit")
                   
//               else
//                   System.out.println("Try Again");
//           }
       }
//       if (result == "kill")
//           System.out.println("You win after " + numOfGuessess + " guesses!");    
//      String testResult = "false";     //bloco adicionado para  
//      if (result == "hit")             //validar teste true or false
//           testResult = "passed";      
//       System.out.println(testResult);
    }
 }