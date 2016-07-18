package yahooData.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import yahooData.data.entities.Account;
import yahooData.form.CreateAccountForm;
import yahooData.services.AccountService;

@Controller
public class HomeController {

	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(){
		return "home";
	}
	
	@RequestMapping(value="createAccount", method=RequestMethod.GET)
	public String createAccount(Model model){
		model.addAttribute("createAccountForm", new CreateAccountForm());
		return "createAccount";
	}
	
	@RequestMapping(value="createAccount", method=RequestMethod.POST)
	public ModelAndView createAccount( HttpServletRequest request, @ModelAttribute("createAccountForm") @Valid CreateAccountForm createAccount,
			Errors errors) throws Exception{
		if(errors.hasErrors()){
			System.out.println("create user error: "+errors.toString());
			return new ModelAndView("createAccount");
		}
		Account account = accountService.createAccount(createAccount);
		HttpSession session = request.getSession(false);
		if(session == null){
			throw new Exception("Session Does Not Exist");
		}
		session.setAttribute("account", account);
		return new ModelAndView("redirect:/dashboard/init");
	}
	
}
