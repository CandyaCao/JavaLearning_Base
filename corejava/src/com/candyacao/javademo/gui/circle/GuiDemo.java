package com.candyacao.javademo.gui.circle;

import java.awt.Dimension;

import javax.swing.JFrame;

public class GuiDemo {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		//���ô�С
		jFrame.setSize(new Dimension(500, 500));
		//���ڵĴ�С��������ı�
		jFrame.setResizable(false);
		//���ô��ڵĹر�ģʽ�����ٹرմ��ڵ�ʱ���˳�����
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
		//��������Ϊ�ɼ�
		jFrame.setVisible(true);
	}

}
