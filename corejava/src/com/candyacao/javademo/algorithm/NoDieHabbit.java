package com.candyacao.javademo.algorithm;

import java.util.Scanner;

public class NoDieHabbit{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("����������֪���ĵڼ����µ����ӵ��ܶ�����");
		int n = in.nextInt();
		System.out.println("��"+n + "���µ����ӵ��ܶ���Ϊ"+ fun(n));
		System.out.println("��"+n + "���µ����ӵ��ܶ���Ϊ"+ fun1(n));
		
	}
	/**
	 * ����һ���ݹ�˼��
	 * @param n
	 * @return
	 */
	public static int fun(int n) {
		if (n==1||n==2) {
			return 1;
		}else {
			return fun(n-1)+fun( n -2);
		}
	}
	
	/**
	 * ������������˼��
	 */
	
	public static int fun1(int n) {
		if(n<=1) {
			return 1;
		}
			int[] array = new int[n];
			array[0] = 1;
			array[1] = 1;
			for(int i=2;i<array.length;i++) {
				array[i] = array[i-1]+array[i-2];
			}
			return array[n-1];		
		}
	
}
