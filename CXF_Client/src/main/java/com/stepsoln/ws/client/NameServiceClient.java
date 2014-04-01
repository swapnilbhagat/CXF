/**
 * 
 */
package com.stepsoln.ws.client;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import com.stepsoln.ws.server.NameService;

/**
 * @author SwapnilB
 * 
 */
public class NameServiceClient
{

	public static void main(String[] args)
	{
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.getInInterceptors().add(new LoggingInInterceptor());
		factory.getOutInterceptors().add(new LoggingOutInterceptor());
		factory.setServiceClass(NameService.class);
		factory.setAddress("http://localhost:8080/ws/nameService");
		NameService nameService = (NameService) factory.create();
		String fullName = nameService.getFullName("Swapnil", "Bhagat");
		System.out.println(fullName);
		
	}
}
