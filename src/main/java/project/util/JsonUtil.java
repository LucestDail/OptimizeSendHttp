package project.util;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonUtil {
	public JSONObject getJson(String strJson) {
		JSONParser parser = new JSONParser();
		JSONObject jsonObj = null;
		try {
			jsonObj = (JSONObject) parser.parse(strJson);
		}catch(Exception e) {
//			e.printStackTrace();
			System.out.println("=============== JSON ERROR ===============");
		}
	    return jsonObj;
	}
}
