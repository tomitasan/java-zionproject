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
 * atomita                        	 5 de mar de 2020	Criacao inicial
 */

package com.jdojo.cls;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class MiniMiniMusicApp
{
    public static void main(String[] args)
    {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }
    
    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            
            Sequence seq = new Sequence (Sequence.PPQ, 4);
            
            Track track = seq.createTrack();
            
            ShortMessage a = new ShortMessage();
            
            
            a.setMessage(144,1,57,100);  // primeiro valor representa o tipo de mensagem
                                         // segundo valor representa o canal
                                         // terceiro valor representa a nota (varia de 0 a 127)
                                         // quarto valor representa a velocidade
            
            
            MidiEvent noteOn = new MidiEvent(a,1);
            track.add(noteOn);
            
            ShortMessage b = new ShortMessage();
            b.setMessage(128,1,57,100);
            MidiEvent noteOff = new MidiEvent(b,16); //tempo de duracao da nota
            track.add(noteOff);
            
            player.setSequence(seq);
            
            player.start();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
