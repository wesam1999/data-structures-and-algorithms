package roman_number_Transfare;

public class RomanNumeral {

    private final int num;



    private static int[]    numbers = { 1000,  900,  500,  400,  100,   90,
            50,   40,   10,    9,    5,    4,    1 };

    private static String[] letters = { "M",  "CM",  "D",  "CD", "C",  "XC",
            "L",  "XL",  "X",  "IX", "V",  "IV", "I" };

// for eedge case
    public RomanNumeral(int arabic) {
        if (arabic < 1)
            throw new NumberFormatException("Value of RomanNumeral must be positive.");
        if (arabic > 5000)
            throw new NumberFormatException("Value of RomanNumeral must be 5000" +
                    " or less.");
        num = arabic;
    }


    public String toString() {
        String roman = "";
        int N = num;
        for (int i = 0; i < numbers.length; i++) {
            while (N >= numbers[i]) {
                roman += letters[i];
                N -= numbers[i];
            }
        }
        return roman;
    }



    public int toInt() {
        return num;
    }




}
