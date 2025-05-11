/////////////////////////////////////////////
// ALDO BETTEGA 2101087
// PAOLO PREVEDELLO RAMIREZ 2111944
////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class IntegerToRomanTest {

    @Test
    // Funzione che testa se la funzione checkInt restituisca Null input quando non
    // gli viene passato un oggetto
    public void testNull() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> IntegerToRoman.checkInt(null));
        assertEquals("Null input", exception.getMessage());
    }

    @Test
    // Funzione che testa se la funzione checkInt restituisca Invalid number quando
    // gli viene passatto un oggetto che non si converte in integer
    public void testInvalidNumber() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> IntegerToRoman.checkInt(new Object()));
        assertEquals("Invalid number", exception.getMessage());
    }

    @ParameterizedTest
    @CsvSource({
            "0, Il numero deve essere compreso tra 1 e 1000",
            "-1, Il numero deve essere compreso tra 1 e 1000",
            "1001, Il numero deve essere compreso tra 1 e 1000"
    })
    // Funzione che testa se la funzione convert restituisca l'errore corretto
    // quando gli viene passato come parametro un numero fuori dal range
    public void testInvalidRange(int input, String expectedOutput) {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> IntegerToRoman.convert(input));
        assertEquals(expectedOutput, exception.getMessage());
    }

    @ParameterizedTest
    @CsvSource({
            "1, I",
            "2, II",
            "3, III",
            "4, IV",
            "5, V",
            "6, VI",
            "7, VII",
            "9, IX",
            "10, X",
            "15, XV",
            "19, XIX",
            "20, XX",
            "30, XXX",
            "40, XL",
            "50, L",
            "60, LX",
            "70, LXX",
            "80, LXXX",
            "90, XC",
            "100, C",
            "200, CC",
            "300, CCC",
            "399, CCCXCIX",
            "400, CD",
            "444, CDXLIV",
            "500, D",
            "600, DC",
            "700, DCC",
            "800, DCCC",
            "900, CM",
            "949, CMXLIX",
            "1000, M"

    })
    // Funzione che testa se la funzione convert restituisce la stringa del
    // corrispettivo numero romano
    public void testConvert(int input, String expectedOutput) {
        assertEquals(expectedOutput, IntegerToRoman.convert(input));
    }
}