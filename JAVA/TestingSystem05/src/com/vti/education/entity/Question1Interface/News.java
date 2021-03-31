package com.vti.education.entity.Question1Interface;

import java.util.Scanner;

public class News implements INews{
	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;
	private int[] rates;
	private Scanner scanner;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public float getAverageRate() {
		return averageRate;
	}

	public void setRates(int[] rates) {
		this.rates = rates;
	}

	public void inputInfo() {
		 scanner = new Scanner(System.in);
		System.out.print("M�?i bạn nhập vào Title:");
		title = scanner.nextLine();
		System.out.print("M�?i bạn nhập vào PublishDate:");
		publishDate = scanner.nextLine();
		System.out.print("M�?i bạn nhập vào Author:");
		author = scanner.nextLine();
		System.out.print("M�?i bạn nhập vào Content:");
		content = scanner.nextLine();
		

	}
	@Override
	public void display() {
		System.out.println("Title" + " " + title);
		System.out.println("PublishDate" + " " + publishDate);
		System.out.println("Author" + " " + author);
		System.out.println("Content" + " " + content);
		System.out.println("AverageRate" + " " + averageRate);
	}

	@Override
	public float calculate() {
		averageRate = (float) (rates[0] + rates[1] + rates[2]) / 3;

		return averageRate;
	}

}
