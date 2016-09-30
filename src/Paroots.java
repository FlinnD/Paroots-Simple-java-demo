import java.util.Random;


public class Paroots {
	
	private int speedX, speedY, centerX, centerY;
	Random rn = new Random();
	Random rnd = new Random();
	int k = rnd.nextInt();
	int g = 0;
	
	public void update() {
		
		// Set a for loop that changes direction every 5 < i > 10 steps (incomplete).
		
		int k = rnd.nextInt(100);
		
		if(k <= 50){
			
		
		centerX += speedX;
		centerY+= speedY;
		speedX = rn.nextInt(5);
		speedY = rn.nextInt(5);
		g++;
		}
		
		else{
			
			centerX -= speedX;
			centerY-= speedY;
			speedX = rn.nextInt(5);
			speedY = rn.nextInt(5);
			g++;
			
			}
	try {
		Thread.sleep(5);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}		
		
	}

	
	
	public int getCenterX() {
		return centerX;
	}

	public int getCenterY() {
		return centerY;
	}
	
	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}

	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}
	
	

}
