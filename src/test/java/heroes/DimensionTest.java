package heroes;

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
public class DimensionTest {

    Dimension dimension;

    @BeforeAll
    void setup() {
        dimension = new Dimension();
    }

    @Test
    void getVolumeShouldReturnValidValues() {

        double resultado = dimension.getVolumen(10,5,2);
        assertEquals(100,resultado);
    }






}
