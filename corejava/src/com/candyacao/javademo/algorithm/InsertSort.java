package com.candyacao.javademo.algorithm;

public class InsertSort {
	
	public static void main(String[] args) {
		int[] array = {3,5,20,13,24,6,48,28};
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
	 * ��������
	 * @param arr
	 * @return
	 */
	public static int[] arraySort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			
		}
		return arr;
	}

}
