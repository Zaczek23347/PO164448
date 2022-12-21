package pl.uwm.wmii.cw3;

import java.util.Scanner;
import java.util.Random;

public class Main {

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
        int even = 0;
        int odd = 0;
        for(int i = 0; i < tab.length; i++)
        {
            if(tab[i]%2 == 0) even++;
            else odd++;
        }
        System.out.printf("parzyste %d, nieparzyste %d",even,odd);



    }
}
