package com.vti.education.backend.Question1Polymorphism;

import com.vti.education.entity.Quetion1Polymorphism.Student;

public class StudentManagement{
	private Student[] students;

	public StudentManagement() {
		students = new Student[11];
	}

	public void initStudents() {
		students[1] = new Student(1, "Lưu Tuấn Anh", 1);
		students[2] = new Student(2, "Đỗ Tuấn Anh", 1);
		students[3] = new Student(3, "Bùi Đình Đạt", 1);
		students[4] = new Student(4, "Nguyễn Văn Dũng", 2);
		students[5] = new Student(5, "Trần Đức Luân", 2);
		students[6] = new Student(6, "Mai Thị Loan", 2);
		students[7] = new Student(7, "Hoàng Thị Vui", 3);
		students[8] = new Student(8, "Nguyễn Phương Cường", 3);
		students[9] = new Student(9, "Cao Hồng Sơn", 3);
		students[10] = new Student(10, "Lý Hồng Quân", 3);
	}

	public void caLopDiemDanh() {
		for (int i = 1; i <= 10; i++) {
			students[i].caLopDiemDanh();
		}
	}

	public void nhomDiHocBai() {
		for (int i = 1; i <= 10; i++) {
			if (students[i].getGroup() == 1) {
				students[i].nhomDiHocBai();
			}
		}
	}

	public void nhomDiDonVeSinh() {
		for (int i = 1; i <= 10; i++) {
			if (students[i].getGroup() == 2) {
				students[i].nhomDiDonVeSinh();
			}
		}
	}
}
