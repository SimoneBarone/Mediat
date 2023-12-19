package org.generation.italy;

import java.util.ArrayList;

class Mediateca {
    private static ArrayList<ElementoMultimediale> elementi;

    public Mediateca() {
        this.elementi = new ArrayList<>();
    }

    public void aggiungiElemento(ElementoMultimediale elemento) {
        elementi.add(elemento);
    }

    public static Iterable<ElementoMultimediale> elencoElementi() {
        return elementi;
    }

    public static Iterable<ElementoMultimediale> elencoElementi(String parolaChiave) {
        return elementi.stream()
                .filter(e -> e.dettagli().contains(parolaChiave))
                .toList();
    }


    public static ElementoMultimediale cercaElemento(int id) {
        return elementi.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

	public static ElementoMultimediale cercaElemento(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}           