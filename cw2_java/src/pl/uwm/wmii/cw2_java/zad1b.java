package pl.uwm.wmii.cw2_java;

import java.util.Scanner;

public class zad1b {

    public static void main(String[] args)
    {
        System.out.println("(b)");
        System.out.println("Podaj ile licz chcesz wporwadzic: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double temp = 1;
        for(int i = 1; i <= n; i++)
        {
            System.out.printf("podaj liczbe numer %d %n", i);
            temp *= input.nextDouble();
        }
        System.out.printf("wynik: %f %n", temp);

    }
}
