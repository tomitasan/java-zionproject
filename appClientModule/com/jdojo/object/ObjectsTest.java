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

import java.time.Instant;
import java.util.Objects;
import java.util.function.Supplier;

public class ObjectsTest {
    public static void main(String[] args) {
            // Compute hash code for two integers, a char, and a string
            int hash = Objects.hash(10, 8900, '\u20b9', "Hello");
            System.out.println("Hash Code is " + hash);

            // Test for equality
            boolean isEqual = Objects.equals(null, null);
            System.out.println("null is equal to null: " + isEqual);

            isEqual = Objects.equals(null, "XYZ");
            System.out.println("null is equal to XYZ: " + isEqual);

            // toString() method test
            System.out.println("toString(null) is " + Objects.toString(null));
            System.out.println("toString(null, \"XXX\") is " + Objects.toString(null, "XXX"));

            // Testing requireNonNull(T obj, String message)
            try {
                    printName("Doug Dyer");
                    printName(null);
            }
            catch (NullPointerException e) {
                    System.out.println(e.getMessage());
            }

            // requireNonNull(T obj, Supplier<String> messageSupplier)
            try {
                    // Using a lambda expression to create a Supplier<String> object.
                    // The Supplier returns a timestamped message.
                    Supplier<String> messageSupplier = () -> "Name is required. Error generated on " + Instant.now();
                    printNameWithSuplier("Babalu", messageSupplier);
                    printNameWithSuplier(null, messageSupplier);
            }
            catch (NullPointerException e) {
                    System.out.println(e.getMessage());
            }
    }

    public static void printName(String name) {
            // Test name for not null. Generate a NullPointerException if it is null.
            Objects.requireNonNull(name, "Name is required.");

            // Print the name if the above statement dod not throw an exception
            System.out.println("Name is " + name);
    }

    public static void printNameWithSuplier(String name, Supplier<String> messageSupplier) {
            // Test name for not null. Generate a NullPointerException if it is null.
            Objects.requireNonNull(name, messageSupplier);

            // Print the name if the above statement dod not throw an exception
            System.out.println("Name is " + name);
    }
}
