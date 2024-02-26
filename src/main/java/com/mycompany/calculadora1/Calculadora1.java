package com.mycompany.calculadora1;

import java.util.Scanner;

public class Calculadora1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingresa un número para calcular su factorial: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingresa un número válido.");
                scanner.nextLine(); // Consumir la entrada no válida
            }
            int numero = scanner.nextInt();
        
            long factorial = calcularFactorial(numero);
            System.out.println("El factorial de " + numero + " es: " + factorial);
        } catch (Exception e) {
            System.out.println("Se produjo un error: " + e.getMessage());
        } finally {
            scanner.close(); // Cerrar el Scanner al finalizar
        }
    }
    
    public static long calcularFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("No se puede calcular el factorial de un numero negativo");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
