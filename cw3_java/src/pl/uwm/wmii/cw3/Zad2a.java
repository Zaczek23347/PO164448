package pl.uwm.wmii.cw3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zad2a {


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj ile liczb chesz wygenerowac");
        int n = input.nextInt();
        Random r = new Random();
        r.setSeed(123456);
        int tab[] = new int[n];

        generuj(tab,-999,999);
        System.out.println(Arrays.toString(tab));
        System.out.printf("Parzyste: %d %n", ileParzystych(tab));
        System.out.printf("Nieparzyste: %d %n", ileNieparzystych(tab));


    }
    public static void generuj (int tab[],int minWartosc,int maxWartosc)
    {
        Random r = new Random();
        r.setSeed(123456);

        for(int i = 0; i < tab.length; i++)
        {
            tab[i] = r.nextInt(maxWartosc-minWartosc+1)+minWartosc;
    }


    }
    public static int ileNieparzystych(int tab[])
    {
        int counter = 0;
        for(int i = 0; i < tab.length; i++)
        {
            if(tab[i]%2 != 0) counter++;
        }
        return counter;
    }
    public static int ileParzystych(int tab[])
    {
        int counter = 0;
        for(int i = 0; i < tab.length; i++)
        {
            if(tab[i]%2 == 0) counter++;
        }
        return counter;
    }
}