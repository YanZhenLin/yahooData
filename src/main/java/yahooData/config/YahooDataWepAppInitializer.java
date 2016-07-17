package yahooData.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class YahooDataWepAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	/*
	* (non-Javadoc)
	* @see org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer#getRootConfigClasses()
	* 
	* The @Configuration classes returned by the 
	* expected to load middle-tier components and data-tier components (non-web beans, such as bCryptEncoder)
	*/
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { RootConfig.class };
	}


	/*
	* (non-Javadoc)
	* WebConfig is designed to load the controllers, view resolvers, and handler mappings
	* 
	*/
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfig.class };
	}


	/*
	* 
	* (non-Javadoc)
	* @see org.springframework.web.servlet.support.AbstractDispatcherServletInitializer#getServletMappings()
	* points our servlet url mappings to the objects defined in getServletConfigClasses
	* 
	*/
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

}
