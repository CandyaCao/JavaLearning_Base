package com.briup.day11;

import java.util.Scanner;
/**
 * ��֤���ʵ��
 * @author CLY
 *
 */
public class Identy {
	public static final String date = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	public static void main(String[] args) {
		char[] array = new char[4];
		for(int i =0;i<4;i++) {
			int random = (int)(Math.random()*date.length());
			array[i] = date.charAt(random);
			
		}
		
		String passwd = new String(array);
		System.out.println("��֤���ǣ�" + passwd);
		System.out.println("��������֤��");
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		if (passwd.equalsIgnoreCase(in)) {
			System.out.println("��֤�ɹ�");
		}else {
			while(true) {
	
				in = sc.next();
				
			}
		}
		
	}

}
