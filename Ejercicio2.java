/*
Calcular el salario total de un grupo de “n” trabajadores (el valor
“n” se ingresa por teclado) dada la cantidad de horas trabajadas
y la tarifa por hora para cada uno de los trabajadores.
*/

package ejercicio.pkg2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        int contador = 1, trabajadores, horasTrabajadas;
        double sumaSalario = 0, salarioI, salarioHora;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresar número de trabajadores:");
        trabajadores = sc.nextInt();
        
        while(contador <= trabajadores){
            System.out.println("Ingresar horas de trabajador: " +contador);
            horasTrabajadas = sc.nextInt();
            
            System.out.println("Ingresar pago por hora de trabajador: " +contador);
            salarioHora = sc.nextDouble();
            
            contador++;
            salarioI = (horasTrabajadas * salarioHora);
            sumaSalario += salarioI;
        }
        System.out.println("El salario total de: " +trabajadores+ " trabajadores es: S/" +sumaSalario);
    }
}