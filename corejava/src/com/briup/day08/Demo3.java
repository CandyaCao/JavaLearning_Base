package com.briup.day08;
/**
 * ����أ�ĳһ�������״�ʹ�õ�ʱ�򣬻����������صĲ���(������)
 * ��̬����һ�㲻����private���Σ���ֱ��ͨ������.����������
 * 
 * @author CLY
 *
 */
public class Demo3 {
	public static void main(String[] args) {
		
	}

}

 class Student {
	private String name;
	private int age;
	private static char sex;//static����Ӱ��Ȩ�ޣ�����Static�ᱻ�������ʵ������
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
	
}