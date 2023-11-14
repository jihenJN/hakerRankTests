import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String EOF = "bye";
        boolean flag = false;
        int n = 0;
        while (flag != true) {

            String line = input.nextLine();

            n++;

            if (line.compareTo(EOF) == 0) {
                flag = true;
            }

           
        }


          

    }
}
