package pao.exercise.lab1;

import java.util.Scanner;
import java.util.*;

public class Main {
    /* 1. Scrieti un program care sa afișeze toate numerele pare din intervalul [0,n],
          unde n este un numar citit de la tastatura. */
    public static void nrPare() {
        Scanner scan = new Scanner(System.in);
        System.out.print("n=");
        int n = scan.nextInt();
        scan.close();

        if(n<0)
        {
            System.out.println("Nu exista numere pare!");
            return;
        }

        System.out.println("Numerele sunt:");
        for (int i = 0; i <= n; i++)
            if (i % 2 == 0)
                System.out.println(i);
    }

    /* 2. Scrieți un program care sa compare doua numere a și b citite de la tastatura
          si sa afiseze numarul mai mare. */
    public static void maxim()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("a=");
        int a = scan.nextInt();
        System.out.print("b=");
        int b = scan.nextInt();

        scan.close();

        System.out.print("Maximul este: "  + Math.max(a,b));
    }

    /* 3. Scrieți o metoda care sa calculeze factorialul unui numar n citit de la tastatura.  */
    public static void factorial()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("n=");
        int n = scan.nextInt();
        int produs = 1;
        scan.close();

        if(n<0)
        {
            System.out.println("Nu se poate calcula factorial!");
            return ;
        }

        for(int i=2; i<=n; i++)
            produs *= i;

        System.out.print("Factorialul lui n este: " + produs);
    }

    /* 4. Fiind dat un numar n, scrieti o metoda care insumeaza toti multiplii de 3 si 5 pana la n (inclusiv).  */
    public static void multipli(int n)
    {
        int suma = 0;
        for(int i=1; i<=n; i++)
            if(i%3 == 0 || i%5 == 0)
                suma += i;

        System.out.println("Suma multiplilor este: " + suma);
    }

    /*5. Cititi de la tastatura n numere.
         Elementele citite vor fi organizate in doi vectori diferiti, in functie de paritate
         (de ex: elementele pare in vectorul x, iar cele impare in vectorul y).  */
    public static void numereSeparate()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("n=");
        int n = scan.nextInt();

        Vector<Integer> nrPare = new Vector<>();
        Vector<Integer> nrImpare = new Vector<>();
        int nr;

        for(int i=0; i<n; i++)
        {
            System.out.print("Numarul: ");
            nr = scan.nextInt();
            if(nr%2 == 0)
                nrPare.add(nr);
            else
                nrImpare.add(nr);
        }
        scan.close();

        System.out.print("Numerele pare: ");
        System.out.println(nrPare);

        System.out.print("Numerele impare: ");
        System.out.println(nrImpare);
    }

    /* 6. Cititi de la tastatura n note, numere intregi, intr-un vector.
          Cand cititi valoarea -1 de la tastatura, citirea notelor se opreste
          si programul afiseaza media acestora. */
    public static void medieNote()
    {
        Scanner scan = new Scanner(System.in);
        int n;
        Vector<Double> note = new Vector<>();
        double nota, medie, suma = 0;

        while(true)
        {
            System.out.print("Nota: ");
            nota = scan.nextDouble();
            if(nota == -1)
                break;
            else
                note.add(nota);
        }
        scan.close();

        n = note.size();
        for(int i=0; i<n; i++)
            suma += note.get(i);

        medie = suma/n;
        System.out.println("Media notelor este: " + medie);
    }

    /* 7. Sa se afiseze al n-lea termen din seria Fibonacci, unde n este citit de la tastatura. */
    public static void fibonacci()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("n=");
        int n = scan.nextInt();
        scan.close();

        int nr = 0;
        if(n == 0)
            nr = 0;
        else if(n == 1)
            nr = 1;
        else
        {
            int prev1 = 0, prev2 = 1;
            for(int i=2; i<=n ;i++)
            {
                nr = prev1 + prev2;
                prev1 = prev2;
                prev2 = nr;
            }
        }

        System.out.print("Al n-lea termen din sirul Fibonacci este: " + nr);
    }

    public static void main(String[] args) {
        // nrPare();
        // maxim();
        // factorial();
        // multipli(10);
        // numereSeparate();
        // medieNote();
        // fibonacci();
    }
}
