package project.service.impl;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import project.interfaces.InterfaceCore;
import project.service.TestService;
import project.util.JsonUtil;

@Service
public class TestServiceImpl implements TestService {
    
    public JSONObject getWeatherJsonObject(){
        JsonUtil ju = new JsonUtil();
        JSONObject weatherJson = ju.getJson(new InterfaceCore().getWeatherInfo());
        return weatherJson;
    }
    
}