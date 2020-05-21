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
import java.util.ArrayList;

public class SimpleDotCom {

    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
       locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
       int guess = Integer.parseInt(stringGuess);
       String result = "miss";
       for (int cell : locationCells) {
          if (guess == cell) {
            result = "hit";
            numOfHits++;
            break;
          }
       } // out of the loop

       if (numOfHits == locationCells.length) {
           result = "kill";
       }
       System.out.println(result);
          return result;
    } // close method
 } // close class
