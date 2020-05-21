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
 * atomita                        	 4 de mar de 2020	Criacao inicial
 */

package com.jdojo.cls;

import javax.sound.midi.*; 

public class MusicTest1
{
    public void play() {
        
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Successfully got a sequencer");
        }catch (MidiUnavailableException ex) {
            System.out.println("Bummer");
        }
    }
    
    public static void main(String[] args){
        MusicTest1 mt = new MusicTest1 ();
        mt.play();
    }

}
