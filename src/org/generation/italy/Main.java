package org.generation.italy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mediateca mediateca = new Mediateca();
        Scanner scanner = new Scanner(System.in);
        
        Libro libro = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", "Epica fantasy", "Fantasy", 3);
        Ebook ebook = new Ebook("Java: For Beginners", "Herbert Schildt", "Java programming guide", "Programming", 5, "PDF", 1024);
        Film film = new Film("Inception", "Christopher Nolan", "Leonardo DiCaprio, Joseph Gordon-Levitt", "Sci-Fi", 148, 2);
        Audiolibro audiolibro = new Audiolibro("The Hobbit", "J.R.R. Tolkien", "Fantasy adventure", "Fantasy", 1, "Morgan Freeman");
        LibroCartaceo libroCartaceo = new LibroCartaceo("1984", "George Orwell", "Dystopian fiction", "Fiction", 4, 328);

        mediateca.aggiungiElemento(libro);
        mediateca.aggiungiElemento(ebook);
        mediateca.aggiungiElemento(film);
        mediateca.aggiungiElemento(audiolibro);
        mediateca.aggiungiElemento(libroCartaceo);
        
        System.out.println("Benvenuto nella mediatica interattiva");
        while (true) {
            System.out.println("\nCosa vuoi fare?");
            System.out.println("1. Visualizza elenco elementi");
            System.out.println("2. Effettua prestito");
            System.out.println("3. Restituisci prestito");
            System.out.println("4. Esci");

            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    // Visualizza elenco elementi
                    System.out.println("\nElenco di tutti gli elementi nella mediateca:");
                    for (ElementoMultimediale elemento : mediateca.elencoElementi()) {
                        System.out.println(elemento.dettagli()+ "\n");
                    }
                    break;
                case 2:
                    // Effettua prestito
                    System.out.println("\nInserisci l'ID dell'elemento che vuoi prendere in prestito:");
                    int idPrestito = scanner.nextInt();
                    ElementoMultimediale elementoPrestito = mediateca.cercaElemento(idPrestito);

                    if (elementoPrestito != null) {
                        int idPrestitoEffettuato = elementoPrestito.effettuaPrestito("Utente");
                        if (idPrestitoEffettuato != -1) {
                            System.out.println("Prestito effettuato con successo. ID prestito: " + idPrestitoEffettuato);
                        } else {
                            System.out.println("Non è possibile effettuare il prestito. Copie esaurite.");
                        }
                    } else {
                        System.out.println("Elemento non trovato.");
                    }
                    break;
                case 3:
                    // Restituisci prestito
                    System.out.println("\nInserisci l'ID del prestito che vuoi restituire:");
                    int idRestituzione = scanner.nextInt();
                    ElementoMultimediale elementoRestituzione = mediateca.cercaElemento(idRestituzione);

                    if (elementoRestituzione != null) {
                        elementoRestituzione.restituisciPrestito(idRestituzione);
                        System.out.println("Prestito restituito con successo.");
                    } else {
                        System.out.println("Prestito non trovato.");
                    }
                    break;
                case 4:
                    // Esci
                    System.out.println("Grazie per aver utilizzato la mediateca. Arrivederci!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }
        }
    }
}

        
        
        
        /* Effettua un prestito di un libro
        int idPrestitoLibro = libro.effettuaPrestito("Utente1");
        if (idPrestitoLibro != -1) {
            System.out.println("Prestito effettuato per il libro. ID prestito: " + idPrestitoLibro);
        } else {
            System.out.println("Non è possibile effettuare il prestito per il libro.");
        }

         Effettua un prestito di un ebook
        int idPrestitoEbook = ebook.effettuaPrestito("Utente2");
        if (idPrestitoEbook != -1) {
            System.out.println("Prestito effettuato per l'ebook. ID prestito: " + idPrestitoEbook);
        } else {
            System.out.println("Non è possibile effettuare il prestito per l'ebook.");
        }

        // Restituisci il prestito del libro
        libro.restituisciPrestito(idPrestitoLibro);

        // Restituisci il prestito dell'ebook
        ebook.restituisciPrestito(idPrestitoEbook);

        // Visualizza dettagli libro
        System.out.println(libro.dettagli());

        // Visualizza dettagli ebook
        System.out.println(ebook.dettagli());

        // Elenca tutti gli elementi nella mediateca
        System.out.println("\nElenco di tutti gli elementi nella mediateca:");
        for (ElementoMultimediale elemento : mediateca.elencoElementi()) {
            System.out.println(elemento.dettagli());
        }

        // Elenca gli elementi che contengono "Java" nel titolo
        System.out.println("\nElenco di elementi con la parola chiave 'Java' nel titolo:");
        for (ElementoMultimediale elemento : mediateca.elencoElementi("Java")) {
            System.out.println(elemento.dettagli());
        }

        // Cerca un elemento per titolo
        ElementoMultimediale elementoCercato = mediateca.cercaElemento("Il Signore degli Anelli");
        if (elementoCercato != null) {
            System.out.println("\nElemento trovato: " + elementoCercato.dettagli());
        } else {
            System.out.println("\nElemento non trovato.");
        }

        // Cerca un elemento per ID
        elementoCercato = mediateca.cercaElemento(idPrestitoEbook);
        if (elementoCercato != null) {
            System.out.println("\nElemento trovato: " + elementoCercato.dettagli());
        } else {
            System.out.println("\nElemento non trovato.");
        }
    }
}*/

    