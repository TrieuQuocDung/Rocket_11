package com.vti.education.frontend.Question1Interface;

import java.util.Scanner;

import com.vti.education.backend.Question1Interface.MyNews;


public class InterfaceProgramMyNews{
	public static void main(String[] args) {
		MyNews myNews = new MyNews();
		Scanner scanner = new Scanner(System.in);
		System.out.println("MENU \n" + "1.Insert news\n" + "2.View list news \n"
				+ "3.Average rate \n" + "4.Exit");

		while (true) {
			System.out.println("Please select the function:");
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				myNews.insertNews();
				break;
			case 2:
				myNews.viewListNews();
				break;
			case 3:
				myNews.averageRate();
				break;
			case 4:
				System.out.println("Exit!");
				scanner.close();
				return;
			default:
				System.out.println("Nhập sai! M�?i nhập lại!");
				break;
			}
		}
	}
}
