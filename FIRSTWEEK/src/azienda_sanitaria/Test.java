package azienda_sanitaria;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Paziente> pazienti = new ArrayList<>();
        ArrayList<Medico> medici = new ArrayList<>();
        pazienti.add(new Paziente("ciro", 2));
        pazienti.add(new Paziente("vincenzo", 1));
        pazienti.add(new Paziente("CIRO", 3));
        medici.add(new Medico("ciro"));
        medici.add(new Medico("Vincenzo"));

        AziendaSanitaria azienda = new AziendaSanitaria();
        azienda.setMedici(medici);
        azienda.setPazienti(pazienti);
        System.out.println(azienda.listaMedico(medici.get(0)));
        System.out.println(azienda.statMedico());
    }

}

