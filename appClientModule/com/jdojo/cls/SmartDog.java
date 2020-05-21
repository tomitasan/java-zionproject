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

public class SmartDog {
    private String name;
    private double price;
             
    public SmartDog() {
            // Initialize the name to "Unknown" and the price to 0.0
            this.name = "Unknown";
            this.price = 0.0;
     
            System.out.println("Using SmartDog() constructor");
    }
             
    public SmartDog(String name, double price) {
            // Initialize name and price instance variables
            // with the name and price parameters
            this.name = name;
            this.price = price;
     
            System.out.println("Using SmartDog(String, double) constructor");
    }
     
    public void bark() {
            System.out.println(name + " is barking...");
    }
     
    public void setName(String name) {
            this.name = name;
    }
     
    public String getName() {
            return this.name;
    }
     
    public void setPrice(double price) {
            this.price = price;
    }
     
    public double getPrice() {
            return this.price;
    }
             
    public void printDetails(){
            System.out.print("Name: " + this.name );
            if (price > 0.0) {
                    System.out.println(", price: " + this.price );
            }
            else {
                    System.out.println(", price: Free" );
            }
    }
}
