public class L extends C{
    private int quantita;

    public L(int quantita, String nome, String codice, Tossicita tox){
        super(codice, nome, tox);
        this.quantita = quantita;
    }
    @Override
    public int confronta(C c) {
        if (c instanceof L container)
            return this.quantita - container.quantita;
        return -1;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    @Override
    public int confrontaTossicita(C obj) {
        return this.getTox().getValue() - obj.getTox().getValue();
    }

    @Override
    public String toString() {
        return "Lattina{" +
                "quantita=" + quantita +
                ", codice: " + getCodice() + ", " +
                "nome: " + getNome() + "}";
    }
}
