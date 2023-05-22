/*
Diseñe un programa que imprima y sume 40 términos de la
siguiente serie. Los términos serán mostrados en una columna a
razón de un término por fila: 4, 7, 10, 13, 16, 19, 22, ...
*/

package ejercicio.pkg8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        
        int contador = 4;
        
        Scanner sc = new Scanner(System.in);
        
        while(contador <= 40){
            System.out.println(contador);
            contador += 3;
        }
    }
}