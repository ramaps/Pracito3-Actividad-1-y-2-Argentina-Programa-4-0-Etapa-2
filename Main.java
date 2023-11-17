package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> textoSinConcatenar = crearLista("hola", "como", "estas?", "yo bien");
        int n = 3;
        String texto = concatenarPalabras(textoSinConcatenar, n);
        // mostrar el resultado
        System.out.println(texto);
    }

    // metodo para crear una lista a partir las palabras
    public static List<String> crearLista(String... palabras) {
        List<String> lista = new ArrayList<>();
        for (String palabra : palabras) {
            lista.add(palabra);
        }
        return lista;
    }

    // metodo para concatenar palabras que sean mas largas que n en la lista
    public static String concatenarPalabras(List<String> listaStrings, int n) {
        // Filtrar y unir las palabras
        List<String> palabrasFiltradas = new ArrayList<>();
        for (String palabra : listaStrings) {
            if (palabra.length() > n) {
                palabrasFiltradas.add(palabra);
            }
        }
        return String.join(", ", palabrasFiltradas);
    }
}
