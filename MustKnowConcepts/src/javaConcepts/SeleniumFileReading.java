package javaConcepts;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class SeleniumFileReading {

	
	public static void main(String[] args) throws IOException {
		
		FileReader fileReader=new FileReader("Filewriting.txt");
		BufferedReader buffReader=new BufferedReader(fileReader);
		String line;
		while((line=buffReader.readLine())!=null)
		{
			System.out.println(line);
		}
		buffReader.close();
	}
}
