package fileReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReader extends AbsReader {
	
	
	public FileReader(){
		
	}



	@Override
	public void displayFile(String fileName) {
		// TODO Auto-generated method stub
		this.openAndCheck(fileName);
		
		try{
			InputStream stream=new FileInputStream(fileName); 
			InputStreamReader read=new InputStreamReader(stream);
			BufferedReader buff=new BufferedReader(read);
			String line;
			while ((line=buff.readLine())!=null){
				System.out.println(line);
			}
			buff.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}
		
	}
}
