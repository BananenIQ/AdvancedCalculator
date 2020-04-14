import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ProfileList {


    static ArrayList<Profile> profileArrayList = new ArrayList<Profile>();

    public ProfileList(){
    }

    public void add(Profile p){
        profileArrayList.add(p);
    }
    public Profile get(int i){
        return profileArrayList.get(i);
    }
    public int size(){
        return profileArrayList.size();
    }
    public boolean contains (Profile p){
        return profileArrayList.contains(p);
    }

    @SuppressWarnings("unchecked")
    public void save(){

        JSONObject obj = new JSONObject();

        JSONArray list = new JSONArray();


        for(Profile p : profileArrayList){

            JSONObject objPro = new JSONObject();
            objPro.put("name", p.getName());
            objPro.put("vdc", p.getVdc());
            objPro.put("crs", p.getCrs());
            objPro.put("crt", p.getCrt());
            objPro.put("cc", p.getCc());
            objPro.put("st", p.getSt());
            objPro.put("sc", p.getSc());
            objPro.put("nls", p.getNls());
            objPro.put("nlc", p.getNlc());
            objPro.put("ri", p.getRi());
            objPro.put("woe", p.getWoe());
            list.add(objPro);
        }
        obj.put("profiles", list);

        try(FileWriter file = new FileWriter("profiles.json")){
            file.write(obj.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
