package com.briup.day18;

public class ThreadDemo3 {
	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();
		myThread.start();
		
		for(int i=0;i<50;i++) {
			Thread.sleep(200);
			System.out.println("����Ϸ");
		}
	}

}

/**
 * 1. ��������A�̳�Thread�ࣺ���߳��ࣩ
 * 2. ����A����дThread��run����
 * 3. ��run��д��Ҫ�߳�ִ�еĴ���
 * 4. ��main������
 * @author CLY
 *
 */
class MyThread extends Thread{
	
	public void run() {
		for(int i= 0;i<50;i++) {
			try {
				sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("������");
		}
	}
}
