package com.briup.day11;

public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person();
		person.setRestDay(Weekday.MON);
		Weekday weekday=person.getRestDay();
		switch (weekday) {
		case MON :
			System.out.println("��һ��Ϣ");
			break;
		case TUE :
			System.out.println("�ܶ���Ϣ");
			break;
		default:
			break;
		}
	}

}
