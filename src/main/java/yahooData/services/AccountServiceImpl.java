package yahooData.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

import yahooData.data.entities.Account;
import yahooData.data.repositories.MongoAccountRepository;
import yahooData.form.CreateAccountForm;

@Service
@Scope(value=WebApplicationContext.SCOPE_REQUEST,
		proxyMode=ScopedProxyMode.INTERFACES)
public class AccountServiceImpl implements AccountService{

	@Autowired
	private MongoAccountRepository mongo;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public Account createAccount(CreateAccountForm accountForm) {
		//we need to transfer the data from the CreateAccountForm to an entity account type 
		Account account = new Account();
		//password encoding
		account.setEmail(accountForm.getEmail());
		account.setFirstName(accountForm.getFirstName());
		account.setLastName(accountForm.getLastName());
		account.setPassword( bCryptPasswordEncoder.encode(accountForm.getPassword()) );
		account.setUsername(accountForm.getUsername());
		return mongo.save(account); //returns the persisted account object
	}

	@Override
	public Account getAccountByUserName(String username) {
		return mongo.findByUsername(username);
	}

}
