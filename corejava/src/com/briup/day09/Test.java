package com.briup.day09;

public class Test {
	public static void main(String[] args) {
		
		A a = new B();
		
	}
}

class A{
	protected String name = "lisi";
	public A() {
		System.out.println("���๹����A");
		System.out.println("���๹����A�е���test������ʼ,����������д��test������������ִ�������test����");
		test();
		System.out.println("���๹����A�е���test��������");
	}
	public void test(){
		
	}
	
}

class B extends A{
	private String name = "tom";
	{
		System.out.println("���������������:"+name);
	}
	public B() {
		System.out.println("���๹����B");
	}
	public void test(){
		
		System.out.println("test������:this.name="+this.name);
		System.out.println("test������:super.name="+super.name);
		
	}
	
}
