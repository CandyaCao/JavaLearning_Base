package com.briup.day19;

public class ThreadDemo2 {

	public static void main(String[] args) {

		Food1111 food = new Food1111();
		new Thread(new Producer1(food)).start();
		new Thread(new Consunmer1(food)).start();

	}

}

class Producer1 implements Runnable {

	private Food1111 food;

	public Producer1(Food1111 food) {
		// TODO Auto-generated constructor stub
		this.food = food;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 50; i++) {
			if (i % 2 == 0) {

				food.push("����", "��");

			} else {
				food.push("����", "��");
			}
		}
	}
}

class Consunmer1 implements Runnable {

	private Food1111 food;

	public Consunmer1(Food1111 food) {
		// TODO Auto-generated constructor stub
		this.food = food;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 50; i++) {
			food.pull();
		}
	}

}

class Food1111 {

	private String name;
	private String type;
	private boolean isEmpty = true;// ��ʾ������Դ�����Ƿ�Ϊ�գ����Ϊ���������������Ϊ��������

	/**
	 * ������������Դ�����д������
	 * 
	 * @param name
	 * @param type
	 */
	synchronized public void push(String name, String type) {
		try {
			while (!isEmpty) {
				this.wait();// ��ʾ��ǰ�߳��ͷ�ͬ����������ȴ����У�ֻ�ܱ������߳�������
			}
			// -------------------������ʼ---------------------
			this.name = name;
			Thread.sleep(10);
			this.type = type;
			// -------------------��������---------------------8
			isEmpty = false;// ���ù�����Դ�����ݲ�Ϊ��
			this.notify();// ����һ��������
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	synchronized public void pull() {
		try {
			while (isEmpty) {
				this.wait();
			}
			// ------------------���ѿ�ʼ------------------------
			System.out.print(name + "	");
			Thread.sleep(10);
			System.out.println(type);
			// ---------------------���ѽ���-----------------
			isEmpty = true;
			this.notify();// ����һ��������
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
