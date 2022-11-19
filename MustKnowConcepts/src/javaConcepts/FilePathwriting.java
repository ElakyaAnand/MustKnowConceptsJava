package javaConcepts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePathwriting {

	public static void main(String[] args) throws IOException {
		
		String path="paths.txt";
		String contents="Belief Yourself, Keep Practicing, Spend time with God";
		
		Path  pathfile=	Paths.get(path);
		Files.write(pathfile, contents.getBytes());
		
		

	}

}
