public class B extends C{
    private int quantita;

    public B(int quantita, String nome, String codice, Tossicita t){
        super(codice, nome, t);
        this.quantita = quantita;
    }
    @Override
    public int confronta(C c) {
        if (c instanceof B container)
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
        return "Botte{" +
                "quantita=" + quantita +
                ", codice: " + getCodice() + ", " +
                "nome: " + getNome() + "}";
    }
}
