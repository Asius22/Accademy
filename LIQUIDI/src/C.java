/**
 * Si vogliono mantenere le informazioni su un deposito di contenitori di liquidi.
 * Ogni contenitore (C) è dotato di un codice univoco; i contenitori possono essere di due tipi:
 * lattine (L) e bidoni (B) entrambe queste categorie sono dotate di un campo nome per identificare il
 * liquido contenuto e di un campo qta per dichiarare la quantità contenuta.
 * E' richiesta la presenza di una interfaccia CMP che contenga un metodo confronta() in grado di effettuare
 * un confronto di peso fra due contenitori omolo
 * (L o B) considerando che i bidoni hanno sempre una quantità di liquido stoccato maggiore delle lattine.
 * Realizzare poi una classe U (utils) contenente un metodo C[] filtra(C[] T, C c) che riceve in ingresso un vettore T
 * di contenitori ed un contenitore campione.
 * Il metodo filtra deve restituire il vettore T ripulito di tutti i contenitori che contengono lo stesso liquido
 * del contenitore campione (C c) passato come parametro
 *
 * Deve essere inoltre creato un attributo enumerazione per stabilire il livello di tossicità di L e B
 * ed u interfaccia con un metodo che permetta di verificare chi dei due ha un liquido più tossico.
 * L interfaccia potrebbe estenderne un'altra.
 */
public abstract class C implements CmpToxicity<C>{
    private String codice, nome;
    private Tossicita tox;
    public C(String codice, String nome, Tossicita tox){
        this.codice = codice;
        this.nome = nome;
        this.tox = tox;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tossicita getTox() {
        return tox;
    }

    public void setTox(Tossicita tox) {
        this.tox = tox;
    }
}
