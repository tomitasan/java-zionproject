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

public class DoubleHolder implements Cloneable {
    private double value;

    public DoubleHolder(double value) {
            this.value = value;
    }

    public void setValue(double value) {
            this.value = value;
    }

    public double getValue() {
            return this.value;
    }
     
    public DoubleHolder clone() {
            Object copy = null;
            try {
                    // Call the clone() method of the Object class, which will do a
                    // bit-by-bit copy and return the reference of the clone
                    copy = (DoubleHolder) super.clone();
            }
            catch (CloneNotSupportedException e) {
                    // If anything goes wrong during cloning, print the error details
                    e.printStackTrace();
            }
            return (DoubleHolder)copy;
    }
}
