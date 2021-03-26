package com.vti.acedamy.backend;

import java.util.Scanner;

public class setPoints {

	public void Point() {
		System.out.println("Mời nhập điểm :");
		Scanner scan = new Scanner(System.in);
		float point = scan.nextFloat();
		System.out.println("Điểm vừa nhập :" + point);
	}
	
}
