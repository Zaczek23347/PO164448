package pl.uwm.wmii.cw3;

import java.util.Random;
import java.util.Scanner;

public class zad1c {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj ile liczb chesz wygenerowac");
        int n = input.nextInt();
        Random r = new Random();
        r.setSeed(123456);
        int tab[] = new int[n];

        for(int i = 0; i < tab.length; i++)
        {
            tab[i] = r.nextInt(1999)-999;
        }

        for(int i = 0; i < tab.length; i++)
        {
            System.out.printf("element %d liczba %d%n",i,tab[i]);
        }
        int max = tab[0];
        int counter = 1;
        for(int i = 0; i < tab.length; i++)
        {
            if(tab[i] > max)
            {
                max = tab[i];
                counter = 1;

            } else if (tab[i] == max)
            {
                counter++;
            }
        }
        System.out.printf("max %d, wystapienia %d",max,counter);



    }
}
