import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(ToBinary(x));
        

    }

    public static String ToBinary(int x) {

        String binary = "";
        int i = 0;
        int r = 0;

        while (x != 0) {
            r = x % 2;
            x = x / 2;
            binary = binary + r;
            i++;
            System.out.println(binary);
        }

        return Reverse(binary);
    }

    public static String Reverse(String ch) {
        String reverse = "";

        for (int i = 1; i <= ch.length(); i++) {

            reverse = reverse + ch.charAt(ch.length() - i);

        }

        return reverse;
    }

}
