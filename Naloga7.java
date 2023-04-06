package Naloga7;

public class Naloga7 {

    public static void main (String[]args){
        
        Zaposleni timi = new Zaposleni("Timi", 12000);
        Zaposleni Rok = new Zaposleni("Rok", 300);
        Zaposleni Matej = new Zaposleni("Matej", 5000);

        Organizacija test = new Organizacija();

        System.out.println(timi.vrniIme());
        System.out.println(Rok.vrniPlaco());
        System.out.println(test.skupajPlace());

        test.odstraniZaposlenega(Rok);

        System.out.println(test.izpisiZaposlene());
    }
}
