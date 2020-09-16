package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.ApplicationList;

public interface ListDao {
	
	void insertList(ApplicationList applicationList);
	
	List<ApplicationList> getAll();

}
