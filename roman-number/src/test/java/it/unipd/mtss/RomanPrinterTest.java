
/////////////////////////////////////////////
// ALDO BETTEGA 2101087
// PAOLO PREVEDELLO RAMIREZ 2111944
////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RomanPrinterTest {

    @ParameterizedTest
    @CsvSource({
            "1, ' _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|'",
            "2, ' _____  _____ \n|_   _||_   _|\n  | |    | |  \n  | |    | |  \n _| |_  _| |_ \n|_____||_____|'",
            "3, ' _____  _____  _____ \n|_   _||_   _||_   _|\n  | |    | |    | |  \n  | |    | |    | |  \n _| |_  _| |_  _| |_ \n|_____||_____||_____|'"
    })
    //Funzione che testa se la funzione print ritorna la stringa della corrispettiva ascii art del numero romano
    public void testPrint(int input, String expectedOutput) {
        assertEquals(expectedOutput, RomanPrinter.print(input));
    }
}