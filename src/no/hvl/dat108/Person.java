package no.hvl.dat108;

public class Person implements Comparable<Person> {

    public String fornavn;
    public String etternavn;

    public Person(String fornavn, String etternavn) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
    }


    @Override
    public String toString() {
        return
                "" + fornavn +
                " " + etternavn + '\''
                ;
    }

    @Override
    public int compareTo(Person other) {
        return this.etternavn.compareTo(other.etternavn);
    }
}
