package Gatunki;

/*
 *  RozwiÒ program Gatunki , w ten sposÛb, øeby:
obiekt typu Gatunek mÛg≥ przechowywaÊ dane chromosomÛw. Powinna to byÊ
tablica obiektÛw typu Chromosom o d≥ugoúci odpowiadajπcej liczbie
chromosomÛw

UtwÛrz klasÍ Chromosom:
 w ten sposÛb aby dane dotyczπce numeru chromosomu i d≥ugoúci ramion by≥y
wprowadzane tylko wtedy, jeúli podane liczby sπ wiÍksze od 0 w przypadku numeru
chromosomu i wiÍksze lub rÛwne 0 w przypadku d≥ugoúci ramion
dodaj konstruktory:
przyjmujπcy jako argumenty numer chromosomu i d≥ugoúci ramion, pole plciowy ustawiajπcy
domyúlnie jako false
 przyjmujπcy jako argumenty wszystkie dane
kolejne gatunki by≥y przechowywane w tablicy obiektÛw typu Gatunek
 */

public class Chromosom {
	
	int numerChromosomu, dlugoscRamieniaChromosomu;
	boolean pluciowy;
	
	Chromosom(int nCh, int dCh){
		if(nCh > 0) {
			this.numerChromosomu = nCh;
		}
		
		if(dCh >= 0) {
			this.dlugoscRamieniaChromosomu = dCh;
		}
		this.pluciowy = false;
	}
	
	Chromosom(int nCh, int dCh, boolean pluciowy){
		if(nCh > 0) {
			this.numerChromosomu = nCh;
		}
		
		if(dCh >= 0) {
			this.dlugoscRamieniaChromosomu = dCh;
		}
		this.pluciowy = pluciowy;
	}

}
