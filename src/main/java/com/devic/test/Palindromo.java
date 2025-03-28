package com.devic.test;

public class Palindromo {

    public Palindromo() {
    } // fin de constructor

    public boolean esPalindromo (String palabra){

            palabra = palabra.replace("  ", ""); // Elimina los espacios
            palabra = palabra.toLowerCase(); // Convierte a minusculas
            StringBuilder palabraInvertida =  new StringBuilder();

            for (int i = palabra.length() - 1 ;  i >=  0 ;  i--){
                palabraInvertida.append(palabra.charAt(i));
            }

            return palabra.equals(palabraInvertida.toString());
    }  // fin de metodo
} // fin de clase
