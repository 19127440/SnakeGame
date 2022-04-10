import java.awt.Rectangle;
import java.util.Random;

public class Food {
	private int x;
	private int y;
	
	public Food(Snake player)
	{
		newFood();
	}
	
	public void newFood()
	{
		x = (new Random()).nextInt((int)(Game.width));
		y = (new Random()).nextInt((int)(Game.height));
	}
	
	public void random_spawn(Snake player)
	{		
		boolean onSnake = true;
		while(onSnake)
		{
			onSnake = false;
			newFood();
			
			for (Rectangle r : player.getBody())
			{
				if(r.x == x && r.y == y)
				{
					onSnake = true;
				}
			}
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
