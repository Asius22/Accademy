package liquidi;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        C l = new L(10, "Lattina", "1234", Tossicita.BASSO);
        C b = new B(100, "Botte", "1234", Tossicita.ALTO);
        C l2 = new L(5, "Lattina2", "12345", Tossicita.MEDIO);
        C b2 = new B(90, "Botte2", "14", Tossicita.MEDIO);

        System.out.println("confronto tra l e l2: " + l.confronta(l2));
        System.out.println("confronto tra b e b2: " + b.confronta(b2));
        System.out.println("confronto tra lattina e botte (risultato sperato -1):" + l.confronta(b));

        System.out.println("\nconfronto tossicita: ");
        System.out.println("confronto tra botte e lattina (botte vince)" + b.confrontaTossicita(l));
        System.out.println("confronto tra  lattina e Botte(botte vince)" + l.confrontaTossicita(b));

        U utils = new U();
        List<C> lista = new ArrayList<>();
        lista.add(l);
        lista.add(l2);
        lista.add(b);
        lista.add(b2);

        List<C> lista2 = lista;
        System.out.println("Rimozione lattine: ");
        lista = utils.filtra(lista, l);
        for (C c: lista){
            System.out.println(c.toString());
        }

    }
}
