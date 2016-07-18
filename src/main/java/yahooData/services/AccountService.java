package yahooData.services;

import yahooData.data.entities.Account;
import yahooData.form.CreateAccountForm;

public interface AccountService {
	public Account createAccount(CreateAccountForm accountForm);
	public Account getAccountByUserName(String username);
}
