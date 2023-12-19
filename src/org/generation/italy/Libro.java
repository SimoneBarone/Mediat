package org.generation.italy;

class Libro extends ElementoMultimediale {
    private String autore;
    private String sinossi;

    public Libro(String titolo, String autore, String sinossi, String genere, int nrCopie) {
        super();
        this.setTitolo(titolo);
        this.autore = autore;
        this.setSinossi(sinossi);
        this.setGenere(genere);
        setNrCopie(nrCopie);
    }

    @Override
    public String dettagli() {
        return "Libro: " + getTitolo() + "\nAutore: " + autore + "\nGenere: " + getGenere();
    }

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	public String getSinossi() {
		return sinossi;
	}

	public void setSinossi(String sinossi) {
		this.sinossi = sinossi;
	}
}
 