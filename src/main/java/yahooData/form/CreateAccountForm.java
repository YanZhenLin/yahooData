package yahooData.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(value=WebApplicationContext.SCOPE_REQUEST,
		proxyMode=ScopedProxyMode.TARGET_CLASS)
public class CreateAccountForm {
	
	@NotNull(message="first name must not be empty.")
	private String firstName;
	
	@NotNull(message="last name must not be empty.")
	private String lastName;
	
	@NotNull(message="username must not be empty.")
	private String username;
	
	@NotNull(message="email must not be empty.")
	private String email;
	
	@NotNull(message="password must not be empty.")
	@Size(min=6, max=18, message="password must be between 6-18 characters.")
	private String password;
	
	public CreateAccountForm(){
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
