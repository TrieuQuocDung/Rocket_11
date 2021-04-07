package com.vti.education.frontend;



import java.util.ArrayList;
import java.util.Scanner;

import com.vti.education.entity.Question8Ex1.Configs;
import com.vti.education.entity.Question8Ex1.HinhChuNhat;
import com.vti.education.entity.Question8Ex1.HinhTron;
import com.vti.education.entity.Question8Ex1.IHinhHoc;

public class ProgramQuestion8 {

	public static void main(String[] args) throws Exception {
		int chon;
		Scanner scanner = new Scanner(System.in);
		ArrayList<IHinhHoc> hinhHocs = new ArrayList<IHinhHoc>(Configs.SO_LUONG_HINH_TOI_DA);
		System.out.println("1.Hình Chữ Nhật \n" + "2.Hình tròn");
		while (true) {

			if (hinhHocs.size() > 5) {

				throw new Exception("Hết trứng!Chỉ đẻ tối đa 5 đứa!");
			} else
				System.out.println("Nhập lựa chọn: ");
			chon = scanner.nextInt();

			switch (chon) {
			case 1:
				System.out.println("Nhập chiều dài: ");
				float dai = scanner.nextFloat();

				System.out.println("Nhập chiều rộng: ");
				float rong = scanner.nextFloat();

				HinhChuNhat hinhChuNhat = new HinhChuNhat(dai, rong);

				hinhHocs.add(hinhChuNhat);

				break;
			case 2:

				System.out.println("Nhập bán kính hình tròn: ");
				float banKinh = scanner.nextFloat();

				HinhTron hinhTron = new HinhTron(banKinh, banKinh);
				hinhHocs.add(hinhTron);
				break;
			default:
				System.err.println("Biết đếm không vậy ba? Nhập lại đê!");
				break;
			}
		}
	}

}