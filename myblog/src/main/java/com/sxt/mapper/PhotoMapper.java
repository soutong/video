package com.sxt.mapper;

import java.util.List;

import com.sxt.model.Photo;

public interface PhotoMapper {
	public List<Photo> findAll();
	public int add(Photo photo);
	public int delete(int photoId);
	public Photo findById(int photoId);
}
