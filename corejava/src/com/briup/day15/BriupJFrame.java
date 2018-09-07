package com.briup.day15;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * �Զ����JFrame��
 * @author CLY
 *
 */
public class BriupJFrame extends JFrame{
	private static final int  DEFAULT_WIDTH= 320;
	private static final int DEFAULT_HEIGHT = 480;
	
	private String title;
	private int canvasWidth;
	private int canvasHeight;
	
	
	public BriupJFrame(String title) {
		this(title,DEFAULT_WIDTH,DEFAULT_HEIGHT);
	}
	public BriupJFrame(String title,int canvasWidth,int canvasHeight) {
		super(title);
		
		this.canvasWidth = canvasWidth;
		this.canvasHeight= canvasHeight;
		
		/*������JFrame���ÿ�ߣ���������MenuBarҲռ���˿ռ䣬
		 * ʵ�����õ�û����ô������Ӧ�ø���������
		 */
		//setSize(new Dimension(canvasWidth, canvasHeight));
		BriupCanvas briupCanvas = new BriupCanvas(true);
		briupCanvas.setPreferredSize(new Dimension(canvasWidth, canvasHeight));
		//����������������
		setContentPane(briupCanvas);
		//�������ڵĴ�С������Ӧpanel���õĴ�С
		pack();
		
		//���ڵĴ�С��������ı�
		setResizable(false);
		//���ô��ڵĹر�ģʽ�����ٹرմ��ڵ�ʱ���˳�����
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//��������Ϊ�ɼ�
		setVisible(true);
	}
	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getCanvasWidth() {
		return canvasWidth;
	}
	
	public void setCanvasWidth(int canvasWidth) {
		this.canvasWidth = canvasWidth;
	}
	
	public int getCanvasHeight() {
		return canvasHeight;
	}
	
	public void setCanvasHeight(int canvasHeight) {
		this.canvasHeight = canvasHeight;
	}
	
	private Circle[] circles;
	public void render(Circle[] circles) {
		this.circles = circles;
		repaint();
	}
	/**
	 * �Զ����һ��������
	 */
	class BriupCanvas extends JPanel{
		public BriupCanvas(Boolean b) {
			super(b);
		}
		//�ڻ�������ɻ����Ĳ���,Graphics�ǻ���
		@Override
		protected void paintComponent(Graphics g) {
//			g.drawOval(250, 250, 200, 100);
//			g.drawLine(250, 250, 300, 300);
			
//			Graphics2D g2d = (Graphics2D)g;
//			g2d.setColor(Color.GREEN);
//			//���ñʻ��Ĵֶ�
//			g2d.setStroke(new BasicStroke(10));
//			Ellipse2D ellipse2d = new Ellipse2D.Float(250.0f,250.0f ,100, 100);
//			//����Բ
//			g2d.draw(ellipse2d);
//			g2d.setColor(Color.RED);
//			
//			Ellipse2D ellipse2d2 = new Ellipse2D.Float(50.0f,50.0f ,100, 100);
//			//ʵ��Բ
//			g2d.fill(ellipse2d2);
			
			Graphics2D g2d = (Graphics2D)g;
		/*	GraphicsHelper.setColor(g2d, Color.red);
			GraphicsHelper.setStrokeWidth(g2d, 10);
			GraphicsHelper.strokeCircle(g2d, 250, 250, 250);
			GraphicsHelper.fillCircle(g2d, 250, 250, 50);*/
			if(circles != null) {
				for(Circle circle:circles) {
					if(circle.isStroke) {
						GraphicsHelper.fillCircle(g2d, circle.getX(), circle.getY(), circle.getR());
					}else {
						GraphicsHelper.strokeCircle(g2d, circle.getX(), circle.getY(), circle.getR());
					}
					
				}
			}
			
			
			
			
		}
		
	}
	
	
	/*abstract class MykeyListener implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}*/
	
	
	
}
