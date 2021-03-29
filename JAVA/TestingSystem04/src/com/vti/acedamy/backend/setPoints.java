package com.vti.acedamy.backend;

import java.util.Scanner;

public class setPoints {

	public void Point() {
		System.out.println("Mời nhập điểm :");
		Scanner scan = new Scanner(System.in);
		float point = scan.nextFloat();
		if(point > 0 && point < 10) {
		System.out.println("Điểm vừa nhập :" + point);
	}else {
		System.out.println("Không hợp lệ! mời nhập lại!");
	}
	}
	
}
