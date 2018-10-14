package com.candyacao.javademo.string;

/**
 * 10000次拼接字符串的速度
 * @author CLY
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		//定义一个空字符串
		String s="";
		//获得开始时间
		long StartTime = System.currentTimeMillis();
		for(int i=0;i<10000;i++) {
			s +=i;
		}
		//结束时间
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-StartTime);
		
		//StringBuffer   开始时间
		long StartTime1 = System.currentTimeMillis();
		StringBuffer s1 =new  StringBuffer();
		for(int i=0;i<10000;i++) {
			s1.append(i);
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println(endTime1-StartTime1);
		//StringBuilder  开始时间
		long StartTime2 = System.currentTimeMillis();
		StringBuilder s2 =new  StringBuilder();
		for(int i=0;i<10000;i++) {
			s2.append(i);
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println(endTime2-StartTime2);
		//String < StringBuffer  <StringBuilder 
		System.out.println("Hello" instanceof String);
	}

}
