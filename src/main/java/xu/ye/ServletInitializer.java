/*
 * ServletInitializer.java
 * 
 * Sep 2, 2016
 * 
 * Copyright © 2016 NhanNT
 */
package xu.ye;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
/**
 * Servlet Initialize class
 * @author NhanNT
 * @version 1.0
 */
public class ServletInitializer extends SpringBootServletInitializer {
    	
	/* (non-Javadoc)
	 * @see org.springframework.boot.context.web.SpringBootServletInitializer#configure(org.springframework.boot.builder.SpringApplicationBuilder)
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	    return builder.sources(MoneyManagementApplication.class);
	}

}
