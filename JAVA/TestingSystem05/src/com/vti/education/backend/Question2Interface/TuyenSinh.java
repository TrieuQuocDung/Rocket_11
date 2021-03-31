package com.vti.education.backend.Question2Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.education.entity.Question2Interface.ITuyenSinh;
import com.vti.education.entity.Question2Interface.ThiSinh;
import com.vti.education.entity.Question2Interface.ThiSinhKhoiA;
import com.vti.education.entity.Question2Interface.ThiSinhKhoiB;
import com.vti.education.entity.Question2Interface.ThiSinhKhoiC;



public class TuyenSinh implements ITuyenSinh{
	private List<ThiSinh> thisinhs;
	private Scanner scanner;

	public TuyenSinh() {
		thisinhs = new ArrayList<>();
		scanner = new Scanner(System.in);
	}
	
	@Override
	public void themThiSinh() {
		System.out.println("Bạn muốn thêm thí sinh khối nào? (1.Khối A 2.Khối B 3.Khối C)");
		int choose = scanner.nextInt();
		scanner.nextLine();
		switch (choose) {
		case 1:
			ThiSinhKhoiA kA = new ThiSinhKhoiA();
			thisinhs.add(kA);
			System.out.println("Thêm thí sinh khối A thành công!");
			break;
		case 2:
			ThiSinhKhoiB kB = new ThiSinhKhoiB();
			thisinhs.add(kB);
			System.out.println("Thêm thí sinh khối B thành công!");
			break;
		case 3:
			ThiSinhKhoiC kC = new ThiSinhKhoiC();
			thisinhs.add(kC);
			System.out.println("Thêm thí sinh khối C thành công!");
		default:
			break;
		}
	}

	@Override
	public void hienThiTTTS() {
		for (ThiSinh ts : thisinhs) {
			ts.showInfo();
			
		}
	}

	@Override
	public void timKiemSbd() {

		System.out.println("Nhập sbd cần tìm: ");
		String sbd = scanner.nextLine();
		for (ThiSinh ts : thisinhs) {
			if (sbd.equals(ts.getSoBaoDanh())) {
				ts.showInfo();
			}else {
				System.out.println("Không có thí sinh có sbd:" +" "+ sbd);
			}
		}
	}
}
