package no.lenny;

import java.awt.*;

public class Map extends GameObject{
	private int rad;
	private int kol;
	private int blockSize=32;
	private FloorBlock blockType;

	public Map(int x, int y, ID id, FloorBlock blockType) {
		super(x, y, id);
		this.blockType = blockType;

	}

	public void generateLevel(int size){
		kol = size;
		rad = size;

		for(int i=0; i<kol*rad; i++){
			int blockY = (int) Math.floor(i/rad);
			int blockX = i - (blockY * rad);
			int blockType;

			if(blockX == 0 || blockX == kol -1 || blockY == 0 || blockY == rad -1 || (blockX % 2 == 0 && blockY % 2 == 0)){
				blockType = 1;
			} else {
				blockType = tonne(blockX,blockY);
			}
			Game.addMapPiece(x,y,ID.Map,blockType);
		}
	}

	public FloorBlock nrTilClass(int nr){
		if(nr==1){
			//handler.addObject();
			//return (Barrel barrel = new Barrel();
		}else if(nr==2){
			//Tonne
		}else{
			//Asfalt
		}
		return null;
	}

	public int tonne(int x, int y){
		int block;

		if((y == 1 && x <= 3) || (y == 1 && x >= rad -4) ||
				(y == kol-2 && x <= 3) || (y == kol-2 && x >= rad -4) ||
				(x == 1 && y <= 3) || (x == 1 && y >= kol -4) ||
				(x == rad-2 && y <= 3) || (x == rad-2 && y >= kol -4)){
			block = 3;
		}
		else {
			int prosent = (int) Math.floor(30+ 450/kol);
			int done = (int) Math.floor(Math.random() * 100);
			block = done > prosent ? 3 : 2;
		}
		return block;
	}

	@Override
	public void tick() {

	}

	@Override
	public void render(Graphics g) {

	}
}
