import java.util.Date;

import com.vti.acedamy.entity.Group;
import com.vti.acedamy.entity.GroupAccount;

public class Program {
	public static void main(String[] args) {
		// -------insert department---------------

		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Marketing";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Security";

		// ----insert position------------------

		Position position1 = new Position();
		position1.id = 1;
		position1.name = "DEV";

		Position position2 = new Position();
		position2.id = 2;
		position2.name = "TEST";

		Position position3 = new Position();
		position3.id = 3;
		position3.name = "PM";

		// -------insert account-------------------

		Account account1 = new Account();
		account1.id = 1;
		account1.email = "ashe@gmail.com";
		account1.username = "Ashe";
		account1.fullname = "Ashe Lisa";
		account1.department = department1;
		account1.createDate = new Date("2019/07/24");
		account1.position = position1;

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "annie@gmail.com";
		account2.username = "Annie";
		account2.fullname = "Annie Lisa";
		account2.department = department1;
		account2.createDate = new Date("2019/07/24");

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "xinzhao@gmail.com";
		account3.username = "XinZhao";
		account3.fullname = "Triệu Vân";
		account3.department = department2;
		account3.createDate = new Date("2019/07/26");

		Account account4 = new Account();
		account4.id = 4;
		account4.email = "nasus@gmail.com";
		account4.username = "Nasus";
		account4.fullname = "Nasus Darkin";
		account4.department = department3;
		account4.createDate = new Date("2019/07/27");

		Account account5 = new Account();
		account5.id = 1;
		account5.email = "leona@gmail.com";
		account5.username = "Leona";
		account5.fullname = "Leona Messi";
		account5.department = department3;
		account5.createDate = new Date("2019/07/27");

		// ----------insert group--------

		Group group1 = new Group();
		group1.id = 1;
		group1.name = "AD carry";
		group1.creatDate = new Date("2019/08/06");

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Support";
		group2.creatDate = new Date("2019/08/07");

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Jungle";
		group3.creatDate = new Date("2019/08/09");

		// ------------insert GroupAccount-------------
		
		GroupAccount groupAccount1 = new GroupAccount();
		groupAccount1.account = account1;
		groupAccount1.group = group1;
		groupAccount1.joinDate = new Date("2019/08/02");

		GroupAccount groupAccount2 = new GroupAccount();
		groupAccount2.account = account2;
		groupAccount2.group = group2;
		groupAccount2.joinDate = new Date("2019/08/03");

		GroupAccount groupAccount3 = new GroupAccount();
		groupAccount3.account = account3;
		groupAccount3.group = group3;
		groupAccount3.joinDate = new Date("2019/08/04");

		// -----------Insert TypeQuestion--------------

		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.id = 1;
		typeQuestion1.name = "Essay";

		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.id = 2;
		typeQuestion2.name = "Multiple-Choice";

		// -----------Insert CategoryQuestion------------------

		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.id = 1;
		categoryQuestion1.name = Category.JAVA;

		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.id = 2;
		categoryQuestion2.name = Category.DOTNET;

		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.id = 3;
		categoryQuestion3.name = Category.RUBY;

		// ---------Insert Question--------------------

		System.out.println(" Question1:");
		if (account2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là: " + account2.department.name);
		}
		
//		System.out.println("Question2:");
//		if(account2.groups == null) {
//			System.out.println("Nv này chưa có group");
//		}else {
//			System.out.println("Nv này đã có group");
//		}
//
//		System.out.println(" Question3:");
//		System.out.println(account2.department == null ? 
//								"Nv này chưa có PB" : 
//								"PB của Nv này là :" + account2.department.name);
		
		
		System.out.println(" Question4:");
		System.out.println(account1.position.name == "JAVA"  ? "Đây là Developer" : "Người này không phải là Developer");

//		System.out.println(" Question5:");
//		switch (account1.groups.length) {
//		case 1:
//			System.out.println("Nhóm có 1 thành viên");
//			break;
//		case 2:
//			System.out.println("Nhóm có 2 thành viên");
//			break;
//		case 3:
//			System.out.println("Nhóm có 3 thành viên");
//			break;
//
//		default:
//			System.out.println("Nhóm có nhiều thành viên");
//			break;
//		}
		

		
	// in tất cả số lẻ từ 0 đến 100
		
//		int n=100;
//		for(int i=1 ;i <= n; i =i+2) {
//			System.out.print(i);
//		}
//		
//		System.out.println(" Question10:");
//		
//		Account [] accounts = {account1 , account2 , account3};
//		for (int i = 0; i < accounts.length; i++) {
//			System.out.println("Thông tin account thứ "+ (i+1)+ "là:");
//			System.out.println("Email:"+accounts[i].email);
//			System.out.println("Fullname:"+accounts[i].fullname);
//			System.out.println("Department:"+accounts[i].department.name);
//			
//		}
		
	}
}
