package pl.uwm.wmii.cw2_2_java;

import java.util.Scanner;

public class zad1d {
    public static void main(String[] args)
    {
        System.out.println("(zad2)");
        System.out.println("Podaj ile licz chcesz wporwadzic: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double tab[] = new double[n];
        int temp = 0;
        for(int i=0;i<n;i++)
        {
            System.out.printf("Podaj liczbe numer %d%n",i+1);
            tab[i] = input.nextDouble();
        }
        for(int k = 1 ;k < n-1; k++)
        {
            if(tab[k] < (tab[k-1]+tab[k+1])/2)
            {
                temp += 1;
                System.out.println(k+1);
            }

        }
        System.out.printf("wynik: %d%n",temp);




    }
}
