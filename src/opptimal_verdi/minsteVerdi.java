package opptimal_verdi;

import com.sun.tools.javac.Main;

import java.util.Arrays;

public class minsteVerdi {
    public static int min(int[] a)  // a er en heltallstabell
    {
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int m = 0;  // indeks til minste verdi

        for (int i = 1; i < a.length; i++) // obs: starter med i = 1
        {
            if (a[i] < a[m]) m = i;  // indeksen oppdateres
        }

        return m;  // returnerer indeksen/posisjonen til minste verdi

    } // min

    public static int stor(int[] a){
        if (a.length<1)
            throw new java.util.NoSuchElementException("tabellen a er tom");
        int m = 0;

        for(int i=1; i<a.length; i++){
            if (a[i]>a[m]){
                m=i;
            }
        }
        return m;
    }
    public static int maks(int[] a)  // a er en heltallstabell
    {
        if (a.length < 1)
            throw new java.util.NoSuchElementException("a er tom");

        int m = a.length - 1;  // indeks til største verdi

        for (int i = a.length - 2; i >= 0; i--) // starter nest bakerst
        {
            if (a[i] > a[m]) m = i;  // indeksen oppdateres
        }

        return m;  // returnerer indeksen/posisjonen til største verdi

    } // maks
    public static int maks2(int[] a)   // versjon 2 av maks-metoden
    {
        int m = 0;               // indeks til største verdi
        int maksverdi = a[0];    // største verdi

        for (int i = 1; i < a.length; i++) if (a[i] > maksverdi)
        {
            maksverdi = a[i];     // største verdi oppdateres
            m = i;                // indeks til største verdi oppdateres
        }
        return m;   // returnerer indeks/posisjonen til største verdi

    } // maks


    public static void main(String[] args) {
        int[] array = {1,3,4,5,7,5,7};
        int b= min(array);
        

        System.out.println(b);
        System.out.println(stor(array));
        System.out.println(maks(array));
        System.out.println(maks2(array));
    }
}
