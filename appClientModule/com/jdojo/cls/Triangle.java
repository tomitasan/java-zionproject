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
 * atomita                        	 5 de dez de 2019	Criacao inicial
 */

package com.jdojo.cls;

public class Triangle {
    double area;
    int height;
    int length;
    
    public static void main(String [] args) {
          int x = 0;
          Triangle [ ] ta = new Triangle[4];
          
          while ( x < 4 ) {
                ta[x] = new Triangle();
                ta[x].height = (x + 1) * 2;
                ta[x].length = x + 4;
                ta[x].setArea();
                System.out.print("triangle "+x+", area");
                System.out.println(" = " + ta[x].area);
                x = x + 1;
          }
          
          int y = x;
          x = 27;
          Triangle t5 = ta[2];
          ta[2].area = 343;
          
          System.out.print("y = " + y);
          System.out.println(", t5 area = "+ t5.area);
    }
    
    public void setArea() {
        area = (height * length) / 2;
    } 
  }