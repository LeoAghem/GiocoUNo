//Deve avere un mazzo di carte, una pila di gioco e una lista di giocatori.

import java.util.ArrayList;

public class GiocoUno {
    //attributi
    private Mazzo mazzo;
    private ArrayList<Carta> listaScarti;
    private ArrayList<Giocatore> listaGiocatori;

    //getter e setter
    public Mazzo getMazzo() {
        return mazzo;
    }
    public void setMazzo(Mazzo mazzo) {
        this.mazzo = mazzo;
    }
    public ArrayList<Carta> getListaScarti() {
        return listaScarti;
    }
    public void setListaScarti(ArrayList<Carta> listaScarti) {
        this.listaScarti = listaScarti;
    }
    public ArrayList<Giocatore> getListaGiocatori() {
        return listaGiocatori;
    }
    public void setListaGiocatori(ArrayList<Giocatore> listaGiocatori) {
        this.listaGiocatori = listaGiocatori;
    }


}
