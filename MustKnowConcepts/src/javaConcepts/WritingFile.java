package javaConcepts;

import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {

	public static void main(String[] args) throws IOException {
		
		String path="Filewriting.txt";
		String contents="Belief Yourself";
		
		
		FileWriter fileWriter=new FileWriter(path);
		fileWriter.write(contents);
		fileWriter.close();
	}

}
