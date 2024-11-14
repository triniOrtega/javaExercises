import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import programmingactivities.ContadorChar;
import programmingactivities.EjerciciosTrini;


import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class EjerciciosTriniTest {

    EjerciciosTrini ejerciciosTrini;

    @BeforeAll
    void setup() {
        ejerciciosTrini = new EjerciciosTrini();
    }

    @Test
    void Ejercicio41Test() {

        int resultado = ejerciciosTrini.ejercicio41(-5, 8, 6);
        assertEquals(43,resultado);
    }

    @Test
    void Ejercicio42Test() {

        int resultado = ejerciciosTrini.ejercicio42(55, 9);
        assertEquals(1, resultado);
    }

    @Test
    void Ejercicio43Test() {

        int resultado = ejerciciosTrini.ejercicio43(20,-3,5,8);
        assertEquals(19, resultado);
    }

    @Test
    void Ejercicio44Test() {

        int resultado = ejerciciosTrini.ejercicio44(5, 15, 3, 2, 8);
        assertEquals(13, resultado);
    }

    @Test
    void Ejercicio37Test() {

        String resultado = ejerciciosTrini.ejercicio37("The quick brown fox");
        assertEquals("xof nworb kciuq ehT", resultado);
    }

    @Test
    void Ejercicio38Test() {

        ContadorChar resultado = ejerciciosTrini.ejercicio38("Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
        assertEquals( 23, resultado.letras);
        assertEquals( 10, resultado.getNumeros());
        assertEquals( 9, resultado.getEspacios());
        assertEquals( 6, resultado.otros);

    }

    @Test
    void Ejercicio48Test() {

        ArrayList<Integer> resultado = ejerciciosTrini.ejercicio48(10);
        Assertions.assertIterableEquals(Arrays.asList(1,3,5,7,9), resultado);

    }



}
