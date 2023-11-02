// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();
        HashMap<Integer, String> poisk = new HashMap<Integer, String>();

        map.put("O", "0 r");
        map.put("I", "1 r");
        map.put("II","2 r");
        map.put("III","3 r");
        map.put("IV","4 r");
        map.put("V","5 r");
        map.put("VI","6 r");
        map.put("VII","7 r");
        map.put("VIII","8 r");
        map.put("IX","9 r");
        map.put("X","10 r");

        map.put("0","0 a");
        map.put("1","1 a");
        map.put("2","2 a");
        map.put("3","3 a");
        map.put("4","4 a");
        map.put("5","5 a");
        map.put("6","6 a");
        map.put("7","7 a");
        map.put("8","8 a");
        map.put("9","9 a");
        map.put("10","10 a");

        poisk.put(0,"O");
        poisk.put(1,"I");
        poisk.put(2,"II");
        poisk.put(3,"III");
        poisk.put(4,"IV");
        poisk.put(5,"V");
        poisk.put(6,"VI");
        poisk.put(7,"VII");
        poisk.put(8,"VIII");
        poisk.put(9,"IX");
        poisk.put(10,"X");
        poisk.put(11,"XI");
        poisk.put(12,"XII");
        poisk.put(13,"XIII");
        poisk.put(14,"XIV");
        poisk.put(15,"XV");
        poisk.put(16,"XVI");
        poisk.put(17,"XVII");
        poisk.put(18,"XVIII");
        poisk.put(19,"XIX");
        poisk.put(20,"XX");

        String znak;
        int znak_1;
        int znak_2;
        int res = 0;

        Scanner in = new Scanner(System.in);
        String stroka = in.nextLine();
        String[] vse = stroka.split(" ");
        znak = vse[1];

        String[] number1 = map.get(vse[0]).split(" ");
        String[] number2 = map.get(vse[2]).split(" ");
        znak_1 = Integer.parseInt(number1[0]);
        znak_2 = Integer.parseInt(number2[0]);

        if ((znak_1 < 10 | znak_2 < 10) & ((number1[1].equals("r") & number2[1].equals("r")) | number1[1].equals("a") & number2[1].equals("a")) & vse.length == 3) {
            if (znak.equals("+")) {
                res = znak_1 + znak_2;
            } else if (znak.equals("/")) {
                res = znak_1 / znak_2;
            } else if (znak.equals("-")) {
                res = znak_1 - znak_2;
            } else if (znak.equals("*")) {
                res = znak_1 * znak_2;
            }

                // Press Shift+F9 to start debugging your code. We have set one breakpoint
                // for you, but you can always add more by pressing Ctrl+F8.
        } else {
            throw new IllegalArgumentException("Exception");

        }
        if (number1[1].equals("r")) {
            if (res < 0) {
                throw new IllegalArgumentException("Exception");
            } else {
                System.out.println(poisk.get(res));
            }
        } else System.out.println(res);
    }
}