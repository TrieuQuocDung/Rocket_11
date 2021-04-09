package backend.Exercise3Generic;

import java.util.Arrays;

import entity.Exercise3.Employee;
import entity.Exercise3.Student;

public class Generic {
	public void question1() {
		Student<Integer> student1 = new Student<>(5, "Nguyen Van A");

		Student<Double> student2 = new Student<>(4.0, "Nguyen Van Dung");

		Student<Float> student3 = new Student<>(6.7f, "Nguyen Thi No");

		// Question2
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);

		// print number
		System.out.println(5);
		System.out.println(4d);
		System.out.println(6.7f);
	}

	// Question4
	public void question4() {

		Integer[] arrInt = { 1, 5, 6 };
		Float[] arrFloat = { 4f, 5f, 6f };
		Double[] arrDouble = { 5.5, 1.4, 9.5 };

		// print array
		System.out.println("Mảng Integer:" + Arrays.toString(arrInt));
		System.out.println("Mảng Float:" + Arrays.toString(arrFloat));
		System.out.println("Mảng Double:" + Arrays.toString(arrDouble));
	}
	public void question5() {
		// khởi tạo employee có salaries datatype là int
		Integer[] salaryEmployee1 = { 1000, 2000, 3000 };
		Employee<Integer> employee1 = new Employee<Integer>(1, "Đăng", salaryEmployee1);

		System.out.println("Employee vừa khởi tạo: ");
		System.out.println(employee1);
		System.out.println("Tháng lương cuối cùng của employee 1: " + salaryEmployee1[salaryEmployee1.length - 1]);

		// khởi tạo employee có salaries datatype là Float
		Float[] salaryEmployee2 = { 1000f, 2000f, 3000f, 4000f };
		Employee<Float> employee2 = new Employee<Float>(1, "Duy", salaryEmployee2);

		System.out.println("Employee vừa khởi tạo: ");
		System.out.println(employee2);
		System.out.println("Tháng lương cuối cùng của employee 2: " + salaryEmployee2[salaryEmployee2.length - 1]);

		// khởi tạo employee có salaries datatype là double
		Double[] salaryEmployee3 = { 1000d, 2000d, 3000d, 4000d, 5000d, 6000d };
		Employee<Double> employee3 = new Employee<Double>(1, "Thắng", salaryEmployee3);

		System.out.println("Employee vừa khởi tạo: ");
		System.out.println(employee3);
		System.out.println("Tháng lương cuối cùng của employee1: " + salaryEmployee3[salaryEmployee3.length - 1]);
	}
}
