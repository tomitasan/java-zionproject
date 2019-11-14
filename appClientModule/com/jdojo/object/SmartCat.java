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

public class SmartCat {
    private String name;

    public SmartCat(String name) {
            this.name = name;
    }

    /* Reimplement the equals() method */
    public boolean equals(Object otherObject) {
            // Are they the same?
            if (this == otherObject) {
                    return true;
            }

            // Is otherObject a null reference?
            if (otherObject == null) {
                    return false;
            }

            // Do they belong to the same class?
            if (this.getClass() != otherObject.getClass()) {
                    return false;
            }

            // Get the reference of otherObject is a SmartCat variable
            SmartCat otherCat = (SmartCat)otherObject;

            // Do they have the same names
            boolean isSameName = (this.name == null? otherCat.name == null
                                               :this.name.equals(otherCat.name) );

            return isSameName;
    }

    /* Reimplement the hashCode() method, which is a requirement
       when you reimplement equals() method */
    public int hashCode() {
            return (this.name == null? 0 : this.name.hashCode());
    }
}
