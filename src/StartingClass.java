import java.applet.Applet;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
/*
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Random;

*/

public class StartingClass extends Applet implements Runnable, KeyListener {

	
	private Image image; // put paroot images here when needed
	private Graphics second;
	private standardParoot spr;
	private ArrayList<standardParoot> stdparoots = new ArrayList<standardParoot>();
	Random rand = new Random();
	float r;
	float t;
	float b;
	//Color parootColor = new Color(r,t,b);
	
	
	@Override
	public void init() {

		setSize(800, 480);
		setBackground(Color.WHITE);
		setFocusable(true);
		addKeyListener(this);
		Frame frame = (Frame) this.getParent().getParent();
		frame.setTitle("Paroots");
		// Image Setups for paroot pictures
		
	}

	@Override
	public void start() {
		
		//spr2 = new standardParoot(700, 360);
		
			
		
		
			
		
		Thread thread = new Thread(this);
		thread.start();
		
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

	@Override
	public void run() {
	
		
		
		
		spr = new standardParoot(340, 360);
		while (true) {
		spr.update();	
		//spr2.update();
		
		r = rand.nextFloat();
	    t = rand.nextFloat();
		b = rand.nextFloat();
		
		for (int i = 0; i < stdparoots.size(); i++) {
			standardParoot sprs = (standardParoot) stdparoots.get(i);
			sprs.update();
			}
		
		
		repaint();
		
		
	
						try {
							
				Thread.sleep(17);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

}	
	
	
	
	
	@Override
	public void update(Graphics g) {
		if (image == null) {
			image = createImage(this.getWidth(), this.getHeight());
			second = image.getGraphics();
		}

		second.setColor(getBackground());
		second.fillRect(0, 0, getWidth(), getHeight());
		second.setColor(getForeground());
		paint(second);

		g.drawImage(image, 0, 0, this);

	}

	
	@Override
	public void paint(Graphics g) {
		
			
			//g.setColor(parootColor);
			//g.fillRect(spr.getCenterX(), spr.getCenterY(), 10, 10);
		
		for (int i = 0; i < stdparoots.size(); i++) {
			standardParoot sprs = (standardParoot) stdparoots.get(i);
			g.setColor(colorparoot());
			g.fillRect(sprs.getCenterX(), sprs.getCenterY(), 10, 10);
		}
		
}
		
		
			
		
		
	/*	g.setColor(Color.RED);
		g.fillRect(spr.getCenterX(), spr.getCenterY(), 10, 10);
		g.fillRect(spr2.getCenterX(), spr2.getCenterY(), 10, 10);
		
		*/
	
	
	
	public void spawnparoot() {
		standardParoot sprs = new standardParoot(340, 360);
		stdparoots.add(sprs);
	}
	
	public Color colorparoot(){
		
		Color color = new Color(r,t,b);
		
		
		return color;
		
	}
	

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_SPACE:
			
			if(stdparoots.size() <= 6){	
			spawnparoot();
			
			}
			else{
				System.out.println("No more paroots for you!");
			
	break;	
			
}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}



