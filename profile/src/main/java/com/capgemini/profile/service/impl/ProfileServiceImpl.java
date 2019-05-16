package com.capgemini.profile.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.profile.dao.ProfileDao;
import com.capgemini.profile.entity.ProfileDetails;
import com.capgemini.profile.service.ProfileService;


@Service
public class ProfileServiceImpl implements ProfileService{

	@Autowired
	private ProfileDao dao;
	
	@Override
	public List<ProfileDetails> findOrderHistory(String email) {
		// TODO Auto-generated method stub
		return dao.findAllByEmail(email);
	}

	@Override
	public ProfileDetails findOrderDish(int orderId) {
		// TODO Auto-generated method stub
		return dao.findByOrderId(orderId);
	}

	

//	@Override
//	public ProfileDetails findOrderDish(int orderId) {
//		// TODO Auto-generated method stub
//		return dao.findByDish(orderId);
//	}

	
	

	
	

	
	
}
