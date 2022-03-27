package azienda_sanitaria;

import java.util.Objects;

public class Paziente {
    private String nomeMedico;
    private int nTesera;

    public Paziente(String nomeMedico, int nTesera) {
        this.nomeMedico = nomeMedico;
        this.nTesera = nTesera;
    }

    public Paziente() {
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public int getnTesera() {
        return nTesera;
    }

    public void setnTesera(int nTesera) {
        this.nTesera = nTesera;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "{" +
                "nomeMedico='" + nomeMedico + '\'' +
                ", nTesera=" + nTesera +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!(o instanceof Paziente p)) return false;
        return getnTesera() == p.getnTesera() &&
                getNomeMedico().equalsIgnoreCase(p.getNomeMedico());
    }

}
