package com.sxt.mapper;

import java.util.List;

import com.sxt.model.Friend;

public interface FriendMapper {
	public List<Friend> findAll();
	public Friend findById(int friendId);
	public int add(Friend friend);
	public int delete(int friendId);
	public int update (Friend friend);
}
