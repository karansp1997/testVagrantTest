package util;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class BaseHelper {

    public JSONArray readTestData(String fileName) {
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject;
        JSONArray jsonArray = new JSONArray();


        try {
            Object fileObject = jsonParser.parse(new FileReader(fileName));
            jsonObject = (JSONObject) fileObject;
            jsonArray = (JSONArray) jsonObject.get("player"); //Hardcoding key name due to limited problem statement (although not a good practice);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return jsonArray;
    }

}
