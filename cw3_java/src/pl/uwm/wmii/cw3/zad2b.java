package pl.uwm.wmii.cw3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class zad2b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj ile liczb chesz wygenerowac");
        int n = input.nextInt();
        Random r = new Random();
        r.setSeed(123456);
        int tab[] = new int[n];

        generuj(tab, -999, 999);
        System.out.println(Arrays.toString(tab));
        System.out.printf("Dodatnie: %d %n",ileDodatnich(tab));
        System.out.printf("Ujemne: %d %n",ileUjemnych(tab));
        System.out.printf("Zerowe: %d %n",ileZerowych(tab));

    }

    public static void generuj(int tab[], int minWartosc, int maxWartosc) {
        Random r = new Random();
        r.setSeed(123456);

        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
        }


    }
    public  static int ileDodatnich (int tab[])
    {
        int counter = 0;
        for(int i = 0;i<tab.length; i++)
        {
            if(tab[i] > 0) counter++;
        }
        return counter;
    }
    public  static int ileUjemnych (int tab[])
    {
        int counter = 0;
        for(int i = 0;i<tab.length; i++)
        {
            if(tab[i] < 0) counter++;
        }
        return counter;
    }
    public  static int ileZerowych (int tab[])
    {
        int counter = 0;
        for(int i = 0;i<tab.length; i++)
        {
            if(tab[i] == 0) counter++;
        }
        return counter;
    }

}
