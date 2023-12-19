package org.generation.italy;

class Audiolibro extends Libro {
	 private String voceNarrante;

public Audiolibro(String titolo, String autore, String sinossi, String genere, int nrCopie, String voceNarrante) {
    super(titolo, autore, sinossi, genere, nrCopie);
    this.voceNarrante = voceNarrante;
}

@Override
public String dettagli() {
    return super.dettagli() + "\nVoce Narrante: " + voceNarrante;
}
}

