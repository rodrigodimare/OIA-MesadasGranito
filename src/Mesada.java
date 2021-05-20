public class Mesada {
    private int ancho;
    private int largo;

    public Mesada(int ancho, int largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    public boolean compararMesadas(Mesada mesadaSuperior) {
        if ((this.ancho >= mesadaSuperior.ancho && this.largo >= mesadaSuperior.largo) || (ancho >= mesadaSuperior.largo && largo >= mesadaSuperior.ancho)) {
            return true;
        }
        return false;
    }
}
