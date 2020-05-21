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

public class NameHidingTest2 
{
    int n1 = 10;  // An instance variable

    /// m1 is a method
    void m1() 
    {
            int n1 = 20; // A local variable

            /* Both, instance variable n1 and local variable n1, are in scope here */

            int n2 = n1; // What value is assigned to n2 - 10 or 20?
    }

    /* Only instance variable n1 is in scope here */

    int n3 = n1; // n3 is assigned 10 from the instance variable n1
 
}