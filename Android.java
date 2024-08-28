package UAS;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Android extends JPanel {
	 
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.green);
		
		//the body
		//(int x, int y, int width, int height)
		g.fillRect(200, 200, 120, 120);
		
		//the head
		//(int x, int y, int width, int height, int startAngle, int arcAngle)
		g.fillArc(200, 150, 120, 90, 0, 180);
		
		//the two lines above the head 
		//(int x1, int y1, int x2, int y2)
		g.drawLine(235, 165, 215, 120);
		g.drawLine(280, 165, 300, 120);
		
		//legs 
		//(int x, int y, int width, int height, int arcWidth, int arcHeight)
		g.fillRoundRect(210, 310, 30, 60, 20, 20);
		g.fillRoundRect(280, 310, 30, 60, 20, 20);
		
		//hands 
		//(int x, int y, int width, int height, int arcWidth, int arcHeight)
		g.fillRoundRect(168, 200, 30, 80, 20, 20);
		g.fillRoundRect(323, 200, 30, 80, 20, 20);
		
		//eyes
		//(int x, int y, int width, int height)
		g.setColor(Color.white);
		g.fillOval(230, 165, 10, 10);
		g.fillOval(275, 165, 10, 10);
		
		//text
		g.setColor(Color.black);
		g.setFont(new Font("Jokerman", Font.BOLD, 30));
		g.drawString("ANDROID", 185, 420);
		
		//isengbuatmulutgaris
		g.setColor(Color.white);
		g.drawLine(240, 185, 275, 185);
	
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("Android");
		frame.setSize(530, 530);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		  Android android = new Android();
		    frame.add(android);
			frame.setVisible(true);	
	}
}
