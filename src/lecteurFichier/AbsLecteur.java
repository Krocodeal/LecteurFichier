package lecteurFichier;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public abstract class AbsLecteur implements InterfaceLecteur{
	
	public boolean openAndCheck(String fileName){
		
		File f = new File(fileName); 
		FileInputStream fis = null;
		if (f.isFile() && f.canRead()) {
			try {
				fis = new FileInputStream(fileName);
		
				System.out.println("Total file size to read (in bytes) : "
						+ fis.available());
		
				return true;
		
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (fis != null)
						fis.close();
					return false;
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
			
		} return false;
	}
	
	
	public void readFichier(){
		
	}

	@Override
	public abstract void afficher(String fileName);
	
}
