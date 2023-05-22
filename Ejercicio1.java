/*
Una planta que fabrica perfiles de hierro posee un lote de “n”
piezas. Crear un programa que pida ingresar por teclado la
cantidad de piezas a procesar y luego ingrese la longitud de cada
perfil; sabiendo que las piezas correctas son de longitud de
rango de 1.20 y 1.30. Imprimir por pantalla la cantidad de piezas
correctas que hay en el lote.
*/

package ejercicio.pkg1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        int piezas, contador = 1;
        int correctas = 0, incorrectas = 0;
        double longitud;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresar cantidad de piezas:");
        piezas = sc.nextInt();
        
        while(contador <= piezas){
            System.out.println("Ingresar la longitud de la pieza: " +contador);
            longitud = sc.nextDouble();
            
            contador++;
            
            if(longitud >= 1.20 && longitud <= 1.30){
                correctas++;
            } else{
                incorrectas++;
            }
        }
        System.out.println("Cantidad de piezas correctas: " +correctas);
        System.out.println("Cantidad de piezas incorrectas: " +incorrectas);
    }
}