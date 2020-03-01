package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pojo.PersonGroup;

@Service
public class PersonDataService {
	@Autowired
	public static PersonGroup personGroup;
	
}
