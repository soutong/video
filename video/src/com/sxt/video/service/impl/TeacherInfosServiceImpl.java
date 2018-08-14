package com.sxt.video.service.impl;

import java.util.List;

import com.sxt.video.dao.TeacherInfosDao;
import com.sxt.video.dao.impl.TeacherInfosDaoImpl;
import com.sxt.video.model.TeacherInfos;
import com.sxt.video.service.TeacherInfosService;
import com.sxt.video.vo.Pagenation;

public class TeacherInfosServiceImpl implements TeacherInfosService {

	private TeacherInfosDao ti=new TeacherInfosDaoImpl();
	@Override
	public int add(TeacherInfos teacherInfos) {
		// TODO Auto-generated method stub
		return ti.add(teacherInfos);
	}

	@Override
	public Pagenation findbyPagenation(int curPage) {
		List<TeacherInfos> list = ti.finbyPagenation(curPage);
		int totalRows = (int)ti.findTotalRows();
		Pagenation pg = new Pagenation();
		pg.setList(list);
		pg.setTotalRows(totalRows);
		pg.setCurPage(curPage);
		int totalPages=totalRows%pg.PAGESIZE==0?totalRows/pg.PAGESIZE:totalRows/pg.PAGESIZE+1;
		pg.setTotalPages(totalPages);
		return pg;
	}

}
