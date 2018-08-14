package com.sxt.video.vo;

import java.util.List;

public class Pagenation {
public static  final int  PAGESIZE=2;
private List<?>list;
private int curPage;
private int totalRows;
private int totalPages;
public List<?> getList() {
	return list;
}
public void setList(List<?> list) {
	this.list = list;
}
public int getCurPage() {
	return curPage;
}
public void setCurPage(int curPage) {
	this.curPage = curPage;
}
public int getTotalRows() {
	return totalRows;
}
public void setTotalRows(int totalRows) {
	this.totalRows = totalRows;
}
public int getTotalPages() {
	return totalPages;
}
public void setTotalPages(int totalPages) {
	this.totalPages = totalPages;
}

}
