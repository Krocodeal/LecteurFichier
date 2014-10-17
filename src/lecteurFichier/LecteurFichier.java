package lecteurFichier;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LecteurFichier extends AbsLecteur {
	
	private ArrayList<String> contenu;

	
	public LecteurFichier(){
		
	}


	public ArrayList<String> getContenu() {
		return contenu;
	}


	public void setContenu(ArrayList<String> contenu) {
		this.contenu = contenu;
	}


	@Override
	public void afficher(String fileName) {
		// TODO Auto-generated method stub
		this.openAndCheck(fileName);
		
		try{
			InputStream flux=new FileInputStream(fileName); 
			InputStreamReader lecture=new InputStreamReader(flux);
			BufferedReader buff=new BufferedReader(lecture);
			String ligne;
			while ((ligne=buff.readLine())!=null){
				System.out.println(ligne);
			}
			buff.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}
		
		
	}


}
