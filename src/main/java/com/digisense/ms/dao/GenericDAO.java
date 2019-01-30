package com.digisense.ms.dao;

import java.awt.List;

import com.google.gson.JsonObject;

public interface GenericDAO {
	
	JsonObject getItem(String id);
	
	//List<T> getItems();

}
