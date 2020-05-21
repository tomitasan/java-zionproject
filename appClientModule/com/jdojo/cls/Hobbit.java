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
 * atomita                        	 23 de jan de 2020	Criacao inicial
 */

/**
 * 
 */
package com.jdojo.cls;

/**
 * @author atomita
 *
 */
public class Hobbit
{
    String name;
    
    public static void main(String[] args)
    {
        Hobbit [] h = new Hobbit [3];
        
        int z = -1;
        
        while (z < 2) { //validar sempre os loops com teste de mesa
            z = z + 1;
            
            h[z] = new Hobbit ();
            h[z].name = "Bilbo";
            
            if (z == 1)
                h[z].name = "Frodo";
            
            if (z == 2)
                h[z].name = "Sam";
            
            System.out.println(h[z].name + " is a good Hobbit name");
        }
    }
}
