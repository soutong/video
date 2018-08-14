package com.sxt.video.service;

import com.sxt.video.model.StudentInfos;
import com.sxt.video.vo.Pagenation;

public interface StudentInfosService {
	public int add(StudentInfos studentInfos);
	public Pagenation findbyPagenation(int curPage);
}
