package entity.Exercise1;

import java.time.LocalDate;
import java.util.Scanner;

import Utils.ScannerUtils;

public class Student {
	private static int counter = 0;
	private int id;
	private String name;
	private LocalDate birthDay;
	private int score;

	public Student() {
		InputStudent();
		setId(++counter);
	}

	public Student(String name) {
		setId(++counter);
		this.name = name;
	}

	public Student(String name, LocalDate birthDay, int score) {
		this.name = name;
		this.birthDay = birthDay;
		this.score = score;
		setId(++counter);
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private void InputStudent() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten:");
		name = ScannerUtils.inputString(scanner, "ten phai la 1 chuoi");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birthDay=" + birthDay + ", score=" + score + "]";
	}

}
