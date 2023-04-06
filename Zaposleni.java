package Naloga7;

public class Zaposleni {
    private String ime;
    private int placa;

    public Zaposleni(String ime, int placa){
        this.ime = ime;
        this.placa = placa;
    }

    public String vrniIme(){
        return ime;
    }

    public int vrniPlaco(){
        return placa;
    }

    
}
