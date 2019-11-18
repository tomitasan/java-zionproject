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
 * atomita                        	 18 de nov de 2019	Criacao inicial
 */

package com.jdojo.datetime;

import java.io.IOException;
import java.time.*;
import java.io.*;


public class Zodiac
{
@SuppressWarnings("unused")
public static void main(String[] args) throws IOException
{
    
    java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    LocalDate aniversario = null;
    int dia;
    int mes;
    int ano;
    

    System.out.print("Entre com o dia do seu aniversario: ");
    dia = Integer.parseInt(in.readLine());
    
    System.out.print("Entre com o mes do seu aniversario: ");
    mes = Integer.parseInt(in.readLine());
        
    System.out.print("Entre com o ano do seu aniversario: ");
    ano = Integer.parseInt(in.readLine());
    

    
    
//    System.out.println(aniversario);

    LocalDate aquario = LocalDate.of(LocalDate.now().getYear(), 1, 20);
    LocalDate peixes = LocalDate.of(LocalDate.now().getYear(), 2, 19);
    LocalDate aries = LocalDate.of(LocalDate.now().getYear(), 3, 21);
    LocalDate touro = LocalDate.of(LocalDate.now().getYear(), 4, 20);
    LocalDate gemeos = LocalDate.of(LocalDate.now().getYear(), 5, 21);
    LocalDate cancer = LocalDate.of(LocalDate.now().getYear(), 6, 21);
    LocalDate leao = LocalDate.of(LocalDate.now().getYear(), 7, 23);
    LocalDate virgem = LocalDate.of(LocalDate.now().getYear(), 8, 23);
    LocalDate libra = LocalDate.of(LocalDate.now().getYear(), 9, 23);
    LocalDate escorpiao = LocalDate.of(LocalDate.now().getYear(), 10, 23);
    LocalDate sargitario = LocalDate.of(LocalDate.now().getYear(), 11, 22);
    LocalDate capricornio = LocalDate.of(LocalDate.now().getYear(), 12, 22);

    try {
        
        aniversario = LocalDate.of(ano, mes, dia);
        
        switch(mes) {
            case 1: if(dia >= 20){System.out.println("Voc� � de aquario!");}
                    else System.out.println("Voc� � de capricornio");
                    break;
            case 2: if(dia >= 19){System.out.println("Voc� � de peixes!");}
                    else System.out.println("Voc� � de aquario");
                    break;
            case 3: if(dia >= 21){System.out.println("Voc� � de aries!");}
                    else System.out.println("Voc� � de peixes");
                    break;
            case 4: if(dia >= 20){System.out.println("Voc� � de touro!");}
                    else System.out.println("Voc� � de aries");
                    break;
            case 5: if(dia >= 21){System.out.println("Voc� � de gemeos!");}
                    else System.out.println("Voc� � de touro");
                    break;
            case 6: if(dia >= 21){System.out.println("Voc� � de cancer!");}
                    else System.out.println("Voc� � de gemeos");
                    break;
            case 7: if(dia >= 23){System.out.println("Voc� � de leao!");}
                    else System.out.println("Voc� � de cancer");
                    break;
            case 8: if(dia >= 23){System.out.println("Voc� � de virgem!");}
                    else System.out.println("Voc� � de leao");
                    break;
            case 9: if(dia >= 23){System.out.println("Voc� � de libra!");}
                    else System.out.println("Voc� � de virgem");
                    break;
            case 10: if(dia >= 23){System.out.println("Voc� � de escorpiao!");}
                    else System.out.println("Voc� � de libra");
                    break;
            case 11: if(dia >= 22){System.out.println("Voc� � de sargitario!");}
                    else System.out.println("Voc� � de escorpiao");
                    break;
            case 12: if(dia >= 22){System.out.println("Voc� � de capricornio!");}
                    else System.out.println("Voc� � de sargitario");
                    break;
            default: System.out.println("Dia ou m�s inv�lidos. Impossivel determinar seu signo\nVoc� � um ET?");
                }
        }catch(DateTimeException e) {
            System.out.println("Dia ou m�s incorretos!!!");      
        }
      }
}
