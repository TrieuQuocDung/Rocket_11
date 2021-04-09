package backend.Exercise1Collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import entity.Exercise1.Student;

public class Question2 {
	public void question2() {

		System.out.println("Thứ tự student đến phỏng vấn từ sớm nhất đến muộn nhất: ");
		printStudentComeEarly();

		System.out.println("Thứ tự student đến phỏng vấn từ muộn nhất đến sớm nhất: ");
		printStudentComeLate();
	}

	public void printStudentComeEarly() {
		
		Stack<Student> students = new Stack<>();
		students.push(new Student("Nguyễn Văn A"));
		students.push(new Student("Trần Văn Nam"));
		students.push(new Student("Nguyễn Văn Huyên"));
		students.push(new Student("Nguyễn Văn Nam"));

		System.out.println(students.pop());
		System.out.println(students.pop());
		System.out.println(students.pop());
		System.out.println(students.pop());
	}

	public void printStudentComeLate() {
	
		Queue<Student> students = new LinkedList<>();
		students.add(new Student("Nguyễn Văn A"));
		students.add(new Student("Trần Văn Nam"));
		students.add(new Student("Nguyễn Văn Huyên"));
		students.add(new Student("Nguyễn Văn Nam"));

		System.out.println(students.poll());
		System.out.println(students.poll());
		System.out.println(students.poll());
		System.out.println(students.poll());

	}
}
