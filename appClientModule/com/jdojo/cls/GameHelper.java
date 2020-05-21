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
import java.io.*;
import java.util.ArrayList;

public class GameHelper {
    
    private static final String alphabet = "abcdefg";
    private int gridLenght = 7;
    private int gridSize = 49;
    private int [] grid = new int [gridSize];
    private int comCount = 0;
    
    public String getUserInput (String prompt) {
        String inputLine = null;
        System.out.println(prompt + " ");
        try
        {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            
            if (inputLine.length() == 0 ) return null;
        }
        catch (Exception e)
        {
            System.out.println("IOException: " + e);
        }
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom (int comSize){
        ArrayList<String> alphaCells = new ArrayList<String>();
        
        String temp = null; //temporary String to concatenate
        int [] coords = new int [comSize]; //current candidate coords
        int attemps = 0; //current attemps counter
        boolean success = false; //flag = found a good location ? 
        int location = 0 ; //current starting location
        
        comCount ++; //nth dot com to place
        int incr = 1; //set horizontal increment
        if ((comCount % 2) == 1) { //if odd dot com (place vertically)
            incr = gridLenght; //set vertical increment
        }
        
        while (!success & attemps++ < 200) { //main search loop (32)
            location = (int) (Math.random() * gridSize); //get random starting point
            
            System.out.println(" try " + location); 
            
            int x = 0; //nth position in dotcom to place
            success = true; //assume success
            while (success && x < comSize) { //look for adjacent unused spots
                if (grid[location] == 0) { //if not already used
                    
                    coords[x++] = location; //save location
                    location += incr; //try next adjacent position
                    
                    if (location >= gridSize) { //out of bounds - bottom
                        success = false; //fail
                    }
                    if (x > 0 && (location % gridLenght == 0)) { //out of bounds - edge
                        success = false; // fail
                    } 
                } else { //found already used location
                    System.out.println(" used " + location);
                    success = false; //fail
                }
            }
        }
        
        //turn location into alpha coords
        int x = 0;
        int row = 0;
        int column = 0;
        
        System.out.println("\n");
        
        while (x < comSize) {
            grid [coords[x]] = 1; //mark master grid pts. as used
            row = (int) (coords[x] / gridLenght); //get row value
            column = coords[x] % gridLenght; //get numeric column value
            temp = String.valueOf(alphabet.charAt(column)); //convert to alpha
            
            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
            
            System.out.println(" coord " + x + " = " + alphaCells.get(x-1));
        }
        System.out.println("\n");    
        return alphaCells;
    }
//    public String getUserInput(String prompt) {
//        String inputLine = null;
//        System.out.print(prompt + " ");
//      
//        try {
//            BufferedReader is = new BufferedReader(
//                new InputStreamReader(System.in));
//            inputLine = is.readLine();
//            if (inputLine.length() == 0 ) return null;
//        } catch (IOException e) {
//            System.out.println("IOException: " + e);
//        }
//        return inputLine;
//    }
}