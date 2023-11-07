import java.util.Scanner;

public class App {

    public static String ch = "";

    public static void main(String[] args) throws Exception {
        int q, a, b, n;
        a = 0;
        b = 0;
        n = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("enter query q");
        q = input.nextInt();

        for (int i = 0; i < q; i++) {

            a = input.nextInt();
            b = input.nextInt();
            n = input.nextInt();
            ch = SumSeq(a, b, n) + "\n";
        }

        System.out.printf(ch);
        input.close();
    }

    public static String SumSeq(int a, int b, int n) {
        int s = a;
        for (int i = 0; i < n; i++) {

            s = (b * (int) Math.pow(2, i)) + s;

            ch = ch + " " + s;

        }
        return ch;
    }
}
