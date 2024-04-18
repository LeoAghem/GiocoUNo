import java.util.ArrayList;

public class Giocatore {
    //attributi
    private String nomeGiocatore;
    private ArrayList<Carta> listaCarte;

    //getter e setter
    public String getNomeGiocatore() {
        return nomeGiocatore;
    }
    public void setNomeGiocatore(String nomeGiocatore) {
        this.nomeGiocatore = nomeGiocatore;
    }
    public ArrayList<Carta> getListaCarte() {
        return listaCarte;
    }
    public void setListaCarte(ArrayList<Carta> listaCarte) {
        this.listaCarte = listaCarte;
    }

    
}
