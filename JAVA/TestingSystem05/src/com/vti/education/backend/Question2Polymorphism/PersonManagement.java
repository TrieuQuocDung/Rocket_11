package com.vti.education.backend.Question2Polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.education.entity.Question2Polymorphism.Student;

public class PersonManagement {
	private List<Student> students;
	private Scanner scanner;

	public PersonManagement() {
		students = new ArrayList<>();
		scanner = new Scanner(System.in);
	}

	public void inputInfor() {
		System.out.println("Nhập số sinh viên muốn nhập : ");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Nhập sinh viên thứ : " + i);
			students.add(new Student());
		}

	}

	public void showInfo() {
		for (Student student : students) {
			student.showInfo();
		}
	}

	public void xetHocBong() {
		System.out.println("Nhập tên sinh viên muốn xét:");
		String name = scanner.nextLine();

		for (Student student : students) {
			if (student.getName().equals(name)) {
				if (student.isStudentGetScholarship()) {
					System.out.println("Sinh viên này được học bổng !");
				} else {
					System.out.println("Không được học bổng !");
				}
				break;
			}
		}
	}
}
