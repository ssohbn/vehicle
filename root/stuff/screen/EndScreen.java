package root.stuff.screen;

import java.util.ArrayList;

import root.Sketch;
import root.stuff.scores.ScoreHelper;

public class EndScreen extends Screen {
	int start;
	int score;

	public EndScreen(Sketch sketch, int score) {
		super(sketch);
		start = sketch.millis();
		this.score = score;
	}

	@Override
	public void draw() {
		
	}

	@Override
	public void update() {
		if ( sketch.millis() - start > (3 * 1000) ) {
			ScoreHelper.submitScore(score);
			sketch.screen = new StartScreen(sketch);
		}
	}

	@Override
	public void hud() {
		sketch.fill(0);
		sketch.text("you die", 40, 240);
		sketch.text("score: " + score, 40, 260);
		sketch.text("restartigng in: " + ((sketch.millis()-start)/1000), 40, 280);
		displayScores();
	}

	void displayScores() {
		ArrayList<Integer> scores = ScoreHelper.getScores();
		for ( int i = 0; i < scores.size(); i++ ) {
			sketch.text(score, 0, i*20);
		}

	}

	@Override
	public void handleKeydown(int keyCode) {
		
	}

	@Override
	public void handleKeyup(int keyCode) {
		
	}
}
