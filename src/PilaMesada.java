import java.util.LinkedList;
import java.util.List;

public class PilaMesada {
    List<Mesada> listaMesadas;

    public PilaMesada() {
        listaMesadas = new LinkedList<Mesada>();
    }

    public boolean apilarMesada(Mesada mesada) {
        boolean seApila = false;
        for (int i = 0; i < listaMesadas.size(); i++) {
            if (listaMesadas.get(i).compararMesadas(mesada)) {
                listaMesadas.set(i, mesada);
                return true;
            }
        }
        listaMesadas.add(mesada);
        return false;
    }

    public int contarElementosLista(){
        return this.listaMesadas.size();
    }
}
