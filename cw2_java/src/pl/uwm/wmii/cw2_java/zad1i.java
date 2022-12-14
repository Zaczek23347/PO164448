package pl.uwm.wmii.cw2_java;

import java.util.Scanner;

public class zad1i {
    private static double silnia(double i)
    {
        if (i < 1)
            return 1;
        else
            return i * silnia(i - 1);
    }
    public static void main(String[] args)
    {
        System.out.println("(i)");
        System.out.println("Podaj ile licz chcesz wporwadzic: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double temp = 0;
        for(int i = 1; i <= n; i++)
        {
            System.out.printf("podaj liczbe numer %d %n", i);
            temp += (Math.pow(-1,i)*input.nextDouble())/(silnia(i));
        }
        System.out.printf("wynik: %f %n", temp);

    }
}
