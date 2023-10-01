package Data;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DataReader {
    public String name , CuntryName ,NameProuduct;
    public void  Reader() throws IOException, ParseException {

        String Path="E:\\automation testing\\Appium\\Appium_Project\\src\\test\\java\\Data\\UserData.json";
        File srcfile = new File(Path);
        JSONParser parser = new JSONParser();
        JSONArray jarray = (JSONArray) parser.parse(new FileReader(srcfile));

        for(Object yobject : jarray) {

            JSONObject person = (JSONObject) yobject;
            name=(String) person.get("name");
            CuntryName=(String) person.get("CuntryName");
            NameProuduct=(String) person.get("NameProuduct");

            

        }

    }

}