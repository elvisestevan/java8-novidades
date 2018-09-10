package com.elvisestevan;

import java.security.Timestamp;

public class Main {

    public static void main(String[] args) {
        OrdenandoColecoes ordenandoColecoes = new OrdenandoColecoes();
        long endTime, startTime;

        ordenandoColecoes.getList()
            .stream()
            .mapToInt(String::length)
            .average();

        /*
        startTime = System.currentTimeMillis();
        ordenandoColecoes.ordenarJava7();
        endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução Java 7: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        ordenandoColecoes.ordenarJava8();
        endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução Java 8: " + (endTime - startTime));*/
    }
}
