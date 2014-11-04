package fileReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
	
	public void displayFileReversed(String fileName) {
		// TODO Auto-generated method stub
		this.openAndCheck(fileName);
		ArrayList<String> content = new ArrayList<String>();
		
		try{
			InputStream stream=new FileInputStream(fileName); 
			InputStreamReader read=new InputStreamReader(stream);
			BufferedReader buff=new BufferedReader(read);
			String line;
			while ((line=buff.readLine())!=null){
				content.add(line);
			}
			for(int i=content.size()-1; i>=0;i--){
				System.out.println(content.get(i));
			}
			buff.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}
		
	}

}
