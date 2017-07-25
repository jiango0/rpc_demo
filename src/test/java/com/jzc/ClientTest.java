package com.jzc;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.jzc.service.IService;
import com.jzc.service.impl.Service;

public class ClientTest {
	
	public static void main(String[] args){
		Registry registry = null;
		
		try{
			registry = LocateRegistry.getRegistry("127.0.0.1",2182); 
			String[] list = registry.list();
            for(String s : list){
                System.out.println(s);
            }
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try{
			IService server = (IService) registry.lookup("jzc");
			String result = server.queryName("ha ha ha ha");
			System.out.println("result from remote : " + result);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
