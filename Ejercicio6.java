/*
Escriba un programa que solicite al usuario que ingrese su
contraseña (20201) y que repita hasta que contraseña sea
correcta mostrando un mensaje “bienvenido a la Casa de estudio
UTP” caso contrario el mensaje debe decir “Usted no pertenece
a esta ciudad universitaria”.
*/

package ejercicio.pkg6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        int intentos = 5, pass;
        
        Scanner sc = new Scanner(System.in);
        
        while(intentos >= 0){
            System.out.println("Ingresar contraseña:");
            pass = sc.nextInt();
                
            if(pass != 20201){
            System.out.println("Usted no pertenece a esta ciudad universitaria.");
            System.out.println("Le quedan: " +intentos+ " intentos.\n");
            } else{
            System.out.println("Bienvenido a la Casa de estudio UTP"); break;
            }
            intentos--;
        }
    }
}