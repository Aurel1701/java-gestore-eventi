package com.soprasteria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {
	private String titolo;
	private LocalDate data;
	private int postiTotali;
	private int postiPrenotati;
	
	public Evento(String titolo, LocalDate data, int postiTotali) {
		validPosti(postiTotali);
		validData(data);
		this.titolo = titolo;
		this.data = data;
		this.postiTotali = postiTotali;
		this.postiPrenotati = 0;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		validData(data);
		this.data = data;
	}

	public int getPostiTotali() {
		return postiTotali;
	}

	public int getPostiPrenotati() {
		return postiPrenotati;
	}
	// validazione data 
	
	private void validData(LocalDate data) throws IllegalArgumentException {
        if (data.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("La data non può passata");
        }
    }
	
	// validazione posti
	
	
	private void validPosti(int postiTotali) throws IllegalArgumentException {
        if (postiTotali < 1)
            throw new IllegalArgumentException("Ci deve essere almeno un posto");
    }
	
	public void prenota(int prenotati) throws Exception {
        if (LocalDate.now().isAfter(data)) {
            throw new Exception("Impossibile prenotare eventi già passati");
        } else if (postiTotali == postiPrenotati) {
            throw new Exception("L'evento è al completo");
        } else
           this.postiPrenotati = this.postiPrenotati + prenotati;
        
    }
	
    public void disdici() throws Exception {
        if (LocalDate.now().isAfter(data)) {
            throw new Exception("Impossibile disdire eventi già passati");
        } else if (postiPrenotati<1) {
            throw new Exception("Non ci sono prenotazioni per questo evento");
        }else
            postiPrenotati--;
    }

	@Override
	public String toString() {
		return "Evento [titolo=" + titolo + ", data=" + data + ", postiTotali=" + postiTotali + ", postiPrenotati="
				+ postiPrenotati + "]";
	}

   

	

	
}
