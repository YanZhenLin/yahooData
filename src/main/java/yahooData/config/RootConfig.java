package yahooData.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages={"yahooData"}, 
		excludeFilters={@Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class ) })
public class RootConfig {

	//bCryptEncoder goes here
	
	//Hibernate session and sessionFactory beans goes here
	
}
