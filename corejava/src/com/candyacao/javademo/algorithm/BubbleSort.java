package com.candyacao.javademo.algorithm;

/**
 * ð������
 * @author CLY
 *
 */
public class BubbleSort {
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
	 * ð������
	 * @param arr����Ҫ�������������
	 * @return���ź��������
	 */
	public static int[] arraySort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			//����һ��flag�����ڱ�ǵ��ڲ�ѭ����������ѭ�����Ƿ��з�������
			boolean flag = true;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = false;
				}
			}
			//���flagΪtrue��֤����һ��û���ٷ�����������ʱ���Խ���ѭ���������ٽ���
			if(flag) {
				break;
			}
		}
		return arr;
	}
	

}
