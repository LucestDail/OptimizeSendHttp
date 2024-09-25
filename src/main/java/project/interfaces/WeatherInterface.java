package project.interfaces;

import java.net.HttpURLConnection;
import java.net.URL;

import org.jsoup.Jsoup;

import project.util.HttpUtil;

public class WeatherInterface{
    
    public String getOpenweathermap(){
        String strWeatherInfo = "";
		try {
	        strWeatherInfo = new HttpUtil().executeGet("https://api.openweathermap.org/data/2.5/weather?lat=37.245807&lon=127.057375&appid=e9ba762681ab8a0aa1e50fe52895b0eb");
		}catch(Exception e) {
			e.printStackTrace();
		}
        return strWeatherInfo;
    }
    
}