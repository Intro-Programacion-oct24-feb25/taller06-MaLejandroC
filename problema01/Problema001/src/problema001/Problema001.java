/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema001;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author utpl
 */
public class Problema001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner valores = new Scanner(System.in);
        valores.useLocale(Locale.US);

        double num1;
        double num2;
        double proceso = 0;
        String operacion;

        System.out.print("Ingrese la operacion a realizar: ");
        operacion = valores.nextLine();
        System.out.print("Ingrese el primer valor: ");
        num1 = valores.nextDouble();
        System.out.print("Ingrese el segundo valor: ");
        num2 = valores.nextDouble();

        if (num1 > num2) {

            operacion = operacion.toLowerCase();

            switch (operacion) {
                case ("suma"):
                    proceso = num1 + num2;
                    break;
                    
                case ("resta"):
                    proceso = num1 - num2;
                    break;
                    
                case ("multiplicacion"):
                    proceso = num1 * num2;
                    break;
                    
                case ("division"):
                    proceso = num1 / num2;
                    break;
                    
                case ("modulo"):
                    proceso = num1 % num2;
                    break;
                    
                case ("potencia"):
                    proceso = Math.pow(num1, num2);
                    break;
                    

            }
            System.out.printf("La opercion es igual a: %.2f", proceso);
        } else {
            System.out.println("Los valores ingresados no cumplen la condicion");

        }
    }

}
