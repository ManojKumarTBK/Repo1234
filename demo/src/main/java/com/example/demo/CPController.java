package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CPController {
	

	
	@RequestMapping("/home")
	public String getdownStreamMaster() {
		System.out.println("Welcome to Spring boot controller");
		
		//ModelAndView mv=new ModelAndView("home"); 
		/*DownStream_Master
		 * dsm=dsRepo.findById(dsmid).orElse(new DownStream_Master());
		 * mv.addObject(dsm);
		 */
		
		return "home";
	}
	
	

}
