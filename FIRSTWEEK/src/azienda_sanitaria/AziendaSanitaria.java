package azienda_sanitaria;

import java.util.*;

public class AziendaSanitaria {
    private List<Paziente> pazienti;
    private List<Medico> medici;
    private final Map<Paziente, Medico> riferimenti;

    public AziendaSanitaria() {
        pazienti = new ArrayList<>();
        medici = new ArrayList<>();
        riferimenti = new HashMap<>();
    }

    /**
     *
     * @param p equivale al paziente da inserire
     */
    public void aggPaziente(Paziente p) {
        if (!pazienti.contains(p)) {
            pazienti.add(p);
            aggRif(p.getNomeMedico(), pazienti.indexOf(p));
        }
    }

    public List<Paziente> getPazienti() {
        return pazienti;
    }

    /**
     * per ogni paziente nella lista ricevuta chiama il metodo aggPazienti per avere i riferimenti sempre chiari
     * @param pazienti
     */
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

    /**
     * metood di servizio. crea le tuple di riferimento tra arraylist medici e pazienti
     * @param nomeMedico
     * @param indexPaziente
     */
    private void aggRif(String nomeMedico, int indexPaziente) {
        Medico tmp = new Medico(nomeMedico);
        if (!medici.contains(tmp))
            medici.add(tmp);
        int index = medici.indexOf(tmp);
        riferimenti.put(pazienti.get(indexPaziente), medici.get(index));

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
            Integer getted = res.get(m); //se restituisce null non è ancira stato trovato
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
