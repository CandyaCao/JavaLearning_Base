package com.candyacao.javademo.gui.mine;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;

import javax.swing.ImageIcon;

public class GraphicsHelper {
	/**
	 * ������
	 */
	private GraphicsHelper() {
	}

	/**
	 * ���û��ʵ���ɫ
	 * 
	 * @param g2d
	 * @param color
	 */
	public static void setColor(Graphics2D g2d, Color color) {
		g2d.setColor(color);
	}

	/**
	 * ���û��ʵĴֶ�
	 * 
	 * @param g2d
	 * @param width
	 */
	public static void setStrokeWidth(Graphics2D g2d, float width) {
		BasicStroke bs = new BasicStroke(width);
		g2d.setStroke(bs);
	}

	/**
	 * ��һ�����ĵ�԰
	 * 
	 * @param g2d ����
	 * @param x   Բ�ĵĺ�����
	 * @param y   Բ�ĵ�������
	 * @param r   Բ�İ뾶
	 */
	public static void strokeCircle(Graphics2D g2d, int x, int y, int r) {

		Ellipse2D e2d = new Ellipse2D.Float(x - r, y - r, 2 * r, 2 * r);
		g2d.draw(e2d);

	}

	/**
	 * ��һ��ʵ�ĵ�Բ
	 * @param g2d     ����
	 * @param x        Բ��x������
	 * @param y        Բ��y������
	 * @param r         Բ�İ뾶
	 */
	public static void fillCircle(Graphics2D g2d, int x, int y, int r) {

		Ellipse2D e2d = new Ellipse2D.Float(x - r, y - r, 2 * r, 2 * r);
		g2d.fill(e2d);

	}
	
	/**
	 * ��ͼƬ
	 * @param g2d      ����
	 * @param img    ͼƬλ����Ϣ
	 * @param x         Ҫ��ͼƬλ�õ�x����
	 * @param y         Ҫ��ͼƬλ�õ�y����
	 */
	public static void drawImage(Graphics2D g2d,String img,int x,int y) {
		ImageIcon icon = new ImageIcon(img);
		Image image = icon.getImage();
		g2d.drawImage(image, x, y, null);

	}

	/**
	 * ����˫����
	 * @param g2d       ����
	 */
	public static void openAA(Graphics2D g2d) {
		RenderingHints hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.addRenderingHints(hints);

	}
	
	/**
	 * ����ͣ��ʱ��
	 * @param time
	 */
	public static void sleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
