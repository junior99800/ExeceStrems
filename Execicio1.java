package exexStreamsaapi;

import java.util.*;

import java.util.stream.Collectors;

public class Execicio1 {

    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        List<String> numerosOrdenados = numerosAleatorios.stream().sorted().collect(Collectors.toList());

        System.out.println("lista ordenada em ordem crescente" + numerosOrdenados);

    }
}