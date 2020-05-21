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

public class NameHidingTest3 
{
    int n1 = 10;  // An instance variable n1

    public void m1() 
    {

            /* Only the instance variable n1 is in scope here */
 
            int n2 = n1; // Assigns 10 to n2
 
            /* Only the instance variable n1 is in scope here. The local variable n2
               is also in scope here, which you are ignoring for our discussion for now */
 
            int n1 = 20; /* A local variable n1 */
 
            /* Both, instance variable n1 and local variable n1 are in scope here.
               We are ignoring n2 for now. */
 
            int n3 = n1; // Assigns 20 to n3
    }
}
