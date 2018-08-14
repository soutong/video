package com.sxt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sxt.mapper.PhotoMapper;
import com.sxt.model.Photo;
import com.sxt.service.PhotoService;
@Service(value="photoService")
public class PhotoServiceImpl implements PhotoService {
	@Autowired
	private PhotoMapper photoMapper;
	public List<Photo> findAll() {
		// TODO Auto-generated method stub
		return photoMapper.findAll();
	}

	public int add(Photo photo) {
		// TODO Auto-generated method stub
		return photoMapper.add(photo);
	}

	public int delete(int photoId) {
		// TODO Auto-generated method stub
		return photoMapper.delete(photoId);
	}

	public Photo findById(int photoId) {
		// TODO Auto-generated method stub
		return photoMapper.findById(photoId);
	}

}
