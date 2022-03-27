package azienda_sanitaria;

import java.util.Locale;
import java.util.Objects;

public class Medico {
    private String nome;

    public Medico(){}

    public Medico(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toLowerCase();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!(o instanceof Medico m)) return false;
        return this.getNome().equalsIgnoreCase(m.getNome());
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
