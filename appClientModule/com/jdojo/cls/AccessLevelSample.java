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
 
// Class AccessLevelSample has public access level
public class AccessLevelSample {
        private int num1;   // private access level
        int num2;           // package-level access
        protected int num3; // protected access level
        public int num4;    // public access level
 
        public static int count = 1; // public access level
 
        // m1() method has private access level
        private void m1() {
                // Code goes here
        }
 
        // m2() method has package-level access
        void m2() {
                // Code goes here
        }
 
        // m3() method has protected access level
        protected void m3() {
                // Code goes here
        }
 
        // m4() method has public access level
        public void m4() {
                // Code goes here
        }
 
        // doSomething() method has private access level
        private static void doSometing() {
                // Code goes here
        }
}
