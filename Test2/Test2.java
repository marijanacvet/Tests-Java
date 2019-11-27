package test2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji od korisnika trazi da unese koliko na testu ima
		 * pitanja. Zatim, koristeci metodu, ucitava ime i prezime studenta, kao i da li
		 * je za svako pitanje odgovor koji je student dao tacan ili netacan.
		 * 
		 * Napraviti ( i na odgovarajucem mestu pozvati) metodu kojoj je povratna
		 * vrednost String i ispisati poruku koja daje informaciju o tome da li je
		 * student pao ili polozio ispit, kao i koliko ima tacnih odgovora. (Polozio je
		 * ako ima vise od 50%) Ukoliko student nije polozio, napisati koliko poena mu
		 * fali da bi ocena bila prelazna. Moguce je iskoristiti metodu iz prethodne
		 * tacke i dopuniti je.
		 * 
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj pitanja na testu: ");
		int n = sc.nextInt();// broj pitanja na testu
		if (n <= 0)
			System.out.println("Greska.");

		else {
			imePrezime();

			tacniOdgovori(n);

		}

	}

	public static String imePrezime() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite ime studenta: ");
		String ime = sc.nextLine();
		System.out.println("Unesite prezime: ");
		String prezime = sc.nextLine();
		String imePrezime = ime + " " + prezime;

		return imePrezime;
	}

	public static String tacniOdgovori(int n) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite da li je odgovor tacan: 1 -> za tacan je i 0 -> nije tacan ");
		int odgovor = 0;
		int brojac_tacni = 0;
		int brojac_netacni = 0;
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.println("Pitanje broj " + i);
			odgovor = sc.nextInt();
			if (odgovor == 1 || odgovor == 0) {

				if (odgovor == 1) {
					brojac_tacni += 1;
				}
				if (odgovor == 0) {
					brojac_netacni += 1;
				}

			}

			else {
				System.out.println("Greska.");
				break;
			}

		}
		String ispis = "";
		sum = brojac_tacni + brojac_netacni;
		if (sum != n)
			System.out.println("Nepravilan unos.");
		else {
			System.out.println("Tacni odgovori: " + brojac_tacni);
			System.out.println("Netacni odgovori: " + brojac_netacni);
			int razlika = brojac_netacni - brojac_tacni;
			double procenat = (brojac_tacni / sum) * 100;

			if (brojac_tacni > brojac_netacni) {
				ispis = "Student je polozio ispit sa ostvarenih " + procenat + "% poena.";

			}

			else {
				ispis = "Student je pao ispit. Ostvario je " + procenat + "% i fali mu jos " + (51 - procenat)
						+ "% za prolaz";
			}
			System.out.println(ispis);

		}

		return ispis;

	}

}
