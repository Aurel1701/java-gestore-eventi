package com.soprasteria;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r = new Scanner(System.in);
		System.out.println();
		String titolo;
		LocalDate data;
		int giorno;
		int mese;
		int anno;
		int posti;
		int postiNuovi;
		System.out.println("Inserisci il nome per l'evento :");
	    titolo= r.nextLine();
	    System.out.println("inserisci il giorno che vuoi programmare");
	    giorno = Integer.parseInt(r.nextLine());
	    System.out.println("inserisci il mese che vuoi programmare");
	    mese = Integer.parseInt(r.nextLine());
	    System.out.println("inserisci l'anno che vuoi programmare");
	    anno = r.nextInt();
	    r.nextLine();
	    data = LocalDate.of(anno, mese, giorno);
	    System.out.println("Inserisci quanti posti che ti servono:");
        posti = Integer.parseInt(r.nextLine());
        
        try {
        	Evento evento = new Evento(titolo, data, posti);
        	System.out.println("quanti posti vuoi prenotare");
            postiNuovi = r.nextInt();
            r.nextLine();
        	evento.prenota(postiNuovi);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("evento non valido");
			
		}
      
       

	}

}
