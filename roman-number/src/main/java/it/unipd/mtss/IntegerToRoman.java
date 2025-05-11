/////////////////////////////////////////////
// ALDO BETTEGA 2101087
// PAOLO PREVEDELLO RAMIREZ 2111944
////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    // Funzione che converte da numero intero a stringa di numero romano
    public static String convert(int number) {
        String[] romanLetters = { "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] values = { 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
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