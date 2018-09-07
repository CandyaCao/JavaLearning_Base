package com.briup.day19;

/**
 * �����ߺ������� 1. ������������ �� ԭ���� �����������ǲ�ͬ���ģ� ���������������������Ǿͱ����ѣ�
 * ����������Ѿͱ���������push��pull�������� 2. �����ظ� ԭ�򣺳������ظ��������ظ����ѵĹ���
 * ����������ж�������û�У������������߳��໥�ȴ����໥����
 * 
 * @author CLY
 *
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		// ������Դ
		Food f = new Food();
		new Thread(new Producer(f)).start();
		new Thread(new Consumer(f)).start();
	}

}
/**
 * ������
 * 
 * @author CLY
 *
 */
class Consumer implements Runnable {
	Food food;
	public Consumer(Food food) {
		this.food = food;
	}
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			food.pull();
		}
	}

}
/**
 * ������
 * 
 * @author CLY
 *
 */
class Producer implements Runnable {
	Food food;

	public Producer(Food food) {
		this.food = food;
	}
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			if (i % 2 == 0) {
				food.push("����", "��ɳ"+i);
			} else {
				food.push("����", "������˿"+i);
			}
		}

	}

}

/**
 * ��������
 * 
 * @author CLY
 *
 */
class Food {
	String name; // ����
	String type; // ����
	private boolean isEmpty = true;
	/**
	 * ����ʳ��ķ�ʽ
	 */

	synchronized public void push(String name, String type) {
		try {
		while (isEmpty) {
			this.name = name;
			this.type = type;
			isEmpty = !isEmpty;
			this.notify();
		 } 
				this.wait();
			//	this.notifyAll();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	/**
	 * ����ʳ��ķ���
	 */
	synchronized public void pull() {
		try {
		while(isEmpty) {
			this.wait();	
		} 
		System.out.println("name:" + name + "         type" + type);
		isEmpty = !isEmpty;
		this.notify();
			//	this.notifyAll();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
