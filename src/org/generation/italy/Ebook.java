package org.generation.italy;

	 class Ebook extends ElementoMultimediale {
		
	    private String autore;
	    private String sinossi;
	    private String formato;
	    private int dimensioneKB;

	    public Ebook(String titolo, String autore, String sinossi, String genere, int nrCopie, String formato, int dimensioneKB) {
	        super();
	        this.setTitolo(titolo);
	        this.autore = autore;
	        this.setSinossi(sinossi);
	        this.setGenere(genere);
	        this.formato = formato;
	        this.dimensioneKB = dimensioneKB;
	        setNrCopie(nrCopie);
	    }

	    @Override
	    public String dettagli() {
	        return "Ebook: " + getTitolo() + "\nAutore: " + autore + "\nGenere: " + getGenere() + "\nFormato: " + formato + "\nDimensione: " + dimensioneKB + " KB";
	    }

		public String getSinossi() {
			return sinossi;
		}

		public void setSinossi(String sinossi) {
			this.sinossi = sinossi;
		}

		@Override
		public void play() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void stop() {
			// TODO Auto-generated method stub
			
		}
	}

