package com.candyacao.javademo.algorithm;

import java.util.Scanner;
/**
 * ��һ����Ȼ����ǡ�����ȥ�����������һ�������ĺ���ȣ�������������ȫ����
 * @author CLY
 *
 */
public class Perfect {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������Ҫ����ĸ���֮�ڵ���ȫ����");
		int n = scanner.nextInt();
		
		for (int i = 2; i <n; i++) {
			int sum = 0;
			//���ÿ��i�����������֮����������ӵĺ�
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum = sum + j;
				}
			}
			//�ж��Ƿ�����ȫ��
			if (i == sum) {
				System.out.println(i);
			}
		} 
	}

}
