package no.lenny;

import java.awt.*;
import java.util.Random;

public class Player extends GameObject{
	private int speed = 3;

	Random r = new Random();

	public Player(int x, int y, ID id) {
		super(x, y, id);
	}

	@Override
	public void tick() {
		x += velX;
		y += velY;

		x = Game.clamp(x, 0, Game.WIDTH -38);
		y = Game.clamp(y, 0, Game.HEIGHT -58);
	}

	@Override
	public void render(Graphics g) {
		if(id==ID.Player) {
			g.setColor(Color.blue);
		}else if(id==ID.Player2){
			g.setColor(Color.red);
		}
		g.fillRect(x, y, 32 ,32);

	}

	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
