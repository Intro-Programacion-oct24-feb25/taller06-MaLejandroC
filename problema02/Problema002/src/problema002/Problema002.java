/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema002;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author utpl
 */
public class Problema002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\

        Scanner valores = new Scanner(System.in);
        valores.useLocale(Locale.US);

        String propietario;
        double valorVh;
        int tipo;
        String ntipo = "";
        double calculo = 0;

        System.out.print("Ingrese el nombre propietario: ");
        propietario = valores.nextLine();
        System.out.print("Ingrese el valor del vehiculo: $");
        valorVh = valores.nextDouble();
        System.out.print("Ingrese el tipo de vehiculo: ");
        tipo = valores.nextInt();

        switch (tipo) {
            case 1:
                ntipo = "vehículo liviano particular";
                calculo = (valorVh * 0.01) / 100 + 2;
                break;

            case 2:
                ntipo = "vehículo grande particular";
                calculo = (valorVh * 0.02) / 100 + 2.5;
                break;

            case 3:
                ntipo = "taxi";
                calculo = (valorVh * 0.04) / 100 + 1.5;
                break;

            case 4:
                ntipo = "bus urbano";
                calculo = (valorVh * 0.05) / 100 + 2.2;
                break;

        }

        System.out.printf("Peaje \"buena via\"\n\tPropietario:%s\nTipo: %s\n\t"
                + "valor: $%.0f\n\tPeaje: $%.1f",
                propietario,
                ntipo,
                valorVh,
                calculo);

    }

}
