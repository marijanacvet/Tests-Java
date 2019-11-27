package test1;

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		/*
		 * Traziti od korisnika da unese pozitivan broj N. Zatim ucitavati N brojeva sa
		 * standardnog ulaza i ispisati vrednost najmanjeg unetog broja.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj ucitavanja: ");
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Morate uneti pozitivan broj koji je veci od nule.");
		} else {
			System.out.println("Unesite broj 1: ");
			int a = sc.nextInt();
			int min = a;

			for (int i = 2; i <= n; i++) {
				System.out.println("Unesite broj " + i + ": ");
				a = sc.nextInt();
				if (a < min)
					min = a;
			}

			if (n >= 0)
				System.out.println("Minimalna vrednost od svih unetih brojeva je: " + min);

		}

	}

}
