public class Roman {
    public static String[] romanNumbers = new String[] {"0", "I", "II", "III", "IV",
            "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV",
            "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV",
            "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV",
            "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV",
            "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII",
            "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII",
            "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII",
            "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII",
            "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
    public static boolean isRoman(String value) {
        for (int i = 0; i < romanNumbers.length; i++) {
            if (value.equals(romanNumbers[i])) {
                return true;
            }
        }
        return false;
    }

    public static int fromRomanToArabian(String roman) {
        for (int i = 0; i <= romanNumbers.length; i++) {
            if (roman.equals(romanNumbers[i])) {
                return i;
            }
        }
        return -1;
    }

    public static String fromArabianToRoman(int arabian) {
        return romanNumbers[arabian];
    }
}
