package com.vti.acedamy.frontend;

import java.util.Scanner;

import com.vti.acedamy.backend.QLCB;

public class Question2 {

	public static void main(String[] args) {
		QLCB qlcb = new QLCB();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập chức năng muốn sử dụng : \n" +"1.Thêm mới cán bộ \n"
							+"2.Tìm kiếm theo họ tên \n" +"3.Hiện thị thông tin về danh sách các cán bộ \n"
							+"4.Nhập vào tên của cán bộ và delete cán bộ đó \n"+"5.Thoát khỏi chương trình.");	
		while(true) {
		System.out.println("Mời bạn nhập chức năng:");
		int choose = scanner.nextInt();
		switch (choose) {
		case 1:
			qlcb.themCanBo();
			break;
		case 2:
			qlcb.timKiemTheoTen();
			break;
		case 3:
			qlcb.hienThiThongTinCanBo();
			break;
		case 4:
			qlcb.nhapVaoVaXoaCanBo();
			break;
		case 5:
			System.out.println("Thoát khỏi chương trình");
  		     scanner.close();
			return;
			
		default:
			System.out.println("Nhập sai! Mời nhập lại!");
			break;
		}
	}

}
}
