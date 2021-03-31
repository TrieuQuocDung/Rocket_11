package com.vti.education.frontend.Question1Polymorphism;

import com.vti.education.backend.Question1Polymorphism.StudentManagement;

public class PolymorphismProgram {
	public static void main(String[] args) {
		
	StudentManagement studentManagement = new StudentManagement();

	studentManagement.initStudents();
	studentManagement.caLopDiemDanh();
	studentManagement.nhomDiHocBai();
	studentManagement.nhomDiDonVeSinh();
	}
}
