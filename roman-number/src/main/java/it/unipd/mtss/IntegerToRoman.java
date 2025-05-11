/////////////////////////////////////////////
// ALDO BETTEGA 2101087
// PAOLO PREVEDELLO RAMIREZ 2111944
////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    // Funzione che controlla se il input è del tipo Integer
    public static int checkInt(Object input) {
        if (input == null) {
            throw new IllegalArgumentException("Null input");
        }
        try {
            int number = Integer.parseInt(input.toString());
            return number;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number");
        }
    }

    // Funzione che converte da numero intero a stringa di numero romano
    public static String convert(Object input) {
        int number = checkInt(input);
        if (number < 1 || number > 1000) {
            throw new IllegalArgumentException("Il numero deve essere compreso tra 1 e 1000");
        }
        String[] romanLetters = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        StringBuilder romanNumber = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                romanNumber.append(romanLetters[i]);
            }
        }
        return romanNumber.toString();
    }
}