/*
Leer el promedio de cada uno de los “n” alumnos del curso Taller
de Programación. Mostrar cantidad de aprobados.
*/

package ejercicio.pkg3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        int contador = 1, alumnos, aprobados = 0, desaprobados = 0;
        double promedio;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresar cantidad de alumnos:");
        alumnos = sc.nextInt();
        
        while(contador <= alumnos){
            System.out.println("Ingresar promedio del alumno: " +contador);
            promedio = sc.nextDouble();
            
            contador++;
            
            if(promedio >= 11.5 && promedio <= 20){
                aprobados++;
            } else{
                desaprobados++;
            }
        }
        System.out.println("\nLa cantidad de aprobados en el curso es: " +aprobados);
        System.out.println("La cantidad de desaprobados en el curso es: " +desaprobados);
    }
}