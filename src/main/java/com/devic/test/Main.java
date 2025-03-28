package com.devic.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ioSiEsPalindromo();  // LLamado al metodo
    }

    //Metodo para entrada y salida del programa
    static void ioSiEsPalindromo(){
        //Enttrada  bus de datos
        Scanner sc = new Scanner(System.in);
        //Mensaje en consola
        System.out.println( "Por favor ingrese la palabra a verificar si es un palindromo: ");
        //Instancia de Objeto Palindromo
        Palindromo p = new Palindromo();;
        //Lectura bus de datos
        String palabra = sc.nextLine();;
        //Condicional True o false
        if (p.esPalindromo(palabra)){
            System.out.println("El palabra  " + palabra + " es un palindromo");
        } else {
            System.out.println("El palabra  " + palabra + " NO es un palindromo");
        }
        sc.close();; //Cerrar bus de datos
    }
}