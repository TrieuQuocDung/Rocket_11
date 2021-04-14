package com.vti.academy.frontend.CRUD;

import java.sql.SQLException;

import com.vti.academy.backend.DepartmentDao;

public class CRUDProgram {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DepartmentDao departmentDao = new DepartmentDao();
		departmentDao.Question1();
	}

}
