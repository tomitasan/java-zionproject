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
 * atomita                        	 19 de nov de 2019	Criacao inicial
 */

package com.jdojo.inheritance;

public class OverloadingTest {
    public double add(int a, int b) {
            System.out.println("Inside add(int a, int b)");
            double s = a + b;
            return s;
    }
     
    public double add(double a, double b) {
            System.out.println("Inside add(double a, double b)");
            double s = a + b;
            return s;
    }

    public void test(Employee e) {
            System.out.println("Inside test(Employee e)");
    }

    public void test(Manager e) {
            System.out.println("Inside test(Manager m)");
    }

    public static void main(String[] args) {
            OverloadingTest ot = new OverloadingTest();

            int i = 10;
            int j = 15;
            double d1 = 10.4;
            double d2 = 2.5;
            float f1 = 2.3F;
            float f2 = 4.5F;
            short s1 = 2;
            short s2 = 6;
             
            ot.add(i, j);
            ot.add(d1, j);
            ot.add(i, s1);
            ot.add(s1, s2);
            ot.add(f1, f2);
            ot.add(f1, s2);
             
            Employee emp = new Employee();
            Manager mgr = new Manager();
            ot.test(emp);
            ot.test(mgr);
             
            emp = mgr;
            ot.test(emp);
    }
}
