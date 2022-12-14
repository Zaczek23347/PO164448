package pl.uwm.wmii.cw2_java;

import java.util.Scanner;

public class zad1c {
    public static void main(String[] args)
    {
        System.out.println("(c)");
        System.out.println("Podaj ile licz chcesz wporwadzic: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double temp = 0;
        double temp2 = 0;
        for(int i = 1; i <= n; i++)
        {
            System.out.printf("podaj liczbe numer %d %n", i);
            temp2 = input.nextDouble();
            if (temp2 < 0)
            {
                temp2 = temp2*(-1);
            }
            temp += temp2;
        }
        System.out.printf("wynik: %f %n", temp);

    }
}
