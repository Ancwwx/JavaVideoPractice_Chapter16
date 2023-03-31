package com.hspedu.draw;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawCircle extends JFrame {

	private MyPanel mp = null;

	public static void main(String[] args) {
		new DrawCircle();
	}

	public DrawCircle() {
		mp = new MyPanel();
		this.add(mp);
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

}

class MyPanel extends JPanel {
	public void paint(Graphics g) {
		super.paint(g);
//		g.drawOval(10, 10, 100, 100);
//		 System.out.println("paint方法被调用");
//		g.drawLine(10, 10, 100, 100);
//		g.drawRect(10, 10,100, 100);
//		g.setColor(Color.blue);
//		g.fillRect(10, 10,100, 100);
//		g.setColor(Color.red);
//		g.fillOval(10, 10,50, 100);
		URL path = MyPanel.class.getResource("/bg.png");
		Image image = Toolkit.getDefaultToolkit().getImage(path);
		g.drawImage(image, 10, 10, 175, 221, this);
//		g.setColor(Color.red);
//		g.setFont(new Font("隶书",Font.BOLD,50));
//		g.drawString("北京你好", 100, 100);
//		g.setColor(Color.black);
//		g.drawOval(70, 70, 20, 20);
//		g.drawRect(65, 58, 30, 50);
//
//		g.drawRect(45, 46, 20, 80);
//
//		g.drawRect(95, 46, 20, 80);
//		g.drawLine(80, 70, 80, 35);
//
//		g.setColor(Color.red);
//		g.fillOval(70, 70, 20, 20);
//		g.fillRect(65, 58, 30, 50);
//
//		g.fillRect(45, 46, 20, 80);
//
//		g.fillRect(95, 46, 20, 80);
//		g.drawLine(80, 70, 80, 35);
	}
}