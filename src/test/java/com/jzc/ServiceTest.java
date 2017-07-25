package com.jzc;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.jzc.service.IService;
import com.jzc.service.impl.Service;

public class ServiceTest {
	
	public static void main(String[] args){
		Registry registry = null;
		
		try{
			registry = LocateRegistry.createRegistry(2182);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try{
			Service service = new Service();
			registry.rebind("jzc", service);
			System.out.println("bind server");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
