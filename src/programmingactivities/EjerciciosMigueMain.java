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
                ejerciciosMigue.ejercicio4();
                break;
            case 7:
                ejerciciosMigue.ejercicio7();
                break;
            case 11:
                ejerciciosMigue.ejercicio11();
                break;
            case 15:
                ejerciciosMigue.ejercicio15();
                break;
            case 19:
                ejerciciosMigue.ejercicio19();
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
