/////////////////////////////////////////////
// ALDO BETTEGA 2101087
// PAOLO PREVEDELLO RAMIREZ 2111944
////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class IntegerToRomanTest {

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
            "50, L"
    })
    // Funzione che testa se la funzione convert restituisce la stringa del
    // corrispettivo numero romano
    public void testConvert(int input, String expectedOutput) {
        assertEquals(expectedOutput, IntegerToRoman.convert(input));
    }
}