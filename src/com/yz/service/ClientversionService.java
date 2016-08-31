package com.yz.service;


import com.yz.po.Clientversion;

public interface ClientversionService {
	public Clientversion findClientversion() throws Exception;
	
	public void updateClientversion(Clientversion clientversion) throws Exception;
 
}
