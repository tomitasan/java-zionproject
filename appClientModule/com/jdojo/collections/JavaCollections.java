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
 * atomita                        	 17 de mar de 2020	Criacao inicial
 */

package com.jdojo.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class JavaCollections
{
    
    public static void testList() {
        List <String> l = new ArrayList <String>();
        List <String> words = Arrays.asList("hello", "world");
        
        l.add("list");
        l.add("test");
        l.add("collection");

        String first = l.get(0);
        String last = l.get(l.size() -1);
        
        l.set(0, last);
        
        l.add(first);
        l.add(0,  first);
        l.addAll(words);
        l.addAll(1, words);
        
        List <String> sub = l.subList(1, 3);
        sub.set(0,  "hi");
        
        String s = Collections.min(l.subList(0, 4));
        
        Collections.sort(l.subList(0, 4));
        
        List <String> subcopy = new ArrayList <String>(l.subList(1, 3));
        
        int p = l.indexOf(last);
        p = l.lastIndexOf(last);
        
        int n = l.size();
        p = 0;
        
        do {
            List <String> list = l.subList(p, n);
            int q = list.indexOf(last);
            if (q == -1 ) break;
            
            System.out.printf("Found '%s' at index %d%n" , last , p+q);
            p += q+1;
            
        } while (p < n);
        
        l.remove(last);
        l.remove(0);
        l.subList(0, 2).clear();
        l.retainAll(words);
        l.removeAll(words);
        l.clear();
        
        for (String x : l)
            System.out.println(x);
        
    }
    
    
    public static void testSortedSet(String [] args) {
        SortedSet <String> s = new TreeSet<>(Arrays.asList(args));
        for (String word : s) {
            System.out.println(word);
        }
        
        String first = s.first();
        String last = s.last();
        
        SortedSet <String> tail = s.tailSet(first + '\0');
        System.out.println(tail);
        
        SortedSet <String> head = s.headSet(last);
        System.out.println(head);
        
        SortedSet <String> middle = s.subSet(first+'\0' , last);
        System.out.println(middle);
    }
    
    public static void main(String[] args)
    {
//        Collection <String> c = new HashSet<>();
//        Collection <String> d = Arrays.asList("one", "two");
//        Collection <String> e = Collections.singleton("three");
//        
//        c.add("zero");
//        c.addAll(d);
//        
//        Collection <String> copy = new ArrayList <String> (c);
//        
//        System.out.println(c);
//        
//        c.remove("zero");
//        c.removeAll(e);
//        c.retainAll(d);
//        c.clear();
//        
//        System.out.println(c);
//        
//        
//        boolean b = c.isEmpty();
//        int s = c.size();
//        
//        c.addAll(copy);
//        
//        b = c.contains("zero");
//        b = c.containsAll(d);
//        
//        System.out.println("C after copy " + c);
//        
//        Object [] elements = c.toArray();
//
//        String [] strings = c.toArray(new String [c.size()]);
        testList();

    } 
}
