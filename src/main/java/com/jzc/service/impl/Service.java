package com.jzc.service.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.jzc.service.IService;

public class Service extends UnicastRemoteObject implements IService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5419641365000931215L;

	public Service() throws RemoteException {
		super();
	}
	
	public String queryName(String no) throws RemoteException {
		System.out.println("hello" + no);  
        return String.valueOf(System.currentTimeMillis());
	}
	
}
