package com.qa.ims.controller;


import java.lang.System.Logger;
import java.util.List;

import org.apache.logging.log4j.LogManager;

import com.qa.ims.persistence.dao.Dao;
import com.qa.ims.persistence.domain.Orders;



public class OrdersController implements Dao<Orders> {
	public static final Logger LOGGER = LogManager.getLogger();

	@Override
	public List<Orders> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orders create() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Override
	public Orders update() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	
	

}
