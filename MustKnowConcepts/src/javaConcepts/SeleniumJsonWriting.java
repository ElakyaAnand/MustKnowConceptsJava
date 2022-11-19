package javaConcepts;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class SeleniumJsonWriting {

	public static void main(String[] args) throws IOException {
		
		

		JSONObject jObject=new JSONObject();
		jObject.put("ID", 001);
		jObject.put("Name", "Elakya");
		
		
		JSONArray jArray=new JSONArray();
		jArray.add("B.Tech");
		jArray.add("I.T");
		
		jObject.put("Qulaification", jArray);
		
		FileWriter filewriter=new FileWriter("JsonWriter.txt");
		filewriter.write(jObject.toJSONString());
		filewriter.close();

	}

}
