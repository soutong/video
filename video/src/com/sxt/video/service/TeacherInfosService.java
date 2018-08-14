package com.sxt.video.service;

import com.sxt.video.model.TeacherInfos;
import com.sxt.video.vo.Pagenation;

public interface TeacherInfosService {
	public int add(TeacherInfos teacherInfos);
	public Pagenation findbyPagenation(int curPage);
}
