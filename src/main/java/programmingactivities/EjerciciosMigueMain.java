/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmingactivities;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author asura
 */
public class EjerciciosMigueMain {

    public static void main(String[] args) throws IOException {
        EjerciciosMigue ejerciciosMigue = new EjerciciosMigue();
        EjerciciosMigue ejerciciosMigue2 = new EjerciciosMigue();

        
        Scanner exerciseNumber = new Scanner(System.in);
        System.out.println("Exercise number ");

        switch (exerciseNumber.nextInt()) {
            case 4:
                ejerciciosMigue.ejercicio4(-5,8, 6);
                break;
            case 7:
                Scanner teclado_int = new Scanner(System.in);

                System.out.println("Enter a number ");
                int number = teclado_int.nextInt();

                ejerciciosMigue.ejercicio7(number);
                break;
            case 11:
                ejerciciosMigue.ejercicio11();
                break;
            case 15:
                System.out.println(ejerciciosMigue.ejercicio15(2, 3));
                break;
            case 19:
                Scanner decimalNumber = new Scanner(System.in);
                System.out.println("Enter a number ");
                int decnumber = decimalNumber.nextInt();

                System.out.println(ejerciciosMigue.ejercicio19(decnumber));
                break;
            case 37:
                ejerciciosMigue.ejercicio37();
                break;
            case 50:
                ejerciciosMigue.ejercicio50();
                break;
            case 52:
                ejerciciosMigue.ejercicio52();
                break;
            case 60:
                ejerciciosMigue.ejercicio60();
                break;
            case 64:
                ejerciciosMigue.ejercicio64();
                break;
            case 66:
                ejerciciosMigue.ejercicio66();
                break;
            case 69:
                ejerciciosMigue.ejercicio69();
                break;
            case 71:
                ejerciciosMigue.ejercicio71();
                break;
            case 77:
                ejerciciosMigue.ejercicio77();
                break;
            case 121:
                ejerciciosMigue.ejercicio121();
                break;
            case 01:
                ejerciciosMigue.ejercicionuevo1();
                break;
            case 02:
                ejerciciosMigue.ejercicionuevo2();
                break;
            case 03:
                ejerciciosMigue.ejercicionuevo1_2();
                break;
            default:
                System.out.println("no existe ese ejercicio");
        }

    }

}
