package project.interfaces;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.jsoup.Jsoup;

public class InterfaceCore {
	
	public String getWeatherInfo() {
        return new WeatherInterface().getOpenweathermap();
	}
	
	// public String getEmergencyInfo() {
	// 	ChromeDriverManager cdm = new ChromeDriverManager();
	// 	try {
	//         return cdm.get("https://apis.data.go.kr/1741000/DisasterMsg3/getDisasterMsg1List?serviceKey=%2BkU%2Fl%2BmB%2BaScHKnpR3kf2u8QrvOabs2puP9e379pN%2BogKLdWOorY7p%2BQKU9wYCUxnDImZaGv9YAQa%2BoxfqqGRQ%3D%3D&pageNo=1&numOfRows=10&type=json");
	// 	}catch(Exception e) {
	// 		// e.printStackTrace();
	// 		return "";
	// 	}finally {
	// 		cdm.closeDriver();
	// 	}
	// }
    
	// public List<String> getYeonHapInfo() {
	// 	ChromeDriverManager cdm = new ChromeDriverManager();
	// 	try {
	// 		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	// 		Calendar c1 = Calendar.getInstance();
	// 		WebDriver driver = cdm.getDriver();
	// 		driver.get("https://www.yna.co.kr/theme/breaknews-history?date=" + sdf.format(c1.getTime()));
	// 		List<String> newsList = new ArrayList<>();
	// 		for(WebElement we : driver.findElements(By.className("tit-news"))) {
	// 			newsList.add(we.getText());
	// 		}
	//         return newsList;
	// 	}catch(Exception e) {
	// 		// e.printStackTrace();
	// 		return null;
	// 	}finally {
	// 		cdm.closeDriver();
	// 	}
	// }
	
	// public String getTransportInfo() {
	// 	ChromeDriverManager cdm = new ChromeDriverManager();
	// 	try {
	// 		return cdm.get("https://openapi.its.go.kr:9443/eventInfo?apiKey=409b7fa7f23c4baf956e166d78b97726&type=all&eventType=all&getType=json");
	// 	}catch(Exception e) {
	// 		// e.printStackTrace();
	// 		return "";
	// 	}finally {
	// 		cdm.closeDriver();
	// 	}
	// }

	// public String getWeatherInfo(ChromeDriverManager cdm) {
	// 	try {
	//         return cdm.get("https://api.openweathermap.org/data/2.5/weather?lat=37.245807&lon=127.057375&appid=e9ba762681ab8a0aa1e50fe52895b0eb");
	// 	}catch(Exception e) {
	// 		// e.printStackTrace();
	// 		return null;
	// 	}
	// }

	// public List<String> getYeonHapInfo(ChromeDriverManager cdm) {
	// 	try {
	// 		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	// 		Calendar c1 = Calendar.getInstance();
	// 		WebDriver driver = cdm.getDriver();
	// 		driver.get("https://www.yna.co.kr/theme/breaknews-history?date=" + sdf.format(c1.getTime()));
	// 		List<String> newsList = new ArrayList<>();
	// 		for(WebElement we : driver.findElements(By.className("tit-news"))) {
	// 			newsList.add(we.getText());
	// 		}
	//         return newsList;
	// 	}catch(Exception e) {
	// 		// e.printStackTrace();
	// 		return null;
	// 	}
	// }

	// public String getEmergencyInfo(ChromeDriverManager cdm) {
	// 	try {
	//         return cdm.get("https://apis.data.go.kr/1741000/DisasterMsg3/getDisasterMsg1List?serviceKey=%2BkU%2Fl%2BmB%2BaScHKnpR3kf2u8QrvOabs2puP9e379pN%2BogKLdWOorY7p%2BQKU9wYCUxnDImZaGv9YAQa%2BoxfqqGRQ%3D%3D&pageNo=1&numOfRows=10&type=json");
	// 	}catch(Exception e) {
	// 		// e.printStackTrace();
	// 		return null;
	// 	}
	// }

	// public String getTransportInfo(ChromeDriverManager cdm) {
	// 	try {
	// 		return cdm.get("https://openapi.its.go.kr:9443/eventInfo?apiKey=409b7fa7f23c4baf956e166d78b97726&type=all&eventType=all&getType=json");
	// 	}catch(Exception e) {
	// 		// e.printStackTrace();
	// 		return "";
	// 	}
	// }
}
