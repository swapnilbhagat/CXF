/**
 * 
 */
package com.stepsoln.ws.server;

import javax.jws.WebService;

/**
 * @author SwapnilB
 * 
 */
@WebService
public interface NameService
{
	public String getFullName(String firstName, String lastName);
}
