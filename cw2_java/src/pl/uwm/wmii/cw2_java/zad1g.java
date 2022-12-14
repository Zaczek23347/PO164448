package pl.uwm.wmii.cw2_java;

import java.util.Scanner;

public class zad1g {
    public static void main(String[] args)
    {
        System.out.println("(a)");
        System.out.println("Podaj ile licz chcesz wporwadzic: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double temp = 0;
        double temp2 = 1;
        for(int i = 1; i <= n; i++)
        {
            System.out.printf("podaj liczbe numer %d %n", i);
            double a = input.nextDouble();
            temp += a;
            temp2 *= a;
        }
        System.out.printf("wynik: %f oraz %f %n", temp, temp2);

    }
}
