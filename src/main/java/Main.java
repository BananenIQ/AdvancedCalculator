import javafx.application.Application;
import javafx.stage.Stage;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Main extends Application {



    public static void main(String[]args){
        launch(args);
    }

    @Override
    public void start(Stage homeStage) throws Exception {
        new Frame(homeStage);
        new Watcher(homeStage);
        File file = new File("profiles.json");
        if(file.exists()) {
            readJson();
        }
    }

    @SuppressWarnings("unchecked")
    public void readJson(){
        JSONParser jsonParser = new JSONParser();

        try(FileReader fileReader = new FileReader("profiles.json")){
            JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);
            JSONArray jsonArray = (JSONArray) jsonObject.get("profiles");
            Iterator<JSONObject> iterator = jsonArray.iterator();
            while(iterator.hasNext()){
                Profile profile = new Profile();
                ProfileList profileList = new ProfileList();

                JSONObject object = (JSONObject) jsonParser.parse(iterator.next().toJSONString());

                profile.setName((String) object.get("name"));
                profile.setVdc((Double) object.get("vdc"));
                profile.setCrs((Double) object.get("crs"));
                profile.setCrt((Double) object.get("crt"));
                profile.setCc((Double) object.get("cc"));
                profile.setSt((Double) object.get("st"));
                profile.setSc((Double) object.get("sc"));
                profile.setNls((Double) object.get("nls"));
                profile.setNlc((Double) object.get("nlc"));
                profile.setRi((Double) object.get("ri"));
                profile.setWoe((Double) object.get("woe"));

                profileList.add(profile);

            }
        }catch (IOException | ParseException e){
            e.printStackTrace();
        }
    }
}
