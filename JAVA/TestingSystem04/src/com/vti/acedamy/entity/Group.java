package com.vti.acedamy.entity;
import java.util.Date;

public class Group {
	private int id;
	private String name;
	private Account creator;
	private Date creatDate;
	GroupAccount[] accounts;
	String[] usernames;

	  public Group(){
		 
	 }
	 Group(int id ,String name, Account creator,Date creatDate, GroupAccount[] accounts ){
		 this.id=id;
		 this.name=name;
		 this.creator=creator;
		 this.creatDate=creatDate;
		 this.accounts=accounts;
		 
	 	}
	 Group(int id ,String name, Account creator,Date creatDate, String[] usernames ){
		 this.id=id;
		 this.name=name;
		 this.creator=creator;
		 this.creatDate=creatDate;
		 this.usernames=usernames;
	}
}
	 
	
