package utility;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.server.ExportException;

public class readJsonData {
    public static String readTestData(String jsonFilePath, String dictName, String key) throws Exception {
        try{
            JSONParser jsonParse = new JSONParser();
            JSONObject jsonObj = (JSONObject) jsonParse.parse(new FileReader(jsonFilePath));
            JSONObject dict = (JSONObject) jsonObj.get(dictName);
            return (String) dict.get(key);
        }catch (Exception e){
            throw new Exception(e);
            }
        }
}

