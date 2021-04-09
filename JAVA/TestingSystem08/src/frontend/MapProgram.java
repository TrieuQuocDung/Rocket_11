package frontend;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		Map<Integer, String> students = new HashMap<>();
		students.put(1, "Ashe");
		students.put(2, "Leona");
		students.put(3, "Nasus");
		students.put(4, "Leesin");
		students.put(5, "Ahir");

		for (Map.Entry<Integer, String> entry : students.entrySet()) {
			System.out.println("ID: " + entry.getKey() + " / " + "Name: " + entry.getValue());

		}

		Map<String, String> phones1 = new LinkedHashMap<>();
		phones1.put("ashe@gamil.com", "0397776864");
		phones1.put("leona@gamil.com", "0338558174");
		phones1.put("nasus@gamil.com", "0366922545");
		phones1.put("leesin@gamil.com", "0388752644");
		phones1.put("ahir@gamil.com", "0397156899");

		for (Map.Entry<String, String> entry : phones1.entrySet()) {
			System.out.println("email: " + entry.getKey() + " / " + "Số điện thoại: " + entry.getValue());

		}
		Map<Integer, String> phones2 = new LinkedHashMap<>();
		phones2.put(1, "0397776864");
		phones2.put(2, "0338558174");
		phones2.put(3, "0366922545");
		phones2.put(4, "0388752644");
		phones2.put(5, "0397156899");

		for (Map.Entry<Integer, String> entry : phones2.entrySet()) {
			System.out.println("ID: " + entry.getKey() + " / " + "Số điện thoại: " + entry.getValue());

		}
		Map<String, String> phones3 = new LinkedHashMap<>();
		phones3.put("Dũng", "0397776864");
		phones3.put("Dũng2", "0338558174");
		phones3.put("Mẹ", "0366922545");
		phones3.put("Bố", "0388752644");
		phones3.put("Vợ", "0397156899");

		for (Map.Entry<String, String> entry : phones3.entrySet()) {
			System.out.println("Name: " + entry.getKey() + " / " + "Số điện thoại: " + entry.getValue());

		}
	}
}
