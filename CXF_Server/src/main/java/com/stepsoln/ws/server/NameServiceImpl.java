/**
 * 
 */
package com.stepsoln.ws.server;

import javax.jws.WebService;

/**
 * @author SwapnilB
 * 
 */
@WebService(endpointInterface = "com.stepsoln.ws.server.NameService")
public class NameServiceImpl implements NameService
{

	public String getFullName(String firstName, String lastName)
	{
		return firstName + " " + lastName;
	}

}
