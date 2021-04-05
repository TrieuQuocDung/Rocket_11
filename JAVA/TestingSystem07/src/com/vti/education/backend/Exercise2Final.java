package com.vti.education.backend;

import com.vti.education.entity.Ex2Final.MyMath2;
import com.vti.education.entity.Ex2Final.PrimaryStudent2;
import com.vti.education.entity.Ex2Final.SecondaryStudent2;
import com.vti.education.entity.Ex2Final.Student2;

public class Exercise2Final {
	public void question1() {
		System.out.println(MyMath2.sum(6));
	}

	public void question2() throws Exception {
		Student2 student1 = new Student2(1, "Dung");
		System.out.println(student1);
		Student2 student2 = new Student2(2, "Duc");
		System.out.println(student2);
	}

	public void question3() {
		PrimaryStudent2.study();
		SecondaryStudent2.study();
	}
}
