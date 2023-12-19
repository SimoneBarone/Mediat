package org.generation.italy;

class LibroCartaceo extends Libro {
private int pagine;

public LibroCartaceo(String titolo, String autore, String sinossi, String genere, int nrCopie, int pagine) {
    super(titolo, autore, sinossi, genere, nrCopie);
    this.pagine = pagine;
}

@Override
public String dettagli() {
    return super.dettagli() + "\nPagine: " + pagine;
}
}

//...


