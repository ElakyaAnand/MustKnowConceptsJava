package javaConcepts;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferedWriting {

	public static void main(String[] args) throws IOException {
		
		String path="Bufferedwriter.txt";
		String contents="Belief Yourself, Keep Practicing";
		
		
		FileWriter fileWriter=new FileWriter(path);
		BufferedWriter buffwriter=new BufferedWriter(fileWriter);
		buffwriter.write(contents);
		buffwriter.close();

	}

}
