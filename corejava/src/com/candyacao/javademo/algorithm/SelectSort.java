package com.candyacao.javademo.algorithm;

import java.util.Arrays;

public class SelectSort {
	
	public static void main(String[] args) {
		int[] array = {314,298,508,123,486,145};
		int[] array1 = new int[array.length];
		//Ϊ�����ݵ������ԣ����Խ�ԭʼ���鱸�ݺ��ٽ�������
		System.arraycopy(array, 0, array1, 0,array.length);
		int[] arr = arraySort(array1); 
		
		//��ǿforѭ������ӡ����
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	
	/**
	 * ѡ������
	 * @param arr����Ҫ�������������
	 * @return���ź��������
	 */
	public static int[] arraySort(int[] arr) {
	
		boolean flag = false;
		int minIndex,temp;
		for(int i=0;i<arr.length-1;i++) {
			minIndex = i;
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					minIndex = j ;
					flag = true;
				}
				
			}
			//�ж�minIndex�Ƿ��б仯
			if(flag) {
				temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		
		}
		return arr;
	}
}
