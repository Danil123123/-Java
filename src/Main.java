// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;


public class Main {

    static String[] romanArr = new String[]{"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI",
            "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV",
            "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI",
            "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII",
            "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII",
            "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV",
            "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV",
            "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII",
            "XCVIII", "XCIX", "C"};


    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        String stroka = in.nextLine();
        System.out.println(calc(stroka));
    }
    public static int translateRim(String number){
        for (int i = 0; i < romanArr.length; i++) {
            if (number.equals(romanArr[i])) {
                return i;
            }
        }
        return -1;
    }
    public static boolean checkRim(String number) {
        for (String s : romanArr) {
            if (number.equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static String calc(String input) {
        boolean rim1;
        boolean rim2;

        int number1;
        int number2;
        int res;
        String result;


        String[] vse = input.split(" ");

        if (vse.length != 3) throw new IllegalArgumentException("Exception");

        rim1 = checkRim(vse[0]);
        rim2 = checkRim(vse[2]);

        if (rim1 != rim2) {
            throw new IllegalArgumentException("Exception");
        }

        if (rim1) {
            number1 = translateRim(vse[0]);
            number2 = translateRim(vse[2]);
            if (number1 > 10 & number2 > 10) throw new IllegalArgumentException("Exception");


            switch (vse[1]) {
                case "+" -> res = number1 + number2;
                case "-" -> res = number1 - number2;
                case "*" -> res = number1 * number2;
                case "/" -> res = number1 / number2;
                default -> throw new IllegalArgumentException("Exception");
            }


            if (res <= 0) throw new IllegalArgumentException("Exception");

            return (romanArr[res]);

        } else {

            number1 = Integer.parseInt(vse[0]);
            number2 = Integer.parseInt(vse[2]);
            if (number1 > 10 & number2 > 10) throw new IllegalArgumentException("Exception");

            switch (vse[1]) {
                case "+" -> res = number1 + number2;
                case "-" -> res = number1 - number2;
                case "*" -> res = number1 * number2;
                case "/" -> res = number1 / number2;
                default -> throw new IllegalArgumentException("Exception");

            }
            result = String.valueOf(res);
            return result;

        }
    }
}

