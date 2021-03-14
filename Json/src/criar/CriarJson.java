package criar;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONException;
import org.json.simple.JSONObject;

public class CriarJson {

	public static void main(String[] args) {
		
		FileWriter writeFile = null;
		JSONObject objJson = new JSONObject();
		
		
			objJson.put("Nome", "Kelvin Schneider");
			objJson.put("Idade", "19");
			objJson.put("Sexo", "masculino");
			
			try {
				
				writeFile = new FileWriter("C:\\Users\\Kelvin\\Desktop\\DOC\\" + "teste_json.json");
				writeFile.write(objJson.toJSONString());
				writeFile.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("JSON criado: ");
			System.out.println(objJson.toJSONString());		
	}

}
