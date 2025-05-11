/////////////////////////////////////////////
// ALDO BETTEGA 2101087
// PAOLO PREVEDELLO RAMIREZ 2111944
////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    // Funzione che genera la ascii art dato il numero intero
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    // Funzione che genera la ascii art data la stringa del numero romano
    private static String printAsciiArt(String romanNumber) {
        StringBuilder asciiArt = new StringBuilder();
        String[][] asciiLetters = {
                { " _____ ", "|_   _|", "  | |  ", "  | |  ", " _| |_ ", "|_____|" },
                { "__      __", "\\ \\    / /", " \\ \\  / / ", "  \\ \\/ /  ", "   \\  /   ", "    \\/    " },
                { "__   __", "\\ \\ / /", " \\ V / ", "  > <  ", " / . \\ ", "/_/ \\_\\" },
                { " _      ", "| |     ", "| |     ", "| |     ", "| |____ ", "|______|" },
                { "  _____ ", " / ____|", "| |     ", "| |     ", "| |____ ", " \\_____|" },
                { " _____  ", "|  __ \\ ", "| |  | |", "| |  | |", "| |__| |", "|_____/ " },
                { " __  __ ", "|  \\/  |", "| \\  / |", "| |\\/| |", "| |  | |", "|_|  |_|" }
        };
        String letters = "IVXLCDM";
        for (int row = 0; row < 6; row++) {
            for (char c : romanNumber.toCharArray()) {
                int index = letters.indexOf(c);
                asciiArt.append(asciiLetters[index][row]);
            }
            if (row < 5) {
                asciiArt.append("\n");
            }
        }
        return asciiArt.toString();
    }
}