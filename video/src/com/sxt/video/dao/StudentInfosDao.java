package com.sxt.video.dao;

import java.util.List;

import com.sxt.video.model.StudentInfos;

public interface StudentInfosDao {
public int add(StudentInfos stuentInfos);

public  List<StudentInfos> finbyPagenation(int curPage);
public long findTotalRows();
}
