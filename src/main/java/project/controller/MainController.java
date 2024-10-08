package project.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.JMenuBar;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

@RestController
@CrossOrigin
@RequestMapping("/main")
public class MainController {
    
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView login(Model model) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main/login");
		return mav;
	}
    
    @RequestMapping(value = "/jsoup", method = RequestMethod.GET)
    public String jsoup(Model model){
        String strUrl = "http://google.com";
        String strHtml = "";
        Document doc = null;
        try{
            doc = Jsoup.connect(strUrl).get();
        }catch(Exception e){
            e.printStackTrace();
        }
        if(doc != null){
            strHtml = doc.html();
        }
        return strHtml;
    }
}