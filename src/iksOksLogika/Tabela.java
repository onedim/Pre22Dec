
package iksOksLogika;
/**Klasa Tabela
 * 
 * 
 *
 */
public class Tabela {
	private Polje[][] matrica;//dvostruki niz
	
	/**
	 * Konstruktor za Tabeli sapostavljenim velicinama 3x3
	 */
	public Tabela() {
		matrica = new Polje[3][3];//definirani niz od 3x3
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				matrica[i][j] = new Polje();
			}
		}
	}
	
	public int getVisinaMatrice() {
		return 3;
	}
	
	public int getSirinaMatrice() {
		return 3;
	}
	/**
	 * 
	 * @param aktivniIgrac
	 * @param i
	 * @param j
	 * @throws Exception
	 */
	public void setPolje(int aktivniIgrac, int i, int j) throws Exception {
		if (provjeriPolje(i, j)) {
			matrica[i][j].postaviPolje(aktivniIgrac);
		} else {
			throw new ArrayIndexOutOfBoundsException("Nisu dobri indeksi matrice (setPolje)!");
		}
	}
	/**
	 * vraca vrijednost matrice radi biljeske napravljenog poteza
	 * @param i
	 * @param j
	 * @return
	 */
	public Polje getPolje(int i, int j) {
		if (provjeriPolje(i, j)) {
			return matrica[i][j];
		}
		throw new ArrayIndexOutOfBoundsException("Nisu dobri indeksi matrice (getPolje)!");
	}
	/**
	 * funkcija koja provjerava velicinu varijabla i da li padaju
	 * izvan granica igraceg polja
	 * @param i
	 * @param j
	 * @return
	 */
	public boolean provjeriPolje(int i, int j) {
		return !((i < 0) || (i >= matrica.length) || (j < 0) || (j >= matrica[i].length));
	}
}
