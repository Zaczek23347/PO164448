package pl.uwm.wmii.cw2_2_java;

import java.util.Scanner;

public class zad1b {
    public static void main(String[] args)
    {
        System.out.println("(b)");
        System.out.println("Podaj ile licz chcesz wporwadzic: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int temp = 0;
        for(int i = 1; i <= n; i++)
        {
            System.out.printf("podaj liczbe numer %d %n", i);
            double d = input.nextDouble();
            if(d%3 == 0 && d%5 != 0)
                temp += 1;
        }
        System.out.printf("wynik: %d %n", temp);

    }
}
