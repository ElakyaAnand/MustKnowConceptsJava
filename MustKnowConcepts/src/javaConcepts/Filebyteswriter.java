package javaConcepts;


import java.io.FileOutputStream;
import java.io.IOException;

public class Filebyteswriter {

	public static void main(String[] args) throws IOException {
		
		String path="Byteswriting.txt";
		String contents="Belief Yourself, Keep Practicing, Spend time with God";
		
		FileOutputStream fileOutputStream=new FileOutputStream(path);
		byte[] bytecontent= contents.getBytes();
		fileOutputStream.write(bytecontent);
		fileOutputStream.close();

	}

}
