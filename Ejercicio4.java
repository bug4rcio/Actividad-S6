/*
Construir un programa que pida ingresar un número, luego
muestre la tabla de multiplicar de dicho número del 1 al 12.
*/

package ejercicio.pkg4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        int contador = 1, numero, resultado;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingresar número para realizar tabla:");
        numero = sc.nextInt();
        
        while(contador <= 12){
            resultado = (numero * contador);
            System.out.println(+contador+ " x " +numero+ " = " +resultado);
            contador++;
        }
    }  
}