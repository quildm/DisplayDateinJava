package com.codingdojo.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class HomeController {
	 @RequestMapping("/")
     public String index() {
             return "index.jsp";
     }

	 @RequestMapping("/date")
     public String date(Model d) {
         SimpleDateFormat sdf = new SimpleDateFormat("EEEE 'the' d 'of' MMMM ',' y");
         Date now = new Date();
		 String dateAsString = sdf.format(now);
		 d.addAttribute("dateAsString",dateAsString);
		 return "date.jsp";
     }
	 
	 @RequestMapping("/time")
     public String time(Model t) {
		 SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss a");
         Date now = new Date();
		 String dateAsString = sdf.format(now);
		 t.addAttribute("dateAsString",dateAsString);
		 return "time.jsp";
     }


}
