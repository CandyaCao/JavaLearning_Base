package com.candyacao.javademo.algorithm;

import java.util.Scanner;
/**
 * ������������������Լ������С������
 * @author CLY
 *
 */
public class GcdLcm {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("������������Ҫ�����Լ������С��������������");
		int num1= scanner.nextInt();
		int num2=scanner.nextInt();
		//��󹫱�����ʼ��
		int gcd = 0;
		//��С��Լ����ʼ��
		int lcm = 0;
		if(num1<num2) {
			for(int i=num1;i>1;i--) {
				if((num1%i==0) && (num2%i==0)) {
					 gcd = i;
					int shang1=num1/i;
					int shang2=num2/i;
					lcm = i*shang1*shang2;
					break;
				}
			}
		}
		else {
			for(int i=num2;i>1;i--) {
				if((num1%i==0) && (num2%i==0)) {
					gcd = i;
					int shang1=num1/i;
					int shang2=num2/i;
					lcm = i*shang1*shang2;
					break;
				}
			}
		}
		System.out.println("�������������Լ��Ϊ��"+ gcd);
		System.out.println("������������С������Ϊ��"+ lcm);
	}

}
