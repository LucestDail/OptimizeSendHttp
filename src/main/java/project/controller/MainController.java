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
    public String jsoupTest(Model model){
        String jsoupHtml = "";
        try{
        	String blogUrl = "https://spring.io/blog";
			Document doc = Jsoup.connect(blogUrl).get();
        }catch(e){
            e.printStackTrace();
        }
        return jsoupHtml;
    }
}