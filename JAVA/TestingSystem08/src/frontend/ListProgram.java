package frontend;

import java.util.Scanner;

import backend.Exercise1Collection.Question1;

public class ListProgram {

	public static void main(String[] args) {
		Question1();
	}

	private static void Question1() {

		Question1 Q1 = new Question1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập chức năng muốn sử dụng : \n" 
				+ "1.In ra tổng số phần tử của students \n"
				+ "2.Lấy phần tử thứ 4 của students \n" 
				+ "3.In ra phần tử đầu và phần tử cuối của students \n"
				+ "4.Thêm 1 phần tử vào vị trí đầu của students \n" 
				+ "5.Thêm 1 phần tử vào vị trí cuối của students \n"
				+ "6.Đảo ngược vị trí của students \n"
				+ "7.Tạo 1 method tìm kiếm student theo id \n"
				+ "8.Tạo 1 method tìm kiếm student theo name \n"
				+ "9.Tạo 1 method để in ra các student có trùng tên \n"
				+ "10.Xóa name của student có id = 2\n"
				+ "11.Delete student có id = 5\n"
				+ "12.Tạo 1 ArrayList tên là studentCopies và add tất cả students vào studentCopies \n"
				+ "13.Thoát khỏi chương trình.");
		while (true) {
			System.out.println("Mời bạn nhập chức năng:");
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				Q1.getAmountOfStudent();
				break;
			case 2:
				Q1.getIndex4OfStudent();
				break;
			case 3:
				Q1.printFirstAndLastStudent();
				break;
			case 4:
				Q1.addStudentIntoFirstStudents();
				break;
			case 5:
				Q1.addStudentIntoLastStudents();
				break;
			case 6:
				Q1.reverseStudents();
				break;
			case 7:
				Q1.findStudentById();
				break;
			case 8:
				Q1.findStudentByName();
				break;
			case 9:
				Q1.findDuplicateStudent();
				break;
			case 10:
				Q1.deleteNameStudentId2();
				break;
			case 11:
				Q1.deleteStudentId5();
				break;
			case 12:
				Q1.addAllStudentsToStudentCopies();
				break;
			case 13:
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
