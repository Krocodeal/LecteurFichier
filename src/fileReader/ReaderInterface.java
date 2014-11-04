package fileReader;

public interface ReaderInterface {
	
		boolean openAndCheck(String fileName);
		
		void readFile();
		
		void displayFile(String fileName);

}
