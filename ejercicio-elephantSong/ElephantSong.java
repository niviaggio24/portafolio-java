public class ElephantSong {

	public void songGenerator(int maxElephants, int iniElephants) {
		// Fabuloso c�digo que genera la canci�n de los elefantes
	}
	
	public static void main(String[] args) {
		int elefantes = 5;
		
		String word = "Elefantes";
		String verb = "balanceaban";
		
		while (elefantes > 0) {
			
			if (elefantes == 1) {
				word = "Elefante";
				verb = "balanceaba";
			}
			
			System.out.println(elefantes + " " + word + " se " + verb + " sobre la tela de una ara�a");
			
			if (elefantes > 1) {
				System.out.println("Como la tela no resist�a fueron a quitar a un elefante.");
			} else {
				System.out.println("Se baj� el �ltimo elefante.");
			}
			
			elefantes = elefantes - 1;
		}
	}
}
