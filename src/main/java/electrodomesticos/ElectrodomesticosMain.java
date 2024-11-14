package electrodomesticos;


import java.io.IOException;
import java.util.Scanner;

public class ElectrodomesticosMain {
    public static void main(String[] args) throws IOException {
        Electrodomestico electrodomestico = new Electrodomestico("lavadora", "Fagor", 100);
        Electrodomestico electrodomestico1 = new Electrodomestico("lavavajillas", "Fagor", 2000);

        System.out.println(electrodomestico.toString());
        System.out.println(electrodomestico.getConsumo(5));
        System.out.println(electrodomestico1.toString());
        System.out.println(electrodomestico1.getCosteConsumo(1,5));

        Lavadora lavadora = new Lavadora("Zanusi", 500);
        Electrodomestico lavadora1 = new Lavadora("Fagor", 149, 1000, true);

        System.out.println(lavadora.toString());
        System.out.println(lavadora1.toString());

        System.out.println(lavadora1.getCosteConsumo(8,1));

    }
}
