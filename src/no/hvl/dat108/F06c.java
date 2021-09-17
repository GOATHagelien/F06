package no.hvl.dat108;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Betingelse {
    boolean erOppfylt(int x);
}

public class F06c {

    public static List<Integer> filtrer(List<Integer> liste, Betingelse betingelse) {

        List<Integer> resultat = new ArrayList<>();

        for (int tall : liste) {
            if (betingelse.erOppfylt(tall) ) {
                resultat.add(tall);
            }
        }
        return resultat;
    }

    public static void main(String[] args) {

        List<Integer> listen = List.of(-4, 9, 2, 7, 6, 0);
        List<Integer> resultat;

        //Alle partall
        resultat = filtrer(listen, (x) -> x % 2 == 0);
        System.out.println(resultat);


        //Metode for tall større enn...
        resultat = filtrer(listen, storreEnn(7));
        System.out.println(resultat);

    }
    public static Betingelse storreEnn(int grense) {
        return x -> x > grense;
    }
}
