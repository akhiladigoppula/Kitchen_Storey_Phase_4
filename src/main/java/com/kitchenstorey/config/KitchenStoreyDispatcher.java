package com.kitchenstorey.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class KitchenStoreyDispatcher extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
	
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] configClasses= {KitchenStoreyConfig.class};
		return configClasses;
	}
	
	@Override
	protected String[] getServletMappings() {
		String[] mappings= {"/"};
		return mappings;

	}

}
