package com.sxt.video.dao;

import java.util.List;

import com.sxt.video.model.TeacherInfos;

public interface TeacherInfosDao {
public int add(TeacherInfos teacherInfos);

public  List<TeacherInfos> finbyPagenation(int curPage);
public long findTotalRows();
}
