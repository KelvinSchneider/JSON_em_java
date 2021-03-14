package ler;

import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class LerJson {

	public static void main(String[] args) {

		JSONObject objJson;
		JSONParser parser = new JSONParser();

		Endereco ende = new Endereco();

		String cep = "89266270";

		try {
			
			// url do site onde vai ser lido o JSON
			URL url = new URL("https://viacep.com.br/ws/" + cep + "/json/");
			Reader reader = new InputStreamReader(url.openStream(), "UTF-8"); // Lê bytes do arquivo

			objJson = (JSONObject) parser.parse(reader);

			ende.setCep((String) objJson.get("cep"));
			ende.setRua((String) objJson.get("logradouro"));
			ende.setBairro((String) objJson.get("bairro"));
			ende.setCidade((String) objJson.get("cidade"));
			ende.setUf((String) objJson.get("uf"));

			System.out.println("Endereço:" + ende.toString());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
