package com.candyacao.javademo.string;

/**
 * 10000���ַ�����ƴ��
 * @author CLY
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		//��ͨƴ��
		String s="";
		//��ʼʱ��
		long StartTime = System.currentTimeMillis();
		for(int i=0;i<10000;i++) {
			s +=i;
		}
		//����ʱ��
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-StartTime);
		
		//StringBuffer   �̰߳�ȫ 
		long StartTime1 = System.currentTimeMillis();
		StringBuffer s1 =new  StringBuffer();
		for(int i=0;i<10000;i++) {
			s1.append(i);
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println(endTime1-StartTime1);
		//StringBuilder  �̲߳���ȫ   Ч�ʸ���
		long StartTime2 = System.currentTimeMillis();
		StringBuilder s2 =new  StringBuilder();
		for(int i=0;i<10000;i++) {
			s2.append(i);
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println(endTime2-StartTime2);
		//Ч�ʣ���ͨƴ�� < StringBuffer  <StringBuilder 
		System.out.println("Hello" instanceof String);
	}

}
