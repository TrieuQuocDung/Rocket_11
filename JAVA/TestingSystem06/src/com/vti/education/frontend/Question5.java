package com.vti.education.frontend;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		try {
			int age = intputAge();
			System.out.println("Tuổi của bạn là :" + age);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static int intputAge() throws Exception {
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhập vào tuổi:");
			int age = scanner.nextInt();
			scanner.close();
			return age;

		} catch (Exception e) {
		
				throw new Exception("Wrong inputing! Please input an age as int, input again");
			

		}
	}
}
