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

import java.util.ArrayList;

public class DotCom {

    private ArrayList <String> locationCells;
    private String name;
//    int numOfHits = 0;

    public void setLocationCells(ArrayList<String> locs) {
       locationCells = locs;
    }
    
    public void setName (String n) {
        name = n;
    }

    public String checkYourself(String userInput) {
        
//       int guess = Integer.parseInt(stringGuess);
       
       String result = "miss";
       
       int index = locationCells.indexOf(userInput);
       
       if (index >= 0) {
           locationCells.remove(index);
       
           if (locationCells.isEmpty()) {
               result = "kill";
               System.out.println("Ouch! You sunk " + name + " :P ");
           } else {
               result = "hit";
           }
       }
       return result;
       
//     for (int cell : locationCells) {
//     if (guess == cell) {
//       result = "hit";
//       numOfHits++;
//       break;
//     }
//  } // out of the loop
//
//  if (numOfHits == locationCells.length) {
//      result = "kill";
//  }
//  System.out.println(result);
    } // close method
 } // close class