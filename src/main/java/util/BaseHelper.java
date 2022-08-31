package util;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

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

    public List<String> getPlayerAttribute(JSONArray teamData, String key) {
        List<String> playerAttribute = new ArrayList<>();

        for (int i = 0; i < teamData.size(); i++) {
            JSONObject object = (JSONObject) teamData.get(i);
            playerAttribute.add(object.get(key).toString());
        }
        return playerAttribute;
    }

    public int getForeignPlayerCount(List playerCountryList) {
        int overseasPlayerCount=0;
        for (Object cnt : playerCountryList){
            if(!cnt.equals("India")){
                overseasPlayerCount++;
            }
        }
        return overseasPlayerCount;
    }

}
