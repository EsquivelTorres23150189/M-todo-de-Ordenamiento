package com.mycompany.si;
import java.util.Scanner;
public class Si {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números que desea agregar al arreglo: ");
        int n = leer.nextInt();
        int[] numeros = new int[n];
        System.out.println("Ingrese " + n + " números:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = leer.nextInt();
        }
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        System.out.println("Arreglo ordenado en orden ascendente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}