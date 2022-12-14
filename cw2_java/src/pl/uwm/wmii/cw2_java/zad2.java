package pl.uwm.wmii.cw2_java;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args)
    {
        System.out.println("(zad2)");
        System.out.println("Podaj ile licz chcesz wporwadzic: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double tab[] = new double[n];
        for(int i=0;i<n;i++)
        {
            System.out.printf("Podaj liczbe numer %d%n",i+1);
            tab[i] = input.nextDouble();
        }
        for(int i = 1 ;i < n; i++)
        {
            System.out.printf("Liczba numer %d to %f%n",i+1,tab[i]);

        }
        System.out.printf("Liczba numer 1 to %f%n",tab[0]);




    }
}
