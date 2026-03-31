public class Main {
    public static void main(String[] args) {
        ProduktMenu p1 = new ProduktMenu("K-01", "Espresso", 9.0, "kawa");
        ProduktMenu p2 = new ProduktMenu("K-02", "Cappuccino", 13.5, "kawa");
        ProduktMenu p3 = new ProduktMenu("D-01", "Sernik", 16.0, "deser");

        KlientKawiarni k1 = new KlientKawiarni(100, "Julia", "Mazur", "j.mazur@mail.pl");

        Zamowienie zamowienie = new Zamowienie(k1);
        zamowienie.dodajProdukt(p1);
        zamowienie.dodajProdukt(p2);

        System.out.println(zamowienie);
        System.out.println("Łączna wartość: " + zamowienie.policzWartosc());
        System.out.println("Liczba pozycji: " + zamowienie.policzLiczbeProduktow());
        System.out.println("Liczba produktów utworzonych w systemie: " + ProduktMenu.getLiczbaProduktow());
        System.out.println("Liczba klientów: " + KlientKawiarni.getLiczbaKlientow());

        System.out.println(p1);
        System.out.println(k1);

        System.out.println("Porównanie produktów:");
        System.out.println(p1.equals(new ProduktMenu("K-01", "Inna kawa", 10.0, "kawa")));

        zamowienie.oznaczJakoOplacone();
        System.out.println(zamowienie);
    }
}