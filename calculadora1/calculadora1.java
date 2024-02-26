package com.mycompany.calculadora1;

import java.util.Scanner;

public class calculadora1 {
    
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
        return resultado;}{
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar los números al usuario
        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();
        
        // Calcular la suma
        double suma = num1 + num2;
        
        // Mostrar el resultado
        System.out.println("La suma es: " + suma);
        
        // Calcular la resta
        double resta = num1 - num2;
        
        // Mostrar el resultado de la resta
        System.out.println("La resta es: " + resta);
        
        scanner.close();
    }
}
