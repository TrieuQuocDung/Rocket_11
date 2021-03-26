package com.vti.acedamy.frontend;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		String name;
		float point;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nhập tên học sinh:");
		name = scan.nextLine();
		System.out.println("Nhập điểm:");
		point = scan.nextFloat();
		
		System.out.println("Họ Tên:" + name);
		System.out.println("Điểm:" + point);
		
		if(point < 4) {
			System.out.println("Học lực yếu");
		}else if(point > 4 && point < 6) {
			System.out.println("Học lực trung Bình");
		}else if(point > 6 && point < 8){
			System.out.println("Học lực Khá");
		}else {
			System.out.println("Học lực Giỏi");
		}
			
	}
}
