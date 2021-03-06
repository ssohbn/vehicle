package root.stuff.tiles.templates;

import root.Sketch;
import root.stuff.interfaces.ITile;
import root.stuff.util.Position;
import root.stuff.util.Size;

public abstract class TemplateTile implements ITile {
	protected Position position;
	protected Size size;
	protected Sketch sketch;

	public TemplateTile(Position position, Sketch sketch) {
		this.position = position;
		this.size = new Size(64, 64);
		this.sketch = sketch;
	}

	@Override
	public void draw() {
		this.sketch.rect(position.x, position.y, size.width, size.height);
	}

	@Override
	public Position getPosition() {
		return this.position;
	}

	@Override
	public Size getSize() {
		return this.size;
	}

	public void fall(int y) {
		this.position.y += y;
	}

}
