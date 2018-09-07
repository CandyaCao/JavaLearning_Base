package com.briup.day15;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * �Ի��ʵĳ��ò����ķ�װ
 * @author CLY
 *
 */
public class GraphicsHelper {
	
	private GraphicsHelper() {
		
	}
	public static void setColor(Graphics2D g2d,Color color) {
		g2d.setColor(color);
	}
	/**
	 * ���ʵĴֶ�
	 * @param g2d
	 * @param width
	 */
	public static void setStrokeWidth(Graphics2D g2d,float width) {
		g2d.setStroke(new BasicStroke(width));
	}
	/**
	 * ������Բ
	 * @param g2d ����
	 * @param x   Բ�ĵĺ�����
	 * @param y   Բ�ĵ�������
	 * @param r   �뾶
	 */
	public static void strokeCircle(Graphics2D g2d, int x, int y, int r) {
		Ellipse2D ellipse2d = new Ellipse2D.Float(x-r, y-r, 2*r, 2*r);
		g2d.draw(ellipse2d);
	}
	
	public static void fillCircle(Graphics2D g2d, int x, int y, int r) {
		Ellipse2D ellipse2d = new Ellipse2D.Float(x-r, y-r, 2*r, 2*r);
		g2d.fill(ellipse2d);
	}
}
