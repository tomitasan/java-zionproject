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
 * atomita                        	 13 de nov de 2019	Criacao inicial
 */

package com.jdojo.object;

public class Book {
    private String title;
    private String author;
    private int pageCount;
    private boolean hardCover;
    private double price;

    /* Other code goes here */

    /* Must implement the equals() method too. */

    public int hashCode() {
            int hash = 37;
            int code = 0;

            // Use title
            code = (title == null ? 0 : title.hashCode());
            hash = hash * 59 + code;
     
            // Use author
            code = (author == null ? 0 : author.hashCode());
            hash = hash * 59 + code;

            // Use pageCount
            code = pageCount;
            hash = hash * 59 + code;

            // Use hardCover
            code = (hardCover ? 1 : 0);
            hash = hash * 59 + code;

            // Use price
            long priceBits = Double.doubleToLongBits(price);
            code = (int)(priceBits ^ (priceBits >>>32));
            hash = hash * 59 + code;

            return hash;
    }
}
