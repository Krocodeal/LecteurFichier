package lecteurFichier;

public interface InterfaceLecteur {
	
		boolean openAndCheck(String fileName);
		
		void readFichier();
		
		void afficher(String fileName);

}
