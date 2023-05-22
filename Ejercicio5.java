/*
Desarrollar un programa que luego de ingresar 2 números
naturales imprima los números naturales que hay entre ambos
empezando por el menor. Asumimos que el usuario ingresa dos
números diferentes y el segundo es mayor que el primero.
*/

package ejercicio.pkg5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        int contador, n1, n2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresar (2) números naturales:\n"
                + "El segundo número debe ser mayor y diferente al primero.");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        
        if (n1 < 0 || n2 < 0){
            System.out.println("Ingresar solo números naturales.");
            
            
        } else if (n1 != n2 && n2 > n1){
            contador = (n1+1);
            
            while(contador < n2){
                System.out.print("("+contador+")");
            contador++;
            }

        } else{
            System.out.println("Leer la instrucción.");
        }
    }
}