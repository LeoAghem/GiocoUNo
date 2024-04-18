public class Carta {
    
    // attributi
    private String color;
    private int valore;

    // getter e setter
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getValore() {
        return valore;
    }
    public void setValore(int valore) {
        this.valore = valore;
    }

    public String getCarta(){
        String carta=getValore() + " " + getColor();
        return carta;
    }

}
