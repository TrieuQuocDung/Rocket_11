package com.vti.acedamy.backend;

import com.vti.acedamy.entity.Employee;
import com.vti.acedamy.entity.Manager;
import com.vti.acedamy.entity.Phone;
import com.vti.acedamy.entity.VietnamesePhone;
import com.vti.acedamy.entity.Waiter;

public class Abstraction {
	public void question1() {
		Phone phone = new VietnamesePhone();
		phone.insertContact("Dũng Quốc", "0397776864");
		phone.removeContact("Dũng Quốc");
		phone.updateContact("Dũng Quốc", "0338558174");
		phone.searchContact("Dũng Quốc");
	}
	public void question2_3() {
		Employee employee = new Employee("Huy chó xóm", 6.9);
		employee.displayInfo();

		Manager manager = new Manager("Mạnh mé", 9.6);
		manager.displayInfo();

		Waiter waiter = new Waiter("Tùng béo", 2.6);
		waiter.displayInfo();
	}
}
