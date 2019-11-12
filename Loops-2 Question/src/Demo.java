//The loops-2 question in which we have to show series of a+b+2^i



import java.util.Scanner;
import java.lang.Math;

public class Demo {


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("q = ");

        int q = in.nextInt();
        for (int j = 0; j < q; j++) {
            System.out.print("a = ");
            int a = in.nextInt();
            System.out.print("b = ");
            int b = in.nextInt();
            System.out.print("n = ");
            int n = in.nextInt();

            int sum = a + b;
            System.out.print(sum);
            System.out.print(" ");
            for (int i = 1; i < n; i++) {
                sum = sum + b * ((int) Math.pow(2, i));
                System.out.print(sum + " ");
                //System.out.print(" ");
            }
            System.out.println();

        }
        in.close();
    }

}
