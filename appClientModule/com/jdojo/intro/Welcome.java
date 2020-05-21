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
 * atomita                        	 7 de nov de 2019	Criacao inicial
 */

package com.jdojo.intro;

import com.jdojo.cls.Human;

public class Welcome
{

    public static void main(String[] args)
    {
        //System.out.println("Inicio do programa Java!!!!");
        
        Bye.main(null);
        Human jack = new Human();
        
        Human.count = 101;
        long population = Human.count;
        
        jack.name = "Tomita";
        jack.gender = "Masculino";
             
        
        System.out.println("Human Name: " + jack.name);
        System.out.println("Human Gender: " + jack.gender);
        System.out.println("Human Population: " + population);

    }

}
