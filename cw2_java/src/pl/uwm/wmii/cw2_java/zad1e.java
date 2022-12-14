package pl.uwm.wmii.cw2_java;

import java.util.Scanner;

public class zad1e {
    public static void main(String[] args)
    {
        System.out.println("(e)");
        System.out.println("Podaj ile licz chcesz wporwadzic: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double temp = 1;
        double temp2 = 1;
        for(int i = 1; i <= n; i++)
        {
            System.out.printf("podaj liczbe numer %d %n", i);
            temp2 = input.nextDouble();
            if (temp2 < 0)
            {
                temp2 = temp2*(-1);
            }
            temp *= temp2;
        }
        System.out.printf("wynik: %f %n", temp);

    }
}
