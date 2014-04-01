/**
 * 
 */
package com.stepsoln.ws.server;

import javax.xml.ws.Endpoint;

/**
 * @author SwapnilB
 * 
 */
public class NameServicePublisher
{
	public static void main(String[] args)
	{
		Endpoint.publish("http://localhost:8080/ws/nameService", new NameServiceImpl());
		System.out.println("NameService published on http://localhost:8080/ws/nameService");
	}
}
