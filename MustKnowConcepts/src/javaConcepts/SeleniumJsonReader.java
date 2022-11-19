package javaConcepts;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SeleniumJsonReader {

	public static void main(String[] args) throws IOException, ParseException {
		
		
		
		JSONParser jParser=new JSONParser();
		
		FileReader reader=new FileReader("JsonWriter.txt");
		Object  parsedfile= jParser.parse(reader);
		
		JSONObject jObject=(JSONObject) parsedfile;
		long id= (long) jObject.get("ID");
		String name= (String) jObject.get("Name");
		
		System.out.println(id);
		System.out.println(name);
	
		
		JSONArray jArray= (JSONArray) jObject.get("Qulaification");
		
		Iterator  iterator= jArray.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		
		
	}

}
