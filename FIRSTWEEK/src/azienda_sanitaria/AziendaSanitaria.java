package azienda_sanitaria;

import java.util.*;

public class AziendaSanitaria {
    private List<Paziente> pazienti;
    private List<Medico> medici;
    private Map<Paziente, Medico> riferimenti;

    public AziendaSanitaria() {
        pazienti = new ArrayList<>();
        medici = new ArrayList<>();
        riferimenti = new HashMap<>();
    }

    public void aggPaziente(Paziente p) {
        if (!pazienti.contains(p)) {
            pazienti.add(p);
            aggRif(p.getNomeMedico().toLowerCase(), p);
        }
    }

    public List<Paziente> getPazienti() {
        return pazienti;
    }

    public void setPazienti(List<Paziente> pazienti) {
        for (Paziente p : pazienti)
            aggPaziente(p);
    }

    public List<Medico> getMedici() {
        return medici;
    }

    public void setMedici(List<Medico> medici) {
        this.medici = medici;
    }

    private void aggRif(String nomeMedico, Paziente paziente) {

        for (Medico m : medici)
            if (m.getNome().toLowerCase().equals(nomeMedico))
                riferimenti.put(paziente, m);
    }

    public ArrayList<Paziente> listaMedico(Medico m) {
        ArrayList<Paziente> lista = new ArrayList<>();

        for (Paziente p : pazienti) {
            if (riferimenti.get(p).equals(m))
                lista.add(p);
        }
        return lista;
    }

    public Medico statMedico() {
        Map<Medico, Integer> res = new HashMap<>();
        for (Map.Entry<Paziente, Medico> e : riferimenti.entrySet()) {
            Medico m = e.getValue();
            Integer getted = res.get(m);
            res.put(m,
                    (getted == null) ? 0 : getted + 1
            );

        }
        return getMaxMap(res);
    }

    private Medico getMaxMap(Map<Medico, Integer> map) {
        int max = 0;
        Medico m = null;
        for (Map.Entry<Medico, Integer> e : map.entrySet()) {
            int i = e.getValue();
            if (i > max) max = i;
            m = e.getKey();
        }

        return m;
    }
}
