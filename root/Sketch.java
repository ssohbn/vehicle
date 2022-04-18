package root;

import processing.core.PApplet;
import root.stuff.screen.Screen;
import root.stuff.screen.StartScreen;
import root.stuff.util.Size;

public class Sketch extends PApplet {

	public Screen screen = new StartScreen(this);
	public static final Size SCREEN_SIZE = new Size(640, 640);

	public void settings() {
		size(640, 640);
	}

	public void setup() {
		background(255);
	}
  
	public void keyPressed() {
		screen.handleKeydown(keyCode);
	}

	public void keyReleased() {
		screen.handleKeyup(keyCode);
	}


  public void draw() {
	screen.update();
	background(255);
	fill(255);
	screen.draw();


	screen.hud();
  }
}