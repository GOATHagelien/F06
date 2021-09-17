/*
import no.hvl.dat108.Person;

import java.util.Arrays;
import java.util.List;

interface Sammenligner<T> {
    int sammenlign(T a, T b);
}

class FornavnSammenligner implements Sammenligner<Person> {

    @Override
    public int sammenlign(Person a, Person b) {
        return a.fornavn.compareTo(b.fornavn);
    }
}

public class F06a {



    private static <T extends Comparable<T>>void sorter (List<T> liste) {
        private static <T extends Comparable<T>> void sorter(List<T> liste, Sammenligner<T> s){

            for (int i = 0; i < liste.size(); i++) {
                for (int j = 1; j < liste.size(); j++) {

                    T a = liste.get(j - 1);
                    T b = liste.get(j);

                    if (s.sammenlign(a, b) > 0) {
                        liste.set(j - 1, b);
                        liste.set(j, a);

                    }
                }
            }
        }
        }


        public static void main (String[]args){

            List<Integer> listeAvTall = Arrays.asList(4, 2, 7, 5, 9, 1);
            sorter(listeAvTall);
            System.out.println(listeAvTall);

            // Liste av strenger

            List<String> listeAvStrenger = Arrays.asList("Femi", "Brunsaus", "Kokkelering", "Pysjamasparty", "MinBrorBjørnen");
            sorter(listeAvStrenger);
            System.out.println(listeAvStrenger);

            List<Person> listeAvPersoner = Arrays.asList(
                    new Person("Knut", "Brunsaus"),
                    new Person("Kari", "Kokkelering"),
                    new Person("Sleivert", "Femi"));
            sorter(listeAvPersoner);
            System.out.println(listeAvPersoner);

            //Sortere på fornavn
            sorter(listeAvPersoner, new FornavnSammenligner());
            System.out.println(listeAvPersoner);

            // Sortere på fødselsår
  /*          sorter(listeAvPersoner, new Sammenligner<Person>){
                @Override
                        public int sammenlign(Person a, Person b) {
                    return a.fodselsaar - b.fodselsaar;
                }
            }


        }
    }
    */



