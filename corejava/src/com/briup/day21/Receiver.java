package com.briup.day21;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Date;

/** ��ܵ������д���ݵ��߳� */
class Sender extends Thread {
	private PipedOutputStream out = new PipedOutputStream();

	public PipedOutputStream getPipedOutputStream() {
		return out;
	}

	@Override
	public void run() {

		try {
			for (int i = -127; i <= 128; i++) {
				out.write(i);
				yield();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

/**�ӹܵ������������ݵ��߳�*/
public class Receiver extends Thread{
	private PipedInputStream in;
	public Receiver(Sender sender) throws IOException {
		in = new PipedInputStream(sender.getPipedOutputStream());
	}
	
	@Override
	public void run() {
		int data;
		try {
			while((data = in.read())!=-1) {
				System.out.print(data+"   ");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Sender sender = new Sender();
		Receiver receiver = null;
		try {
		 receiver = new Receiver(sender);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sender.start();
		receiver.start();
	}

}
