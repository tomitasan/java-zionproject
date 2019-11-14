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

public class DeepClone implements Cloneable {
    private DoubleHolder holder = new DoubleHolder(0.0);

    public DeepClone(double value) {
            this.holder.setValue(value);
    }

    public void setValue(double value) {
            this.holder.setValue(value);
    }

    public double getValue() {
            return this.holder.getValue();
    }

    public Object clone() {
            DeepClone copy = null;
            try {
                    copy = (DeepClone)super.clone();
     
                    // Need to clone the holder reference variable too
                    copy.holder = (DoubleHolder)this.holder.clone();
            }
            catch (CloneNotSupportedException e) {
                    e.printStackTrace();
            }
     
            return copy;
    }
}