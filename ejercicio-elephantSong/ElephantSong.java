public class ElephantSong {

	public void songGenerator(int maxElephants, int iniElephants) {
		// Fabuloso código que genera la canción de los elefantes
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
			
			System.out.println(elefantes + " " + word + " se " + verb + " sobre la tela de una araña");
			
			if (elefantes > 1) {
				System.out.println("Como la tela no resistía fueron a quitar a un elefante.");
			} else {
				System.out.println("Se bajó el último elefante.");
			}
			
			elefantes = elefantes - 1;
		}
	}
}
