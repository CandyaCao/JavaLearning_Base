package com.briup.day10;
/**
 * �ڲ��ࣺ��Ա�ڲ��࣬�ֲ��ڲ��࣬��̬�ڲ��࣬�����ڲ���
 * ���壺��һ���౻������ĳһ������ڲ�
 * ��Ա�ڲ��ࣺ��ʵ���ǰ��ඨ����������ĳ�Աλ��
 * �ڲ����ڱ������Ҳ������.class�ļ��������ⲿ����$�ڲ�����.classȥ������
 * ��Ա�ڲ�����������������ⲿ������г�Ա���Ժͳ�Ա����������private��Ա�;�̬��Ա����
 * @author CLY
 *
 */
public class Demo1 {
	
}

/**
 * B��A���ڲ��࣬A��B���ⲿ���������
 * @author CLY
 *
 */
class Outter{
	 int a =10;
	class Inner{
		 int a =20;
		public void function() {
			 int a =30;
			System.out.println(a);
		}
	}
	
	public void method() {
		
	}
}
