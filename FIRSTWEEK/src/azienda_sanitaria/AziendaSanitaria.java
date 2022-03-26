package azienda_sanitaria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AziendaSanitaria {
    private List<Paziente> pazienti;
    private List<Medico> medici;
    private Map<Paziente, Medico> riferimenti;

    public AziendaSanitaria(){
        pazienti = new ArrayList<>();
        medici = new ArrayList<>();
        riferimenti = new HashMap<>();
    }

    public void aggPaziente(Paziente p){
        boolean esito;
        if (!pazienti.contains(p))
            esito = pazienti.add(p);
        if (esito)
            aggRif()
    }

    private void aggRif(String nomeMedico, int index){

    }
}
