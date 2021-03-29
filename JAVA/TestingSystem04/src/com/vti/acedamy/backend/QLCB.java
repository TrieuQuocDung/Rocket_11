package com.vti.acedamy.backend;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.acedamy.entity.canBo;
import com.vti.acedamy.entity.congNhan;
import com.vti.acedamy.entity.kySu;
import com.vti.acedamy.entity.nhanVien;

public class QLCB {
	private List<canBo> canbos;
	private Scanner scanner;
	public QLCB() {
		canbos = new ArrayList<>();
		scanner = new Scanner(System.in);
	}
	
	public  void themCanBo() {
		System.out.println("Bạn muốn thêm cán bộ nào? (1.Kĩ sư 2.Công Nhân 3.Nhân Viên)");
		int choose = scanner.nextInt();
		scanner.nextLine();
		switch (choose) {
		case 1:
			kySu ks = new kySu();
			canbos.add(ks);
			System.out.println("Thêm kỹ sư thành công!");
			break;
		case 2:
			congNhan cn = new congNhan();
			canbos.add(cn);
			System.out.println("Thêm công nhân thành công!");
			break;
		case 3:
			nhanVien c = new nhanVien();
			canbos.add(c);
			System.out.println("Thêm nhân viên thành công!");
			break;
		default:
			break;
		}
		

	}
	public  void timKiemTheoTen() {
		Scanner scanner = new Scanner(System.in);

		String hoTen;
		System.out.print("Nhập tên cần tìm: ");
		hoTen = scanner.nextLine();

		for (canBo canBo : canbos) {
			if (hoTen.equals(canBo.getName())) {
				System.out.println("Có cán bộ"+ " " + hoTen);
			}else {
				System.out.println("Không có cán bộ nào tên" +" "+ hoTen);
			}
		}

	}
	public  void hienThiThongTinCanBo() {
		for (canBo canBo : canbos) {
			canBo.showInfo();
		}

	}
	public  void nhapVaoVaXoaCanBo() {
		Scanner scanner = new Scanner(System.in);
		String hoTen;
		System.out.println("Nhập họ tên cần xóa: ");
		hoTen = scanner.nextLine();
		// xóa cán bộ 
		canbos.removeIf(cb -> hoTen.equals(cb.getName()));
		System.out.println("Đã xóa"+" "+ hoTen);
	}
}
