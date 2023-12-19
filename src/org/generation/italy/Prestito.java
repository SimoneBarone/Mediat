package org.generation.italy;

import java.time.LocalDate;

interface IMedia {
    void play();

    void stop();
}

class Prestito {
    static int prossimoId;
    private int id;
    private LocalDate dataInizio;
    private LocalDate dataFine;

    public Prestito() {
        this.id = prossimoId++;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(LocalDate dataInizio) {
        this.dataInizio = dataInizio;
    }

    public LocalDate getDataFine() {
        return dataFine;
    }

    public void setDataFine(LocalDate dataFine) {
        this.dataFine = dataFine;
    }
}
