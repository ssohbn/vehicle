package stuff.screen;

import processing.core.PApplet;
import stuff.interfaces.IView;

public class StartScreen implements IView {

	@Override
	public void draw(PApplet sketch) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(PApplet sketch) {
		// TODO Auto-generated method stub
	}

	@Override
	public void hud(PApplet sketch) {
		sketch.fill(0);
		sketch.text("welcome to videogame", 40, 240);
		
	}

	@Override
	public void handleKeydown(PApplet sketch, int keyCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleKeyup(PApplet sketch, int keyCode) {
		// TODO Auto-generated method stub
		
	}

	
}
