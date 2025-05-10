package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void testMainOutput() {
        // Captura la salida estándar
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            Main.main(new String[]{});
            String output = outContent.toString().trim();
            assertTrue(output.contains("6"), "La salida debe contener '6'");
        } finally {
            System.setOut(originalOut);
        }
    }
}