/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s08;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN
 */
public class fig01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, numF;
        // Primera mitad del patrón (creciente)
        System.out.println("Ingrese el numero de filas a generar");
        numF = scan.nextInt();
        //Para mostrar exactamente la cantidad de filas
        numF = numF / 2;
        for (int i = 1; i <= numF; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }

        num = numF;
        numF = 1;

        // Segunda mitad del patrón (decreciente)
        for (int i = num; i >= numF; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println(" ");
        }
    }
    
}