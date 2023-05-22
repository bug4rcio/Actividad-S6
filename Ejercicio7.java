/*
Escribir un programa que solicite ingresar 10 notas de alumnos y
nos informe cuántos tienen notas mayores o iguales a 7 y
cuántos menores.
*/

package ejercicio.pkg7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        int contador = 1, mayor7 = 0, menor7 = 0;
        double notas;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("<Ingresar 10 notas de alumnos>");
        
        while(contador <= 10){
            System.out.println("Ingrese nota N° " +contador+ ":");
            notas = sc.nextDouble();
            
            if(notas < 0 || notas > 20){
                System.out.println("Ingresar notas válidas.");
            }else{
                if(notas >= 7){
                    mayor7++;
                }else{
                    menor7++;
                }
                contador++;
            }
        }
        System.out.println("Hay: " +mayor7+ " notas mayores o iguales a 7");
        System.out.println("Hay: " +menor7+ " notas menores a 7");
    }
}