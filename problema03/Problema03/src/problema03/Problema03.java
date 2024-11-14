/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;


import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Alejandro
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner(System.in);
        datos.useLocale(Locale.US);
        
        
        String nombre; 
        int tipodeempleado;
        double sueldo;
        double calculo;
        double sueldofinal;
        
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = datos.nextLine();
        System.out.print("Ingrese el tipo de empleado: ");
        tipodeempleado = datos.nextInt();
        System.out.print("Ingrese el sueldo del empleado: $");
        sueldo = datos.nextDouble();
        
        
        
        switch (tipodeempleado) {
            case 1:
                calculo = sueldo*0.05;
                break;

            case 2:
                calculo = sueldo*0.07;
                break;

            case 3:
                calculo = sueldo*0.09;
                break;

            case 4:
                calculo = sueldo*0.12;
                break;
                
            default:
                calculo = sueldo*0.15;
                break;
                
        }
        
        
        sueldofinal = sueldo + calculo;
        
        System.out.printf("Nombre: %s \nSueldo inicial: $%.2f\n"
                + "Incremento de sueldo: $%.2f\nNuevo sueldo: $%.2f\n",
                nombre,
                sueldo,
                calculo,
                sueldofinal);
        
    }
    
}
