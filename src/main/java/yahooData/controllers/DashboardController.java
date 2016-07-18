package yahooData.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="dashboard")
public class DashboardController {
	
	/*
	 * TODO 
	 * need to create a new service interface and implementation class fro the yahooDataService layer
	 * @Autowired
	 * private YahooDataService yahoodataService //we will need to look into it
	 */
	
	@RequestMapping(value="init", method=RequestMethod.GET)
	public String init(){
		return "init";
	}
	
	
}
