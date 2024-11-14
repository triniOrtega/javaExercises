package programmingactivities;

import java.io.IOException;
import java.util.Scanner;

public class EjerciciosTriniMain {

    public static void main(String[] args) throws IOException {
        EjerciciosTrini ejerciciosTrini = new EjerciciosTrini();


        Scanner exerciseNumber = new Scanner(System.in);
        System.out.println("Exercise number ");

        switch (exerciseNumber.nextInt()) {
            case 41:
                System.out.println(ejerciciosTrini.ejercicio41(-5, 8, 6));

                break;
            case 42:
                System.out.println(ejerciciosTrini.ejercicio42(55, 9));

                break;
            case 52:
                System.out.println(ejerciciosTrini.ejercicio52());

                break;
            case 55:
                System.out.println(ejerciciosTrini.ejercicio55());

                break;
            case 64:
                System.out.println(ejerciciosTrini.ejercicio64());

                break;
            case 641:
                System.out.println(ejerciciosTrini.ejercicio641());

                break;
            case 83:
                System.out.println(ejerciciosTrini.ejercicio83());

                break;
            default:
                System.out.println("no existe ese ejercicio");
        }
    }
}
