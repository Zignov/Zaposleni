package Naloga7;



public class Organizacija {
    private Zaposleni [] zaposleni;
    private int steviloZaposlenih;


    public void dodajZaposlenega(Zaposleni zaposleni){

        Zaposleni[] noviZaposleni = new Zaposleni[steviloZaposlenih++];

        for(int i = 0; i<steviloZaposlenih; i++){
            noviZaposleni[i] = this.zaposleni[i];
        }

        noviZaposleni[steviloZaposlenih] = zaposleni;
        this.zaposleni = noviZaposleni;
        steviloZaposlenih++;
    }

    public void odstraniZaposlenega(Zaposleni zaposleni){
        int stevec = -1;

        for (int i = 0; i<steviloZaposlenih;i++){
            if (this.zaposleni[i].equals(zaposleni)){
                stevec = i;
            }
        }

        if(stevec!=-1){
            Zaposleni[] noviZaposleni = new Zaposleni[steviloZaposlenih--];
            
            for(int i = 0; i<steviloZaposlenih; i++){
                if (i!=stevec){
                    this.zaposleni[i] = noviZaposleni[i];
                }
            }

            this.zaposleni = noviZaposleni;
            steviloZaposlenih--;
        }


    }

    public int skupajPlace(){
        int skupaj = 0;
        for (int i = 0; i<steviloZaposlenih; i++){
            skupaj += this.zaposleni[i].vrniPlaco();
        }

        return skupaj;
    }


    public String izpisiZaposlene(){
        String seznam = "";

        for (int i = 0; i<steviloZaposlenih; i++){
            seznam.concat(this.zaposleni[i].vrniIme()+" - "+ this.zaposleni[i].vrniPlaco());
        }

        return seznam;
    }
}
