package main;


// converting from Roman to Arabic:

public class Roman {
    private static int decodeSingle(String letter) {
        return switch (letter) {
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> 0;
        };
    }
    public static int decode(String roman) {
        int result = 0;
        String uRoman = roman.toUpperCase();
        for (int i = 0; i < uRoman.length() - 1; i++) {
            if (decodeSingle(String.valueOf(uRoman.charAt(i))) < decodeSingle(String.valueOf(uRoman.charAt(i + 1)))) {
                result -= decodeSingle(String.valueOf(uRoman.charAt(i)));
            } else {
                result += decodeSingle(String.valueOf(uRoman.charAt(i)));
            }
        }
        result += decodeSingle(String.valueOf(uRoman.charAt(uRoman.length() - 1)));
        return result;
    }

    // converting from Arabic to Roman:

    public static String intToRoman(int num) {
        String[] hundred = {"", "C"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I","II","III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return hundred[(num % 1000)/100] + tens[(num % 100)/10] + units[(num % 10)];
    }
}
