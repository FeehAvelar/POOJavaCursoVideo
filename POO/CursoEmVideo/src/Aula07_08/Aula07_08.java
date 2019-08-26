package Aula07_08;

public class Aula07_08 {

	public static void main(String[] args) {
		Lutador lutadores[] = new Lutador[6];
		lutadores[0] = new Lutador("Pretty Boy","Franca",31,1.75f,68.9f,11,2,1);
		
		lutadores[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14,3,3);
		
		lutadores[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
		
		lutadores[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
				
		lutadores[4] = new Lutador("UF0Cobol", "Brasil", 37, 1.70f, 119.3f, 5,4,3);
		
		lutadores[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
		
		Luta Amistoso = new Luta();
		Amistoso.marcarLuta(lutadores[1], lutadores[4]); 
		
		Luta UEF[] = new Luta[3];
		UEF[0] = new Luta();
		UEF[0].marcarLuta(lutadores[0], lutadores[1]);
		UEF[0].Lutar();
		
		UEF[1] = new Luta();
		UEF[1].marcarLuta(lutadores[2], lutadores[3]);
		UEF[1].Lutar();
		
		UEF[2] = new Luta();
		UEF[2].marcarLuta(lutadores[4], lutadores[5]);
		UEF[2].Lutar();		
	}
}
