package com.sxt.video.service.impl;

import java.util.List;

import com.sxt.video.dao.StudentInfosDao;
import com.sxt.video.dao.TeacherInfosDao;
import com.sxt.video.dao.impl.StudentInfosDaoImpl;
import com.sxt.video.dao.impl.TeacherInfosDaoImpl;
import com.sxt.video.model.StudentInfos;
import com.sxt.video.model.TeacherInfos;
import com.sxt.video.service.StudentInfosService;
import com.sxt.video.service.TeacherInfosService;
import com.sxt.video.vo.Pagenation;

public class StudentInfosServiceImpl implements StudentInfosService {

	private StudentInfosDao si=new StudentInfosDaoImpl();
	@Override
	public int add(StudentInfos studentInfos) {
		// TODO Auto-generated method stub
		return si.add(studentInfos);
	}

	@Override
	public Pagenation findbyPagenation(int curPage) {
		List<StudentInfos> list = si.finbyPagenation(curPage);
		int totalRows = (int)si.findTotalRows();
		Pagenation pg = new Pagenation();
		pg.setList(list);
		pg.setTotalRows(totalRows);
		pg.setCurPage(curPage);
		int totalPages=1;
		if(totalRows!=0){
		totalPages=totalRows%pg.PAGESIZE==0?totalRows/pg.PAGESIZE:totalRows/pg.PAGESIZE+1;
		}
		pg.setTotalPages(totalPages);
		return pg;
	}

}
