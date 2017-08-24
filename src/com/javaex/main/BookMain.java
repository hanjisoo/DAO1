package com.javaex.main;

import com.javaex.dao.BookDao;
import com.javaex.vo.BookVo;

public class BookMain {

	public static void main(String[] args) {
	
		BookDao dao=new BookDao();
		BookVo vo=new BookVo("나혼자산다","MBC","2017/07/21",8);
		dao.insert(vo);
	}

}
