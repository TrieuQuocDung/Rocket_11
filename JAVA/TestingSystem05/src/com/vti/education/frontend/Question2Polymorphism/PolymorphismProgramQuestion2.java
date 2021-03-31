package com.vti.education.frontend.Question2Polymorphism;

import java.util.Scanner;

import com.vti.education.backend.Question2Polymorphism.PersonManagement;

public class PolymorphismProgramQuestion2 {

	public static void main(String[] args) {
		
		PersonManagement personManagement = new PersonManagement();
			Scanner scanner = new Scanner(System.in);
			System.out.println("MENU \n" + "1.Nhập sinh viên\n" + "2.Hiển thị thông tin sinh viên \n"
					+ "3.Xét học bổng \n" + "4.Thoát");

			while (true) {
				System.out.println("Please select the function:");
				int choose = scanner.nextInt();
				switch (choose) {
				case 1:
					personManagement.inputInfor();
					break;
				case 2:
					personManagement.showInfo();
					break;
				case 3:
					personManagement.xetHocBong();
					break;
				case 4:
					System.out.println("Thoát!");
					scanner.close();
					return;
				default:
					System.out.println("Nhập sai! Mời nhập lại!");
					break;
				}
			}
		}
	}


