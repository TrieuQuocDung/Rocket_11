package com.vti.education.backend.Question1Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.education.entity.Question1Interface.INews;
import com.vti.education.entity.Question1Interface.News;

public class MyNews {
	private List<News> newsList;
	private Scanner scanner;

	public MyNews() {
		newsList = new ArrayList<>();
		scanner = new Scanner(System.in);
	}
	
	public void insertNews() {
		News news = new News();
		int[] rates = new int[3];

		scanner = new Scanner(System.in);
		news.inputInfo();
		System.out.println("Nhập 3 đánh giá: ");
		for (int i = 0; i < 3; i++) {
			System.out.println("�?ánh giá " + (i + 1) + ": ");
			rates[i] = scanner.nextInt();
		}
		news.setRates(rates);
		newsList.add(news);
	}

	public void viewListNews() {
		for (News news : newsList) {
			news.display();
		}
	}

	public void averageRate() {
		for (News news : newsList) {
			System.out.println("Title: " + news.getTitle() + " / Average Rate: " + news.calculate());
		}
	}
}