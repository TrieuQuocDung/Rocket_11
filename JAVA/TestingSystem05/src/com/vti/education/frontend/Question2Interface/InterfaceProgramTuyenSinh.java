package com.vti.education.frontend.Question2Interface;

import java.util.Scanner;

import com.vti.education.backend.Question2Interface.TuyenSinh;

public class InterfaceProgramTuyenSinh {
	public static void main(String[] args) {
		TuyenSinh tuyenSinh = new TuyenSinh();
		Scanner scanner = new Scanner(System.in);
		System.out.println("MENU \n" + "1.Thêm mới thí sinh\n" + "2.Hiển thị thông tin và khối của thí sinh \n"
				+ "3.Tìm kiếm theo số báo danh \n" + "4.Thoát khỏi chương trình");

		while (true) {
			System.out.println("Please select the function:");
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				tuyenSinh.themThiSinh();
				break;
			case 2:
				tuyenSinh.hienThiTTTS();
				break;
			case 3:
				tuyenSinh.timKiemSbd();
				break;
			case 4:
				System.out.println("Exit!");
				scanner.close();
				return;
			default:
				System.out.println("Nhập sai! Mời nhập lại!");
				break;
			}
		}
	}
}
