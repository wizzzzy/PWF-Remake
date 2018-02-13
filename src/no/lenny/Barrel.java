package no.lenny;


import java.awt.*;

public class Barrel extends FloorBlock{

	public Barrel(int x, int y, ID id) {
		super(x, y, id);
	}

	@Override
	public void tick() {

	}

	@Override
	public void render(Graphics g) {
		g.setColor(new Color(110, 76, 48));
		g.fillRect(x, y, 68,68);
	}
}
