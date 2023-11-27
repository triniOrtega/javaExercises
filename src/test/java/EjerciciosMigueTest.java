import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import programmingactivities.EjerciciosMigue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class EjerciciosMigueTest {

    EjerciciosMigue ejerciciosMigue;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeAll
    void setup() {
        ejerciciosMigue = new EjerciciosMigue();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void Ejercicio4Test() {

        ejerciciosMigue.ejercicio4(-5, 8, 6);
        assertEquals("""
                        43\r
                        1\r
                        19\r
                        13""",
                outputStreamCaptor.toString().trim());
    }

    @Test
    void Ejercicio7Test() {

        ejerciciosMigue.ejercicio7(3);
        assertEquals("3 x 1 = 3\r\n" +
                        "3 x 2 = 6\r\n" +
                        "3 x 3 = 9\r\n" +
                        "3 x 4 = 12\r\n" +
                        "3 x 5 = 15\r\n" +
                        "3 x 6 = 18\r\n" +
                        "3 x 7 = 21\r\n" +
                        "3 x 8 = 24\r\n" +
                        "3 x 9 = 27\r\n" +
                        "3 x 10 = 30",
                outputStreamCaptor.toString().trim());

    }

    @Test
    void Ejercicio15Test() {

        String resultado = ejerciciosMigue.ejercicio15(2,3);

        assertEquals("variable 1 = 3; variable 2 = 2",resultado);
    }

    @Test
    void Ejercicio19Test() {

        String resultado = ejerciciosMigue.ejercicio19(4);

        assertEquals("El numero 4 en binario es: 100",resultado
               );
    }


}
