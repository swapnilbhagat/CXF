/**
 * 
 */
package com.stepsoln.ws.server;

import javax.jws.WebService;

/**
 * WebService Implementation.
 * 
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
