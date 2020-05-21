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
 * atomita                        	 2 de abr de 2020	Criacao inicial
 */

package com.jdojo.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class BirthdayDiary {
    
    private Map<String, LocalDate> birthdays;    
    
    public BirthdayDiary() {        
        birthdays = new HashMap<>();    
        }    
    
    public LocalDate addBirthday(String name, int day, int month, int year) {        
        LocalDate birthday = LocalDate.of(year, month, day);        
        birthdays.put(name, birthday);        
        return birthday;    
        }    
    
    public LocalDate getBirthdayFor(String name) {        
        return birthdays.get(name);    
        }    
    
    public int getAgeInYear(String name, int year) {        
        Period period = Period.between(birthdays.get(name),birthdays.get(name).withYear(year));        
        return period.getYears();    
        }    
    
    public Set<String> getFriendsOfAgeIn(int age, int year) {        
        return birthdays.keySet().stream().filter(p -> getAgeInYear(p, year) == age).collect(Collectors.toSet());    
        }    
    
    public int getDaysUntilBirthday(String name) {        
        Period period = Period.between(LocalDate.now(),birthdays.get(name));        
        return period.getDays();    
        }    
    
    public Set<String> getBirthdaysIn(Month month) {        
        return birthdays.entrySet().stream().filter(p -> p.getValue().getMonth() == month).map(p -> p.getKey()).collect(Collectors.toSet());    
        }    
    
    public Set<String> getBirthdaysInCurrentMonth() {        
        return getBirthdaysIn(LocalDate.now().getMonth());    
    }    
    
    public int getTotalAgeInYears() {        
        return birthdays.keySet().stream().mapToInt(p -> getAgeInYear(p,LocalDate.now().getYear())).sum();}
    
}
