package org.generation.italy;

//...

class Film extends ElementoMultimediale {
 private String regista;
 private String attori;
 private int durata;

 public Film(String titolo, String regista, String attori, String genere, int durata, int nrCopie) {
     super();
     this.setTitolo(titolo);
     this.regista = regista;
     this.attori = attori;
     this.setGenere(genere);
     this.durata = durata;
     setNrCopie(nrCopie);
 }

 @Override
 public String dettagli() {
     return "Film: " + getTitolo() + "\nRegista: " + regista + "\nAttori: " + attori + "\nGenere: " + getGenere() + "\nDurata: " + durata + " min";
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



 