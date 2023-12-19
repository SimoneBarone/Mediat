package org.generation.italy;

import java.time.LocalDate;
import java.util.ArrayList;

abstract class ElementoMultimediale implements IMedia {
    static int prossimoId;
    private int id;
    private String titolo;
    private String genere;
    private static int nrCopie;
    private static ArrayList<Prestito> elencoPrestiti;

    public ElementoMultimediale() {
        this.id = prossimoId++;
        this.elencoPrestiti = new ArrayList<>();
    }

    public static int effettuaPrestito(String utente) {
        if (nrCopie > 0) {
            Prestito prestito = new Prestito();
            prestito.setDataInizio(LocalDate.now());
            elencoPrestiti.add(prestito);
            nrCopie--;
            return prestito.getId();
        } else {
            System.out.println("Non è possibile effettuare il prestito. Copie esaurite.");
            return -1;
        }
    }

    public void restituisciPrestito(int idPrestito) {
        Prestito prestito = elencoPrestiti.stream()
                .filter(p -> p.getId() == idPrestito)
                .findFirst()
                .orElse(null);

        if (prestito != null) {
            prestito.setDataFine(LocalDate.now());
            elencoPrestiti.remove(prestito);
            nrCopie++;
        } else {
            System.out.println("ID prestito non valido.");
        }
    }

    public int getNrCopie() {
        return nrCopie;
    }

    public void setNrCopie(int nrCopie) {
        this.nrCopie = nrCopie;
    }

    public int getId() {
        return id;
    }

    public abstract String dettagli();

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
}
