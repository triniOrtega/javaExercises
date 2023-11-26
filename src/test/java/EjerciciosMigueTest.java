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
        System.setProperty("line.separator","\r\n");

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
}
