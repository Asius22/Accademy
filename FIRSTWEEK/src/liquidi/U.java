package liquidi;

import java.util.List;

public class U {
    public List<C> filtra(List<C> lista, C c){
        lista.removeIf(item -> c.confronta(item) > -1);
        return lista;
    }
}
