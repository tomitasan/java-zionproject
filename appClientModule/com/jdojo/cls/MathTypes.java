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
 * atomita                        	 1 de abr de 2020	Criacao inicial
 */

package com.jdojo.cls;

public class MathTypes
{
    public static void main(String[] args)
    {
        System.out.println(Math.abs(2));
        System.out.println(Math.abs(-2));
        double cosp3 = Math.cos(0.3);
        double sinp3 = Math.sin(0.3);
        System.out.println((cosp3 * cosp3 + sinp3 * sinp3)); 
        
        // Always 1.0        
        System.out.println(Math.max(0.3, 0.7));
        System.out.println(Math.max(0.3, -0.3));
        System.out.println(Math.max(-0.3, -0.7));
        System.out.println(Math.min(0.3, 0.7));
        System.out.println(Math.min(0.3, -0.3));
        System.out.println(Math.min(-0.3, -0.7));
        System.out.println(Math.floor(1.3));
        System.out.println(Math.ceil(1.3));
        System.out.println(Math.floor(7.5));
        System.out.println(Math.ceil(7.5));
        System.out.println(Math.round(1.3)); 
        
        // Returns long
        System.out.println(Math.round(7.5)); 
        
        // Returns long
        System.out.println(Math.pow(2.0, 10.0));
        System.out.println(Math.exp(1));
        System.out.println(Math.exp(2));
        System.out.println(Math.log(2.718281828459045));
        System.out.println(Math.log10(100_000));
        System.out.println(Math.log10(Integer.MAX_VALUE));
        System.out.println(Math.random());
        System.out.println("Let's toss a coin: ");
        
        if (Math.random() > 0.5) {   
            System.out.println("It's heads");
            } 
        else {    
            System.out.println("It's tails");
            }
    }

}
