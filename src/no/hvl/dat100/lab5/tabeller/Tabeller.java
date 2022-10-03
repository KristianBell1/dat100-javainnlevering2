package no.hvl.dat100.lab5.tabeller;

import static javax.swing.JOptionPane.*;

import java.util.Arrays;

import static java.lang.Integer.*;

public class Tabeller {
	public static void main(String[] args) {

		int[] tabell = { 1, 3, 5, 9 };
		int[] andreTall = { 42, 67, 89 };
	/*	tilStreng(andreTall);
		summer(andreTall);
		settSammen(tabell,andreTall);
		skrivUt(tabell);
		finnesTall(tabell,3);
		reverser(tabell);
		settSammen(tabell,andreTall);*/
		
		posisjonTall(tabell, 3);
	}

	// a)
	public static void skrivUt(int[] tabell) {

		for (int nummer : tabell) {
			System.out.println(nummer);
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String txt = "[";
		for (int i = 0; i < tabell.length; i++) {
			
			txt += Integer.toString(tabell[i]);
			if (i < (tabell.length - 1)) {
				txt += ",";
			}

		}
		txt += "]";
		System.out.println(txt);

		return txt;

	}

	// c)
	public static int summer(int[] tabell) {
		
		int sum = 0;
		
		for (int i = 0; i <tabell.length; i++) {
			sum += tabell[i];
			
		}
		System.out.println(sum);

		return sum;

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean finnes = false;
		int i = 0;
		while (i < tabell.length && !finnes) {
			if ( tabell[i] == tall) {
				finnes = true;
				
			}
			i++;
		} 
		System.out.println(finnes);
		return finnes;
		
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		

		for (int i = 0; i < tabell.length; i++) {
			System.out.println("" +  i + " " + tall + " "  + tabell[i]);
			if (tall == tabell[i]) {
				return i;
			}
		} 
		return -1;
		
		
		

		// TODO
		//throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		int [] nyTabell = new int [tabell.length];
		int x = tabell.length;
		for (int i = 0; i < tabell.length; i++) {
			
			nyTabell [x-1] = tabell[i];
			
			x--;
			
		}
		return  nyTabell;

	}

	// g)
	public static boolean erSortert(int[] tabell) {
		
		int j = 0;
		boolean sortert = true;
		while (sortert && j  < tabell.length - 1) {
			if (tabell[j] > tabell[j+1]) {
				sortert = false;
			}
			j++;
		} return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		int nyLengde = tabell1.length + tabell2.length;
		int [] nyTabell = new int [nyLengde];
		for ( int i=0; i < tabell1.length; i++) {
			nyTabell [i] = tabell1[i];
		}
		for ( int j=0; j < tabell2.length; j++) {
			nyTabell[tabell1.length + j] = tabell2[j];
		}
			for (int nummer : nyTabell) {
				System.out.println(nummer);
			}
		return nyTabell;
		
		
	}
}
