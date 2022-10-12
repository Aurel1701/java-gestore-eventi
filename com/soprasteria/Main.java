package com.soprasteria;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r = new Scanner(System.in);
		System.out.println();
		String titolo;
		String data;
		int posti;
		System.out.println("Inserisci il nome per l'evento :");
	    titolo= r.nextLine();
	    System.out.println("inserisci il giorno che vuoi programmare");
	    System.out.println("inserisci il mese che vuoi programmare");
	    System.out.println("inserisci l'anno che vuoi programmare");
	    data = r.next();
	    System.out.println("Inserisci quanti posti che ti servono:");
        posti = Integer.parseInt(r.nextLine());

	}

}
