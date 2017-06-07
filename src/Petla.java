
public class Petla {

	void odlicz(int liczba) {
	
		while (liczba >= 0) {
			System.out.print(liczba + "\t");
			liczba--;
		}
	}
	

	void print(int ileRazy, char znak) {
		int counter = 0;
		
		while(counter < ileRazy) {
			System.out.println(znak);
//			counter = counter + 1;
//			counter += 1;
			counter++;
		}
		
		System.out.println(counter);	//mozna, bo counter stworzone wczesniej (przed petla)
	}
	
//	to samo tylko for
	void printFor() {
		
		for(int counter = 0; counter < 5; counter++) {
			System.out.println("a");
		}
		
//		System.out.println(counter); // nie mozna, bo poza petla (a counter stworzone w petli)
	}
	
	//stworz funkcje, ktora dodaje liczby od 1 do n
	//np. sum(4) ma zwrocic 10 (bo 1+2+3+4=10)
	
	int sum(int maxLiczba) {
		int wynik = 0;
		int aktualnaLiczba = 1;
		while(aktualnaLiczba <= maxLiczba) { 
			wynik = wynik + aktualnaLiczba;
			aktualnaLiczba++;
		}
		return wynik;
	}
	
//	### ZADANIE ###
//	1) stworz funkcje, ktora dodaje liczby od a do b
//	np. sum(4, 6) ma zwrocic 15 (bo 4+5+6=15)   // uzyj petli for
//	
//	2) stworz funkcje, ktora dodaje liczby od a do b, ale jeśli liczba jest podzielna przez 4 to jej nie dodaje
//	np. sum(3, 6) ma zwrocic 14 (bo 3+5+6=14)  - 4 omijamy!
//	
//	3) stworz funkcje, ktora zwróci napis złożony z liczb 
//		-20 -15 -10 -5 0 3 6 9 12 15 18
//	(znajdź pattern) (tip: 2 x petla for)
}


